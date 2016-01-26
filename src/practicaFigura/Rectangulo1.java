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
public class Rectangulo1 extends Cuadrado1 implements FiguraInterface{
    private Segmento1 base;

    public Rectangulo1(Segmento1 base, Segmento1 lado) {
        super(lado);
        this.base = base;
    }

    public Segmento1 getBase() {
        return base;
    }

    public void setBase(Segmento1 base) {
        this.base = base;
    }
    
    @Override
    public void desplazar(double x, double y) {
        base.getP().desplazar(y, y);
        base.getQ().desplazar(x, x);
    }

    @Override
    public double Area() {
       return base.Perimetro() * lado.Perimetro();
    }

    @Override
    public double Perimetro() {
        return ((base.Perimetro() * 2) + (lado.Perimetro() * 2));
    }

    @Override
    public void Escalar(int x) {
        base.getP().desplazar(x, x);
    }

    @Override
    public String toString() {
        return "Rectangulo1{" + "base=" + base + '}';
    }
    
    
}
