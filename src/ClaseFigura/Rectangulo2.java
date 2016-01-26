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
public class Rectangulo2 extends Cuadrado2 implements FiguraInterface {
    private Segmento lado;

    public Rectangulo2(Segmento lado, Segmento inferior, Punto p, Punto q) {
        super(inferior, p, q);
        this.lado = lado;
    }

    public Segmento getLado() {
        return lado;
    }

    public void setLado(Segmento lado) {
        this.lado = lado;
    }

    @Override
    public void Escalar(int x) {
        super.Escalar(x);
        lado.getQ().desplazar(x, x);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Perimetro() {
        return super.inferior.medida()*2 + lado.medida()*2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Area() {
        return super.inferior.medida()*lado.medida(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desplazar(double x, double y) {
        super.desplazar(x, y);
        lado.desplazarP(x, y);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
