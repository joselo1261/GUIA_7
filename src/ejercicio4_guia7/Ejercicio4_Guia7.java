/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_guia7;

import ejercicio4_guia7.entidad.Rectangulox;
import java.text.DecimalFormat;

/**
 *
 * @author Joselo
 */
public class Ejercicio4_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulox r1 = new Rectangulox();
        DecimalFormat  df= new DecimalFormat("#.##");
        r1.crearRectangulo();
        System.out.println("La superficie es: " + df.format(r1.calcularSuperficie()));
        System.out.println(" ");
        System.out.println("El perimetro es: " + df.format(r1.calcularPerimetro()));
        System.out.println("---------------------------- ");
        System.out.println(" ");
        
        System.out.println("Dibujo del rectangulo lleno");
        r1.dibujaRectangulo();
        
        System.out.println(" ");
        
        System.out.println("Dibujo del rectangulo vacio ");
        r1.dibujaRectangulo2();
        
        
   }

}   
