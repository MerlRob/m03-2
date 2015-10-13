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
public class claseFigura {
    public static void main(String [] args) {
    
    Punto p = new Punto(3,1);
    System.out.println(p);
    System.out.println(p);
    
    Circulo c = new Circulo(p,3);
    Circulo c1 = new Circulo(p, 4);
    
    System.out.println(c1);
      
    }
    public Punto testPunto()
    {
    Punto p= new Punto(3,1);
    System.out.println(p);
    p.desplazar(4,0);
    return p;
    }
    }
    
    
    
    
    
    
    
    

