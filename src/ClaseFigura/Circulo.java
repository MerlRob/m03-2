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
public class Circulo  {
    private double radio;
    
    public Circulo(Punto origen, int radio)
    {
        origen=origen;
        this.radio= radio;
    }
    
   
    public double getRadio()
    {
    return this.radio;
    }
    public void setRadio(double radio)
    {
    this.radio= radio;
    }
//    @Override
//    public double Area()
//    {
//    return Math.PI*Math.pow(this.radio, 2);
//    }
//    @Override
//    public double Perimetro()
//    {
//    return 2*Math.PI*this.radio;
//    }  
//
//    @Override
//    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
//    }
//    
}
