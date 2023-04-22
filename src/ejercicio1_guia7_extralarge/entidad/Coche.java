/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia7_extralarge.entidad;

// 1) Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
// Crea tres objetos de la clase "Coche" y muéstralos por pantalla.
/**
 *
 * @author Joselo
 */
public class Coche {
    private String marca;
    private String modelo;
    private Double precio;
        
    public Coche() {
    }

    public Coche(String marca, String modelo, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
    
           
    
    
    
    
    
    
    
}
