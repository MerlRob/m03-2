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
public interface FiguraInterface {
    
    public void desplazar(double x, double y);
    public double Area();
    public double Perimetro();
    public void Escalar(int x);
    @Override
    public String toString();
}
