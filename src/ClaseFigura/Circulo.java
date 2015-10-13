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
public class Circulo extends Figura {
    private int radio;
    
    public Circulo(Punto origen, int radio)
    {
        super(origen);
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
    public double Area()
    {
    return Math.PI*Math.pow(this.radio, 2);
    }
    public double Perimetro()
    {
    return 2*Math.PI*this.radio;
    }
    public double escalar(int radio)
    {
            return this.radio = radio;}

    @Override
    public void Escalr(double porcentaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String aCadena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
