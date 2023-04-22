/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia7_extra;

import ejercicio2_guia7_extra.entidad.Puntos;
import java.text.DecimalFormat;

/**
 *
 * @author Joselo
 */
public class Ejercicio2_Guia7_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat  df= new DecimalFormat("#.###");
        Puntos p1=new Puntos();
        
        p1.crearPuntos();
        System.out.println("La distancia entre las coordenadas " + p1.getX1() +"."+ p1.getY1() + " y "+ p1.getX2() +"."+ p1.getY2());
        System.out.println(df.format(p1.calcularDistancia()));
       
    }
    
}
