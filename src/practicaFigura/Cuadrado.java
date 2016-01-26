/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaFigura;

/**
 *
 * @author Mer
 */
public class Cuadrado extends Figura implements MetodosFigura {
    protected double ancho;

    public Cuadrado(double ancho, Punto origen) {
        super(origen);
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    
    
   /* @Override
    public double area() {
       double area= this.ancho*this.ancho;
        return area; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetro() {
        double perimetro= this.ancho*4; 
        return perimetro;
    //To change body of generated methods, choose Tools | Templates.
    }

    
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "ancho=" + ancho + '}';
    }*/
/*
    @Override
    public double area() {
       double area= this.ancho*this.ancho;
        return area; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetro() {
         double perimetro= this.ancho*4; 
        return perimetro;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void escalar(double x) {
        this.ancho= this.ancho + x;
        
    }
        ; //To change body of generated methods, choose Tools | Templates.

      @Override
    public String toString() {
        return "Cuadrado= {origen  " + this.origen + ", ancho= " + this.ancho + '}';   
    
}*/

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void escalar(double x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}