/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5poo.EjemplosCorrectos;

/**
 *
 * @author yoven
 * 
 * Ejemplo Correcto 1: Clase Persona
 */
public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter
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
        if (edad >= 0) { // Validamos que la edad sea positiva
            this.edad = edad;
        }
    }

    // Método para mostrar la información de la persona
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);
        System.out.println(persona); // Imprime la información de la persona
    }
}
