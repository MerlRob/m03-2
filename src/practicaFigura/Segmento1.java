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
public class Segmento1 implements FiguraInterface {
    protected Punto p;
    protected Punto q;

    public Segmento1(Punto p, Punto q) {
        this.p = p;
        this.q = q;
    }

    public Punto getP() {
        return p;
    }

    public void setP(Punto p) {
        this.p = p;
    }

    public Punto getQ() {
        return q;
    }

    public void setQ(Punto q) {
        this.q = q;
    }

    @Override
    public void desplazar(double x, double y) {
        p.desplazar(p.getX() + x, p.getY()+ y);   
        q.desplazar(q.getX() + x, q.getY()+ y); ///To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Perimetro() {
     return p.distancia(q)   ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Escalar(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
