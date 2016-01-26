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
public class Triangulo extends Figura implements imprimir {
    
    
    private int base;
    private int altura;
  

    public Triangulo(Punto origen, int base, int altura) {
        super(origen);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double Area() {
        return this.base*this.altura/2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Perimetro() {
        return this.base*3; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Escalr(double porcentaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String aCadena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    
