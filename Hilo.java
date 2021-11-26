/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSP_T1_Multihilo_Animales;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vespertino
 */
public class Hilo implements Runnable{
    private Carrera v;
    private String animal;
    private int tiempo;
    
    public Hilo(Carrera v,String animal,int tiempo) {
        this.v = v;
        this.tiempo = tiempo;
        this.animal = animal;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(tiempo);
                v.setMensaje(animal,i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
}
