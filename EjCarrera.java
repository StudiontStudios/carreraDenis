/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSP_T1_Multihilo_Animales;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Vespertino
 */
public class EjCarrera extends JFrame  {
    private JList jl1,jl2,jl3,jl4;
    private DefaultListModel l1,l2,l3,l4;
    private GridLayout g1;
    private JButton jbComenzar;
    private JPanel jp1,jp2;
    private BorderLayout bl1;
    
    
    public EjCarrera(){
    
    iniciarListas();
    iniciarDefList();
    g1 = new GridLayout();
    jbComenzar = new JButton();
    iniciarPaneles();
    bl1 = new BorderLayout();
    
    
    jp1.setLayout(g1);
    jp2.setLayout(new FlowLayout());
    getContentPane().setLayout(g1);
    
    
    jp1.add(jl1);jp1.add(jl2);jp1.add(jl3);jp2.add(jl4);
    

}
 
    private void iniciarListas(){
        jl1 = new JList();
        jl2 = new JList();
        jl3 = new JList();
        jl4 = new JList();
    }
    
    private void iniciarDefList(){
        l1 = new DefaultListModel();
        l2 = new DefaultListModel();
        l3 = new DefaultListModel();
        l4 = new DefaultListModel();  
    }
    
    private void iniciarPaneles(){
        jp1 = new JPanel();
        jp2 = new JPanel();
        
        getContentPane().add(jp1,BorderLayout.CENTER);
        getContentPane().add(jp2,BorderLayout.SOUTH);  
    }
    

    public void setMensaje(String animal,int i){
        if(animal.equals("Tortuga")){
            l1.addElement("Tortuga paso :" + i);
        }else if(animal.equals("Liebre")){
            l2.addElement("Liebre paso :" + i);
        }else if(animal.equals("Caballo")){
            l3.addElement("Caballo paso :" + i);
        }else if(animal.equals("Guepardo")){
            l4.addElement("Guepardo paso :" + i);
        }
    }
    
    
    
//    public void clickBoton(){
////        Hilo hTortuga = new Hilo (this,"Tortuga",5000);
////        Hilo hLiebre = new Hilo (this,"Liebre",5000);
////        Hilo hCaballo = new Hilo (this,"Caballo",5000);
////        Hilo hGuepardo = new Hilo (this,"Guepardo",5000);
////    
//        Thread t1 = new Thread(hTortuga);
//        Thread t2 = new Thread(hLiebre);
//        Thread t3 = new Thread(hCaballo);
//        Thread t4 = new Thread(hGuepardo);
//        
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        
//    }
    
    
    
    public static void main(String[] args) {
        EjCarrera vista = new EjCarrera();
        
    }
}
