/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5poo.EjemplosCorrectos;

/**
 *
 * @author yoven
 */
public class Vehiculo {
    private String marca;
    private double velocidad;

    // Constructor
    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    // Métodos getter
    public String getMarca() {
        return marca;
    }

    public double getVelocidad() {
        return velocidad;
    }

    // Método para acelerar el vehículo, solo si el incremento es positivo
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidad += incremento;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", 100);
        vehiculo.acelerar(20);
        System.out.println(vehiculo); // Imprime la información del vehículo
    }
}
