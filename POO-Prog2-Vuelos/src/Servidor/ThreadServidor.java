/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;


class ThreadServidor extends Thread{
    private int id;
    private Socket socketRef;
    private DataInputStream reader;
    private DataOutputStream writer;
    private String nombre;
    private boolean running = true;
    Servidor server;

    public ThreadServidor(Socket socketRef, Servidor server, int id) throws IOException {
        this.socketRef = socketRef;
        reader = new DataInputStream(socketRef.getInputStream());
        writer = new DataOutputStream(socketRef.getOutputStream());
        this.server = server;
        this.id = id;
    }
    
    public void run (){
        
        int instruccionId = 1;
        while (running){
            try {
                instruccionId = reader.readInt(); // esperar hasta que reciba un entero
                
                switch (instruccionId){
                    case 1: // pasan el nombre del usuario
                        nombre = reader.readUTF();      
 
                    break;
                    case 2: // pasan un mensaje por el chat
                        String mensaje = reader.readUTF();
                        
                        for (int i = 0; i < server.conexiones.size(); i++) {
                            ThreadServidor current = server.conexiones.get(i);
                            current.writer.writeInt(2);
                            current.writer.writeUTF(nombre);
                            current.writer.writeUTF(mensaje);
                        }
                        
                    break;
                    case 3: //Crear vuelo
                        int tipo = reader.readInt();
                        int tiempo = reader.readInt();
                        vuelo vl = new vuelo(tipo, tiempo, server.total);
                        server.total += 1;
                        server.cola.add(vl);
                        server.vuelos.add(vl);
                        for (int i = 0; i < server.conexiones.size(); i++) {
                            ThreadServidor current = server.conexiones.get(i);
                            current.writer.writeInt(2);
                            current.writer.writeUTF(nombre);
                            current.writer.writeUTF("tipo:"+tipo + "  tiempo:" + tiempo);
                        }
                        server.refPantalla.addMensajeColas();
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        server.refPantalla.addMensaje("Llegada:" + dtf.format(LocalDateTime.now()) + "Tipo: "+ vl.tipo +"  Tarde :" + vl.tarde);
                    break;
                    case 4:
                       server.iniciarPartida();
                       for (int i = 0; i < server.conexiones.size(); i++) {
                            ThreadServidor current = server.conexiones.get(i);
                            current.writer.writeInt(4);
                            
                       }
                       
                    break;
                    
                    
                }
            } catch (IOException ex) {
                
            }
        }
    }    
    
    
}
