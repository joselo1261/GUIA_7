/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia7;

import ejercicio2_guia7.entidad.Circunferencia;
import java.text.DecimalFormat;


/**
 *
 * @author Joselo
 */
public class Ejercicio2_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c1=new Circunferencia();
        DecimalFormat  df= new DecimalFormat("#.##");
        c1.crearCircunferencia();
        System.out.println("El area es: " + df.format(c1.calcularArea()));
        System.out.println(" ");
        System.out.println("El perimetro es: " + df.format(c1.calcularPerimetro()));
        System.out.println(" ");
          
        
    }

}
