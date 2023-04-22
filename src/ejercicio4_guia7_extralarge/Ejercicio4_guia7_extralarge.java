/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_guia7_extralarge;

import ejercicio4_guia7_extralarge.entidad.Ascensor;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio4_guia7_extralarge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Ascensor a1= new Ascensor(0,10);
        
        Scanner leer = new Scanner(System.in);
        int pisoDestino;
        do{
        System.out.println("¿A qué piso desea ir?");
        pisoDestino=leer.nextInt();
        if(pisoDestino<0 || pisoDestino>10){
            System.out.println("Piso Inexistente.");
        break;
        }
        a1.irA(pisoDestino);
        
        }while (pisoDestino>=0 && pisoDestino<=10);
        
    }
    
}
 
    
