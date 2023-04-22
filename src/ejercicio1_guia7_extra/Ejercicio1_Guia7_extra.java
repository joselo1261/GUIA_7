/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia7_extra;

import ejercicio1_guia7_extra.entidad.Cancion;

/**
 *
 * @author Joselo
 */
public class Ejercicio1_Guia7_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion c1=new Cancion();
        
        c1.crearCancion();
        
        System.out.println("Usando: toString");
        System.out.println(c1);
        System.out.println(" ");
        
        System.out.println("Usando el print por parametros");
        System.out.println("El Titulo de la cancion es: " + c1.getTitulo());
        System.out.println(" ");
        System.out.println("El Autor de la cancion es: " + c1.getAutor());
        System.out.println(" ");
        
             
    }
    
}
