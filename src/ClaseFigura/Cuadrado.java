/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseFigura;

/**
 *
 * @author Mer
 */
public class Cuadrado extends Figura {
    protected double ancho;

    public Cuadrado(Punto origen) {
       super(origen);
       this.ancho = 0;
    }

    public Cuadrado(Punto origen, double ancho) {
        super(origen);
        this.ancho = ancho;
    }

    public void Cuadrado(Punto p) {
        Punto origen = p;
        this.ancho = 0;
    }
    
    
public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double Area() {
        return this.ancho*this.ancho; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Perimetro() {
        return this.ancho*4; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Escalr(double porcentaje) {
     System.out.println(this.ancho + this.ancho * porcentaje/100); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String aCadena() {
        return "cuadrado {" + origen.toString() + " ancho=  " + this.ancho; //To change body of generated methods, choose Tools | Templates.
    }

   
}
