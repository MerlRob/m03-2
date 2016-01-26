/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;

/**
 *
 * @author Mer
 */
public class Jugador {
    private int id;
    private Mano mano;
    private int manoGanada;

    public Jugador(int id, Mano mano, int manoGanada) {
        this.id = id;
        this.mano = mano;
        this.manoGanada = manoGanada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mano getMano() {
        return mano;
    }

    public void setMano(Mano mano) {
        this.mano = mano;
    }
    
    public int getManoGanada() {
        return manoGanada;
    }

    public void setManoGanada(int manoGanada) {
        this.manoGanada = manoGanada;
    }    
    public Mano obtenerMano(){
    this.mano= new Mano();
    this.mano.getMano();
    return this.mano;
    }
}
