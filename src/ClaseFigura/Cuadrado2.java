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
public class Cuadrado2 extends Segmento implements FiguraInterface {
    protected Segmento inferior;
    

    public Cuadrado2(Segmento inferior, Punto p, Punto q) {
        super(p, q);
        this.inferior = inferior;
       
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
        ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
