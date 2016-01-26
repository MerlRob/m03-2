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
public class Carta {
    
    protected int palo;
    protected int numero;

    public Carta(int palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void generarCarta(){
    
    }

    @Override
    public String toString() {
        return "Carta { " + "palo= " + palo + ", número= " + numero + '}'; //To change body of generated methods, choose Tools | Templates.
    }
    
    }

