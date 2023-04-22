/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_guia7_extra.entidad;

import java.util.Scanner;


/**
 *
 * @author Joselo
 */
public class Empleado {
    private String nombre="";
    private int edad=0;
    private double salario;
        
    Scanner leer=new Scanner(System.in);

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        
    }
    
    public void calcular_aumento(){
        System.out.println("Ingrese nombre empleado: ");
        nombre=leer.nextLine();
        System.out.println("Ingrese edad del empleado: ");
        edad=leer.nextInt();
        System.out.println("Ingrese salario del empleado: ");
        salario=leer.nextDouble();
                    
        if (edad>30) {
            Math.round(salario*= 1.10);
            
        }else{
            Math.round(salario*= 1.05);
        }
     
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }
   
}