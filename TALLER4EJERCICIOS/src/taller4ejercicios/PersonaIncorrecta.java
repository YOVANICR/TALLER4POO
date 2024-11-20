/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4ejercicios;

/**
 *
 * @author yoven
 */
public class PersonaIncorrecta {
    private String nombre; // Atributo privado

    public PersonaIncorrecta(String nombre) {
        this.nombre = nombre;
    }
}
/*
public class Main {
    public static void main(String[] args) {
        PersonaIncorrecta persona = new PersonaIncorrecta("Juan");
        // Intentamos acceder a `nombre` directamente, lo cual genera un error
        System.out.println(persona.nombre); // Error: nombre es privado
    }
}
*/