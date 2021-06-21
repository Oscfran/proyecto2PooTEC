/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;	
import java.util.LinkedList;
import java.util.Queue;

public class Servidor {
        
    ServerForm refPantalla;
    public ArrayList<ThreadServidor> conexiones;
    private boolean running = true;
    private ServerSocket srv;
    public boolean puerta;
    public boolean puerta1;
    public boolean puerta2;
    public boolean puerta3;
    public boolean puerta4;
    public int esperados;
    public int terminado;
    public int total;
    ArrayList<vuelo> vuelos = new ArrayList<vuelo>();
    public Queue<vuelo> cola;
    public Queue<vuelo> colaAG;
    public Queue<vuelo> colaAM;
    public Queue<vuelo> colaAP;
    public Queue<vuelo> colap;
    public Queue<vuelo> colap1;
    public Queue<vuelo> colap2;
    public Queue<vuelo> colap3;
    public Queue<vuelo> colap4;
    private boolean partidaIniciada = false;
    public int lanzamientoInicial[] = new int[6];

    public Servidor(ServerForm refPantalla) {
        this.refPantalla = refPantalla;
        conexiones = new ArrayList<ThreadServidor>();
        this.refPantalla.setSrv(this);
        this.esperados = 0;
        this.terminado = 0;
        this.total = 0;
        this.puerta = false;
        this.puerta1 = false;
        this.puerta2 = false;
        this.puerta3 = false;
        this.puerta4 = false;
        this.cola = new LinkedList();
        this.colaAG = new LinkedList();
        this.colaAM = new LinkedList();
        this.colaAP = new LinkedList();
        this.colap = new LinkedList();
        this.colap1 = new LinkedList();
        this.colap2 = new LinkedList();
        this.colap3 = new LinkedList();
        this.colap4 = new LinkedList();
    }
    
    
    public String printArregloDados(){
        String str = "Arreglo:  ";
        for (int i = 0; i < conexiones.size(); i++) {
            str += lanzamientoInicial[i] + "   ";
        }
        return str;
    }
    
    public void iniciarPartida(){
        this.partidaIniciada = true;
    }
    
    
    
    public void stopserver(){
        running = false;
    }
    
    public void runServer() throws IOException{
        
        int contador = 0;
        srv = new ServerSocket(35775);
        
        while(running){
            refPantalla.addMensaje(".: Esperando conexiones");
            Socket refSocket = srv.accept();
            
            if(!partidaIniciada){
                refPantalla.addMensaje(".: Conexion realizada: " + (++contador));

                // Thread
                ThreadServidor newThread = new ThreadServidor(refSocket, this, conexiones.size());
                conexiones.add(newThread);
                newThread.start();
            }
            else
                refPantalla.addMensaje(".: Conexion denegada, partida ya inicio");
        }
    }
    
    
}
