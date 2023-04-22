/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia7_extralarge;

import ejercicio1_guia7_extralarge.entidad.Coche;

/**
 *
 * @author Joselo
 *
 */
public class Ejercicio1_Guia7_Extralarge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Coche coche1 = new Coche("Ford", "Fiesta", 15000.0);
    Coche coche2 = new Coche("Toyota", "Corolla", 20000.0);
    Coche coche3 = new Coche("Honda", "Civic", 18000.0);
    
    System.out.println(coche1.getMarca() + " " + coche1.getModelo() + " " + coche1.getPrecio());
    System.out.println(coche2.getMarca() + " " + coche2.getModelo() + " " + coche2.getPrecio());
    System.out.println(coche3.getMarca() + " " + coche3.getModelo() + " " + coche3.getPrecio());
        
                
        
        
    }
    
}
