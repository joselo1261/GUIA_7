/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_guia7_extra.entidad;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Joselo
 */
public class Cuenta {
    private String titular;
    private double retiro;
    
    double saldo=Math.floor((double)Math.random()*100000);
   
    Scanner leer=new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
   
    
    public void retirar_dinero() {
         
        System.out.println("Ingrese el nombre del titular");
        titular=leer.nextLine();
        System.out.println(" ");
        System.out.println("Su saldo actual es: "+ saldo);
        System.out.println(" ");
        
        System.out.println("Ingrese la cantidad a retirar");
        retiro=leer.nextDouble();
        System.out.println(" ");  
        
        if (retiro <= saldo) {
        saldo -= retiro;
            System.out.println("Su saldo nuevo es "+saldo);
            System.out.println(" ");
        } else {
            System.out.println("Saldo insuficiente");
            System.out.println(" ");
        }
      
}
        
    
}
    
    
    
    
    
    
    
