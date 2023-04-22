/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia7_extra.entidad;

import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Cancion {
    private String titulo;
    private String autor;
       
    Scanner leer = new Scanner(System.in);

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void crearCancion(){
        
        System.out.println("Ingrese el titulo de la cancion");
        titulo=leer.nextLine();
        System.out.println("Ingrese el autor de la cancion");
        autor=leer.nextLine();
        System.out.println("---------------------------- ");
    }   

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Titulo = " + titulo + ", Autor = " + autor + '}';
    }
    
    
}    
    
