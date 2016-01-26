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
public abstract class Figura implements MetodosFigura {
    protected Punto origen;
    private static int numFiguras=0;

    public Figura(Punto origen) {
        this.origen=origen;
        Figura.numFiguras++;
    }
    public Figura() {
       this.origen= new Punto();
        Figura.numFiguras++;
    }
    public Punto getOrigen() {
        return origen;
    }

    public static int getNumFiguras() {
        return numFiguras;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public static void setNumFiguras(int numFiguras) {
        Figura.numFiguras = numFiguras;
    }
    
   public void desplazar(int xx, int yy){
   this.origen.desplazar(yy, yy);
   }
  
   public double distancia(Figura f){
      return this.origen.distancia(f.getOrigen());
   }                    
    
    @Override
    public String toString() {
        return "Figura{" + "origen=" + this.origen.toString() + '}';
    }
    
//    public abstract double area();
//    public abstract double perimetro();
//    public abstract void escalar(double x);

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void escalar(double x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
