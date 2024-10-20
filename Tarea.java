/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuadromovimientoautomatico;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adr
 */
public class Tarea implements Runnable{
   
    @Override 
     public void run (){
        int i = 0; 
        int j = 0; 
        int y = 10;
         do {
             
      System.out.println(i); 
      //System.out.println(j); 
      
           
      
      if (i == 10) {
          j = 1;
      } else { 
          if (i == 0) {
           j = 0;         
          }         
      }
      
      if (j == 1) {
          i = i - 1;          
      } else { 
          if (j == 0) {
           i  = i + 1;         
          }         
      }
      
    
         
             try {
                 Thread.sleep(500);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Tarea.class.getName()).log(Level.SEVERE, null, ex);
             }
             
    } while(i != 11);    
         
         
     }
    
}
