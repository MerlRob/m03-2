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
public abstract class Figura  {
    protected Punto origen;
    private static int numFiguras =0;
    
    public Figura(Punto origen)
    {
    this.origen = origen;
    Figura.numFiguras++;
    }
    public Punto getOrigen()

    {
        return origen;
    }
         

    public void setOrigen(Punto origen)
    {
        this.origen= origen;
    }
    public void desplazar(int dx, int dy)
    {
    this.origen.desplazar(dx, dy); 
    
    }

    @Override
    public String toString() {
        return "Figura{" + "origen=" + this.origen.toString() + '}';
    }
        
       public static int numFiguras(){
       return Figura.numFiguras;
       
       }
      
       public abstract double Area();
       public abstract double Perimetro();
       public abstract void Escalr (double n);
       public abstract String aCadena();
       
   
}
