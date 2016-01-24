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
public class Cuadrado extends Segmento implements SegmentoInterface {
    protected Segmento inferior;

    public Cuadrado(Segmento inferior, Punto p, Punto q) {
        super(p, q);
        this.inferior = inferior;
    }

    public Cuadrado(){
    this.inferior= new Segmento(getP(),getQ());
    }
    
    public Segmento getInferior() {
        return inferior;
    }

    public void setInferior(Segmento inferior) {
        this.inferior = inferior;
    }

   
    @Override
    public void desplazar(double x, double y) {
       inferior.desplazarP(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Area() {
        
      return Math.pow(inferior.medida(), 2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Perimetro() {
        return inferior.medida()*4 ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Escalar(int x) {
        inferior.getQ().desplazar(x, x);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

