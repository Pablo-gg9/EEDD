/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.List;

/**
 *
 * @author Alumno
 */
public class Pedidos {

    private static final double DESCUENTO_PORCENTAJE = 0.15;
    private static final double MINIMO_DESCUENTO = 500;
    private Cliente cliente;
    private List<Productos> productos;

    public Pedidos(Cliente cliente, List<Productos> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Productos producto : productos) {

            total += producto.getPrecio();
        }
        return total;
    }

    public double calcularPrecioDescuento() {
        double total = calcularPrecioTotal();
        if (total > MINIMO_DESCUENTO) {
            total -= (total * DESCUENTO_PORCENTAJE);
        }
        return total;
    }
}
