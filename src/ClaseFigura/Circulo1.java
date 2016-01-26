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
public class Circulo1 implements FiguraInterface{
    private int radio;
    
    public Circulo1(Punto origen, int radio)
    {
        origen=origen;
        this.radio= radio;
    }
    
   
    public double getRadio()
    {
    return this.radio;
    }
    public void setRadio(int radio)
    {
    this.radio= radio;
    }

    @Override
    public void desplazar(double x, double y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Escalar(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
