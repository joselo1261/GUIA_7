/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_guia7.entidad;

import java.util.Scanner;

/**
 *
 * @author Joselo
 */
    public class Rectangulox {
    private double base;
    private double altura;
    Scanner leer = new Scanner(System.in);
           
    public void crearRectangulo(){
        System.out.println("Ingrese el valor de la base");
        base=leer.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura=leer.nextDouble();
        System.out.println("---------------------------- ");
    }   
    
    public Rectangulox() {
        
    }
   
   public Rectangulox(double base, double altura) {
        this.base = base;
        this.altura=altura;
    }
    
           
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public Scanner getLeer() {
        return leer;
    }
    
    public Double calcularSuperficie(){
        return base * altura; 
           
    }     
    
   public Double calcularPerimetro(){
        return (base+altura)*2; 
           
    }     

   // Rectangulo LLeno
    public void dibujaRectangulo(){
    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < base; j++) {
        System.out.print("*");
        }
        System.out.println();
    }
}
    
    // Rectangulo vacio
    public void dibujaRectangulo2(){
        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j <= base; j++) {
                if (i==0 || j==0 || i==altura || j==base){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
    
    }
    }
    
 
    