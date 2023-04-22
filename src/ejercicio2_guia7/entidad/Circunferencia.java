/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia7.entidad;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Circunferencia {
    private double radio;
    Scanner leer = new Scanner(System.in);

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
        
    }
        
    public void crearCircunferencia(){
        System.out.println("Ingrese el valor del radio");
        radio=leer.nextDouble();
        System.out.println("---------------------------- ");
    }    
        
   public Double calcularArea(){
        return Math.PI * Math.pow(radio,2);  //Cacular el Area
           
    }     
    
   public Double calcularPerimetro(){
        return 2*Math.PI * radio;  //Cacular el Perimetro
           
    }     

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", leer=" + leer + '}';
    }
   
   
        
}
    
    
    
    
    
    
    
    
    
 