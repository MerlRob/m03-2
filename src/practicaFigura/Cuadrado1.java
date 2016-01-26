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
public class Cuadrado1 implements FiguraInterface {
    protected Segmento1 lado;

    public Cuadrado1(Segmento1 lado) {
        this.lado = lado;
    }

    public Segmento1 getLado() {
        return lado;
    }

    public void setLado(Segmento1 lado) {
        this.lado = lado;
    }
 

    @Override
    public void desplazar(double x, double y) {
        lado.getP().desplazar(x, y);
        
        lado.getQ().desplazar(x, y);
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Area() {
        return lado.Perimetro() * lado.Perimetro(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Perimetro() {
        return lado.Perimetro() * 4; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Escalar(int x) {
         lado.getQ().desplazar(x, x);
         //To change body of generated methods, choose Tools | Templates.
    }

    

  
    
   
    
}
