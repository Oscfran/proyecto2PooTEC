/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


class ThreadCliente extends Thread{
    private Socket socketRef;
    public DataInputStream reader;
    public DataOutputStream writer;
    private String nombre;
    private boolean running = true;
    private ClientForm  refPantalla;
    private int id ;
    private int turnoActual = 0;

    public ThreadCliente(Socket socketRef, ClientForm refPantalla) throws IOException {
        this.socketRef = socketRef;
        reader = new DataInputStream(socketRef.getInputStream());
        writer = new DataOutputStream(socketRef.getOutputStream());
        this.refPantalla = refPantalla;
    }
    
    public void run (){
        
        int instruccionId = 1;
        while (running){
            try {
                instruccionId = reader.readInt(); // esperar hasta que reciba un entero
                
                switch (instruccionId){
                    case 1: 

                    break;
                    case 2:
                        String usuario = reader.readUTF();
                        String mensaje = reader.readUTF();
                        refPantalla.addMensaje(usuario+"> " + mensaje);
                    break;
                    case 3: 
                        String usuario2 = reader.readUTF();
                        int dado1 = reader.readInt();
                        int dado2 = reader.readInt();
                        this.turnoActual = reader.readInt();
                        refPantalla.pintarSiguienteTurno (reader.readUTF());
                        refPantalla.pintarDados(dado1, dado2, usuario2);
                    break;
                    case 4: //partida iniciada
                        refPantalla.pintarPartidaIniciada();
                        
                        break;
                }
            } catch (IOException ex) {
                
            }
        }
    }

    public int getIdentificador() {
        return id;
    }

    public int getTurnoActual() {
        return turnoActual;
    }
    
    
    
    
    
    
    
    
}
