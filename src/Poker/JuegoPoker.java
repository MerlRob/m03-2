/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;

import java.util.Comparator;
import java.util.Collections;
/**
 *
 * @author Mer
 */
public class JuegoPoker {
    protected int turno;
    protected Baraja baraja;
    protected Jugador jugador;

    public JuegoPoker(int turno, Baraja baraja, Jugador jugador) {
        this.turno = turno;
        this.baraja = baraja;
        this.jugador = jugador;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public Baraja getBaraja() {
        return baraja;
    }

    public void setBaraja(Baraja baraja) {
        this.baraja = baraja;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    public void iniciar(Baraja baraja, Mano mimano){
        baraja.barajar();
            for(int i=0; i<4;i++){
                mimano= baraja.repartir(this.jugador.obtenerMano());
                    }
                    System.out.println(mimano);}
    public void nuevoTurno(Mano mimano){
        int descarte=mimano.descartar();
        if(descarte>0){
            for(int i=0; i<=descarte; i++){
                mimano= baraja.repartir(this.jugador.obtenerMano());}
        } else
        {System.out.println("Estoy servido");}
                    System.out.println(mimano);
      
    }   
    public String calcularPuntuacion(){
         Collections.sort(this.jugador.getMano().getMano(), new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return new Integer(((Carta)o1).getNumero()).compareTo(new Integer(((Carta)o2).getNumero()));
            }
        });
        
        String resultado;
        boolean escalera = false;
        boolean color = false;
        int cartasIguales = 1;
        int parejas = 0;
        Mano mano = this.jugador.getMano();
        
        if (mano.getMano().get(0).getNumero() + 1 == mano.getMano().get(1).getNumero() && mano.getMano().get(1).getNumero() + 1 == mano.getMano().get(2).getNumero() && mano.getMano().get(2).getNumero() + 1 == mano.getMano().get(3).getNumero() && mano.getMano().get(3).getNumero() + 1 == mano.getMano().get(4).getNumero()){
            escalera = true;
        }
        
        if (mano.getMano().get(0).getPalo() == mano.getMano().get(1).getPalo() && mano.getMano().get(1).getPalo() == mano.getMano().get(2).getPalo() && mano.getMano().get(2).getPalo() == mano.getMano().get(3).getPalo() && mano.getMano().get(3).getPalo() == mano.getMano().get(4).getPalo()){
            color = true;
        }
        
        int indice1 = 0;
        int indice2 = 1;
        int auxCartas = 1;
        
        while (indice2 < 5){
            if (mano.getMano().get(indice1).getNumero() == mano.getMano().get(indice2).getNumero()){
                auxCartas++;
                indice2++;
            }
            else {
                
                if (auxCartas > 1){
                    parejas++;
                }
                if (auxCartas > cartasIguales){
                    cartasIguales = auxCartas;
                    auxCartas = 1;
                }
                
                indice1 = indice2;
                indice2++;
                
            }
        }
        
        if (escalera && color){
            resultado = "Escalera de color";
        }
        else if(parejas == 1 && cartasIguales == 4) {
            resultado = "Poker";
        }
        else if(parejas ==2 && cartasIguales ==3 ){
            resultado = "Full";
        }
        else if(color){
            resultado = "Color";
        }
        else if(escalera){
            resultado = "Escalera";
        }
        else if(parejas == 1 && cartasIguales== 3){
            resultado = "Trío";
        }
        else if(parejas == 2 && cartasIguales == 2){
            resultado = "Doble Pareja";
        }
        else if(parejas==1 && cartasIguales ==2){
            resultado = "Pareja";
        }
        else{
            resultado = "Carta Alta";
        }
          
        return resultado;
    }
}
        
        
        

    
    


    

