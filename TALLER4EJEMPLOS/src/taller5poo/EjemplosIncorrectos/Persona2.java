/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5poo.EjemplosIncorrectos;

/**
 *
 * @author yoven
 */
public class Persona2 {
    private String nombre; // Atributo privado

    public Persona2(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Persona2 persona = new Persona2("Juan");
        // Intentamos acceder a `nombre` directamente, pero eso causará un error
        System.out.println(persona.nombre); // Error: no se puede acceder a `nombre` directamente, es `private`
    }
}
