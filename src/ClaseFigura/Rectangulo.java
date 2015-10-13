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
public class Rectangulo extends Cuadrado {

    protected double alto;

    public Rectangulo(Punto origen, double ancho, double alto) {
        super(origen, ancho);
        
        this.alto = alto;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    

    @Override
    public String aCadena() {
        return super.aCadena(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Escalr(double porcentaje) {
        super.Escalr(porcentaje); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Perimetro() {
        return (this.ancho+this.alto)/2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Area() {
        return this.alto*this.ancho; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAncho(double ancho) {
        super.setAncho(ancho); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAncho() {
        return super.getAncho(); //To change body of generated methods, choose Tools | Templates.
    }

}
