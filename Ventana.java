/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuadromovimientoautomatico;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author adr
 */
public class Ventana extends JFrame implements Runnable {
     JPanel panel;
     int x, y = 100;
     int subir;
     
     
     public Ventana() {
         this.setSize(800,800);         
         this.setTitle("Mi Ventana");
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setLayout(null);
         iniciarComponentes();                
         new Thread(this).start();
     
          addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
   /*                 case KeyEvent.VK_W: // Arriba
                        if (y > 0) {
                            y -= 10; // Mover hacia arriba
                        }
                        break;
   */                 case KeyEvent.VK_A: // Izquierda
                        if (x > 0) {
                            x -= 10; // Mover hacia la izquierda
                        }
                        break;
 /*                   case KeyEvent.VK_S: // Abajo
                        if (y < getHeight() - panel.getHeight()) {
                            y += 10; // Mover hacia abajo
                        }
                        break;
   */                 case KeyEvent.VK_D: // Derecha
                        if (x < getWidth() - panel.getWidth()) {
                            x += 10; // Mover hacia la derecha
                        }
                        break;
                }
                panel.setBounds(x, y, panel.getWidth(), panel.getHeight()); // Actualizar la posición del panel
            }
        });

        setFocusable(true); // Para asegurarnos de que la ventana puede recibir eventos de teclado
        setVisible(true);
          
    }
     
     
     private void iniciarComponentes() {
         //int x = 50, y = 50;
         
         panel =new JPanel ();
         panel.setBounds(x,y,50,50);
         panel.setBackground(Color.GREEN);
         this.add(panel);
         panel.setFocusable(true);      
         setVisible(true);
               
     }
     
     
     @Override
    public void run() {
   int i = 0; 
        boolean j = false;
        int subir = 1;
        
         do {
             
      System.out.println(i  + "valor de y = " + subir); 
      System.out.print(j);
     //System.out.println(subir); 
     // System.out.println(y); 
      
           
      
      if (subir > 600) {
          j = true;
      } else {           
           if (subir < 0) {
               j = false;
           }         
          }         
      
      
      if (j) {
         subir = subir - 10;
      } else {           
              subir = subir + 10;
          }         
      
      
    panel.setBounds(x, subir, 50,50);
         
             try {
                 Thread.sleep(50);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Tarea.class.getName()).log(Level.SEVERE, null, ex);
             }
             
    } while(i != 11);    
    }

     
}
