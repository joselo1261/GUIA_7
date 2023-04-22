/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia7;

import ejercicio1_guia7.entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio1_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        Libro l1= new Libro();
        
        
        l1.cargarLibro(leer);
        System.out.println(l1.toString());
        
    }
    
}
  
