/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseSegmento;

import ClaseFigura.Punto;

/**
 *
 * @author Mer
 */
public class Segmento {
     protected Punto p;
     protected Punto q;

    public Segmento(Punto p, Punto q) {
        this.p = p;
        this.q = q;
    }

    public Segmento(){
    this.p= new Punto(0,0);
    this.q= new Punto(0,0);
    }
    public Punto getP() {
        return p;
    }

    public void setP(Punto p) {
        this.p = p;
    }

    public Punto getQ() {
        return q;
    }

    public void setQ(Punto q) {
        this.q = q;
    }
    
    public double medida() {
        return this.p.distancia(this.q); //To change body of generated methods, choose Tools | Templates.
    }
    public void desplazarP(double x, double y){ 
        p.desplazar(p.getX() + x, p.getY() +y);
        q.desplazar(q.getX() + x, q.getY() + y);  
    }

    @Override
    public String toString() {
        return "la recta es {" + "Punto p (" + p.getX() + "," + p.getY() + ") y "
        + "Punto q (" + q.getX() + "," + q.getY() + ")"; //To change body of generated methods, choose Tools | Templates.
    }
}
