/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5poo.EjemplosIncorrectos;

/**
 *
 * @author yoven
 * 
 * Ejemplo Incorrecto 2: Falta de Validación en un Setter de un Atributo
 */
public class Producto {
    private double precio; // Atributo privado

    public Producto(double precio) {
        this.precio = precio;
    }

    // Método para cambiar el precio sin validación
    public void actualizarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio; // No hay validación
    }

    public static void main(String[] args) {
        Producto producto = new Producto(100.0);
        producto.actualizarPrecio(-50.0); // No se valida el precio, y podría asignarse un valor incorrecto
        System.out.println("Precio actualizado: " + producto.precio); // Imprime el precio incorrecto
    }
}
