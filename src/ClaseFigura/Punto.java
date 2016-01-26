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
public class Punto implements imprimir{
  
    protected double x;
    protected double y;
    public Punto()
    {
    this.x=0;
    this.y=0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() 
    {
        return x;
    }
    public void setX(double x)
    {
    this.x = x;
    }
     public double getY() 
    {
        return y;
    }
    public void setY(double y)
    {
    this.y = y;
    }
    
    public void desplazar(double x, double y)
    {
    this.x = this.x + x;
    this.y = this.y + y;
     
    }
    public double distancia(Punto p)
    {
   return Math.sqrt(((Math.pow((this.x - p.getX()),2)) +
     (Math.pow((this.y - p.getY()), 2))));
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
}
