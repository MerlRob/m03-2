/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;

/**
 
 * @author Mer
 */
public class test {
 public static void main(String [] args) {
     
     
     Baraja damelalista = new Baraja();
        Mano mimano = new Mano();
        Jugador tu= new Jugador(1,mimano,0);
        damelalista.barajar();
       
        System.out.println(damelalista);
       
       mimano=damelalista.repartir(mimano);
        System.out.println(mimano);
      
 
 }
 }   
    

