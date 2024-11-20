/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4ejercicios;

/**
 *
 * @author yoven
 */
public class Coche {
    private String marca;          // Atributo privado
    private String modelo;         // Atributo privado
    private double velocidadMaxima; // Atributo privado

    // Constructor para inicializar los valores del coche
    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos getter
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // Método para acelerar el coche, solo si el incremento es positivo
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }

    // Método para mostrar los detalles del coche
    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }

    // Clase de prueba para crear un Coche y probar el método acelerar
    public static void main(String[] args) {
        Coche coche = new Coche("Ford", "Mustang", 200);
        System.out.println(coche);  // Muestra el coche creado
        coche.acelerar(50); // Acelera el coche
        System.out.println(coche); // Muestra el coche después de acelerar
    }
}
