/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

/**
 *
 * @author oscfr
 */
   
public class vuelo{
    boolean tarde;
    type tipo;
    int id;
    String estado;

    public vuelo(int tipo, int tiempo, int id) {
        if (tipo == 0){
            this.tipo = type.CARGA; 
        }
        if (tipo == 1){
            this.tipo = type.PASAJEROS; 
        }
        if (tipo == 2){
            this.tipo = type.PRIVADO; 
        }
        if (tiempo == 0){
            tarde = false;
        }
        if (tiempo == 1){
            tarde = true;
        }
        this.id = id;
        this.estado = "Por aterrizar";
    }
}
enum type {
        CARGA,
        PASAJEROS,
        PRIVADO
} 
