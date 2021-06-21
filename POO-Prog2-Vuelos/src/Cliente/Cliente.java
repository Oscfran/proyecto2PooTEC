/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.net.Socket;
import javax.swing.JOptionPane;


class Cliente {
    Socket socketRef;
    ClientForm refPantalla;
    public ThreadCliente hiloCliente;

    public Cliente(ClientForm refPantalla) {
        this.refPantalla = refPantalla;
        refPantalla.setRefCliente(this);
    }
    
    public void conectar(){
 
        try{
            socketRef = new Socket("localhost", 35775);
            hiloCliente = new ThreadCliente(socketRef, refPantalla);
            hiloCliente.start();
            
            hiloCliente.writer.writeInt(1);
            hiloCliente.writer.writeUTF("Simulador de Vuelos"); 
            refPantalla.setTitle("Simulador de Vuelos");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
}
