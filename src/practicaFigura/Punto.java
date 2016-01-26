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
public class Punto {
    private double x;
    private double y;
    
    public Punto (double x, double y)
    {
    this.x= x;
    this.y=y;
    }

    Punto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    
    public void desplazar(double p, double q)
    {
    this.x= this.x + p;
    this.y= this.y + q;    
    }
    
    public double distancia(double p, double q)
    {
    this.x = Math.pow((this.x - p), 2);
    this.y = Math.pow ((this.y - q), 2);
    return (Math.sqrt((this.x +this.y)));
    
    }
    
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }

    double distancia(Punto origen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
}


