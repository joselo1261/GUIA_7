/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia7_extralarge;

import ejercicio2_guia7_extralarge.entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio2_guia7_extralarge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Pedir el número de estudiantes por pantalla
    Scanner leer = new Scanner(System.in);
    System.out.print("Introduce el número de estudiantes: ");
    int numE = leer.nextInt();

    // Crear un arreglo de objetos "Estudiante"
    Estudiante[] estudiantes = new Estudiante[numE];

    // Pedir los datos de cada estudiante por pantalla y crear un objeto "Estudiante"
    for (int i = 0; i < numE; i++) {
    System.out.println(" ");
    System.out.println("Estudiante " + (i+1) + ":");
    System.out.print("Nombre: ");
    String nombre = leer.next();
    System.out.print("Edad: ");
    int edad = leer.nextInt();
    System.out.print("Nota media: ");
    double notaMedia = leer.nextDouble();
    estudiantes[i] = new Estudiante(nombre, edad, notaMedia);
    System.out.println(" ");
    }   

    // Calcular la nota media del grupo y mostrar los estudiantes con nota media superior a la media
    double notaMediaGrupo = Estudiante.calcularNotaMedia(estudiantes);
    Estudiante.mostrarEstudiantesSuperiores(estudiantes, notaMediaGrupo);
      
        
    }
    
}
