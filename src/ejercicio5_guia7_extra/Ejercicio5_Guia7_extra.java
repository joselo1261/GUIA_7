/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_guia7_extra;

import ejercicio5_guia7_extra.entidad.Empleado;

/**
 *
 * @author Joselo
 */
public class Ejercicio5_Guia7_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1=new Empleado();
        e1.calcular_aumento();
        
        System.out.println("El empleado: "+ e1.getNombre());
        System.out.println("................................");
        System.out.println("Su nuevo salario es de: "+e1.getSalario());
        
        
        
    }
    
}
