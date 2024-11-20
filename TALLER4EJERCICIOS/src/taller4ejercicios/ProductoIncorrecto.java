/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4ejercicios;

/**
 *
 * @author yoven
 */
public class ProductoIncorrecto {
    private double precio; // Atributo privado

    // Constructor sin validación en el setter
    public ProductoIncorrecto(double precio) {
        this.precio = precio;
    }

    // Método para cambiar el precio sin validación
    public void actualizarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio; // No hay validación
    }

    public static void main(String[] args) {
        ProductoIncorrecto producto = new ProductoIncorrecto(100.0);
        producto.actualizarPrecio(-50.0); // Se puede asignar un precio negativo, lo cual es una mala práctica
        System.out.println("Precio actualizado: " + producto.precio); // Muestra el precio incorrecto
    }
}
