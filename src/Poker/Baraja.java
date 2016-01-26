/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;

import java.util.*;


/**
 *
 * @author Mer
 */
public class Baraja {
    
    private ArrayList<Carta> carta;

    public Baraja() {
 
        this.carta= new ArrayList<Carta>();
            for(int i=0; i<12; i++){
                for(int j=0; j<3; j++){
                    this.carta.add(new Carta(j,i));
               
        }
        }
    }

       public ArrayList<Carta> getCarta() {
              return carta;
    }

    public void setCarta(ArrayList<Carta> cartas) {
        this.carta = cartas;
    }
    public void barajar(){
        Collections.shuffle(this.carta);}
    
    public Mano repartir(Mano mano){
        //Mano mano = new Mano();
        
       
            while (mano.numCartas()<5){

                mano.cogerCarta(this.carta.get(0));

                this.carta.remove(0);
               
            }
             return mano;
    }
    
//    public Mano repartir(Mano mano){
//         mano = new Mano();
//       
//        for(int p=0; p<=5; p++){
////        m= cartas.indexOf(this.cartas);
//        mano.cogerCarta(this.carta.get(0));  
//        this.carta.remove(0);
//        }
//         return mano;
//    }
    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + carta + '}';
    }
       
}