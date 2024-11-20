/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4ejercicios;

/**
 *
 * @author yoven
 */
public class Estudiante {
    // Atributos privados, no pueden ser accedidos directamente desde fuera de la clase
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor para inicializar los valores al crear el objeto
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    // Método getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método setter para cambiar el nombre, pero antes validamos que no esté vacío
    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    // Método getter para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Método setter para cambiar la edad, asegurándonos de que sea mayor que 0
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor que 0.");
        }
    }

    // Método getter para obtener la nota promedio
    public double getNotaPromedio() {
        return notaPromedio;
    }

    // Método setter para cambiar la nota promedio, validando que esté en el rango 0-10
    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 10) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("La nota promedio debe estar entre 0 y 10.");
        }
    }

    // Método para mostrar los detalles del estudiante
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", notaPromedio=" + notaPromedio +
                '}';
    }

    // Clase de prueba para crear un Estudiante y probar los métodos
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos", 22, 8.5);
        System.out.println(estudiante);  // Muestra el estudiante creado
        estudiante.setEdad(25); // Cambia la edad
        estudiante.setNotaPromedio(9.0); // Cambia la nota promedio
        System.out.println(estudiante); // Muestra el estudiante con los datos actualizados
    }
}
