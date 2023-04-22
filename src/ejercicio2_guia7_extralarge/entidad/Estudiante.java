/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia7_extralarge.entidad;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private double notaMedia;
           
 
    public Estudiante(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    
    // Métodos para acceder y modificar los atributos
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
    
    public double getNotaMedia() {
        return notaMedia;
    }
    
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
       
    public static double calcularNotaMedia(Estudiante[] estudiantes) {
    double notaMediaTotal = 0;
    for (int i = 0; i < estudiantes.length; i++) {
        notaMediaTotal += estudiantes[i].getNotaMedia();
    }
    double notaMediaGrupo = notaMediaTotal / estudiantes.length;
    return notaMediaGrupo;
}
    
   public static void mostrarEstudiantesSuperiores(Estudiante[] estudiantes, double notaMediaMinima) {
   System.out.println("Estudiantes con nota media superior a " + notaMediaMinima + ":");
   for (int i = 0; i < estudiantes.length; i++) {
        if (estudiantes[i].getNotaMedia() > notaMediaMinima) {
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println(" ");
        }
    }
}
    
    
    
    
}  




    
    
    
    

