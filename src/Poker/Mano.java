/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Mer
 */
public class Mano {
    private ArrayList<Carta> mano;  
   

    public Mano() {
        this.mano= new ArrayList();
    }
   
    public Mano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

   public void cogerCarta(Carta carta){
       
       this.mano.add(carta);
    }
   
   public int numCartas(){
       return this.mano.size();
   }

   public int descartar(){
       Scanner teclado=new Scanner(System.in);
       System.out.print("Escribe el número de cartas que descartas");
       int descarte=teclado.nextInt();
       for(int i=0; i<=descarte; i++){
        descarte=(int)Math.floor(Math.random()*6);
            this.mano.remove(descarte);}
            return descarte;
   }
   
   public Carta getCarta(int unaCarta){
        
        return this.mano.get(unaCarta);
    }

    @Override
    public String toString() {
        return "Mano[" + "mano =" + mano + ']'; //To change body of generated methods, choose Tools | Templates.
    }   
    
}
