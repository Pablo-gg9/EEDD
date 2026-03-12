/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.List;

/**
 * Clase que gestiona pedidos
 * @version 1.0
 * @author Pablo
 */
public class Pedidos {

    private static final double DESCUENTO_PORCENTAJE = 0.15;
    private static final double MINIMO_DESCUENTO = 500;
    private Cliente cliente;
    private List<Productos> productos;

    /**
     * Constructor por parametros de la clase pedidos
     * @param cliente Cliente del pedido
     * @param productos Productos pedidos
     */
    public Pedidos(Cliente cliente, List<Productos> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }

    /**
     * Getter del objeto cliente
     * @return Devuelve el objeto cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Setter del objeto cliente
     * @param cliente Establece el Objeto cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Getter de la lista de productos
     * @return Devuelve una lista de ptoductos
     */
    public List<Productos> getProductos() {
        return productos;
    }

    /**
     * Setter de la lista productos
     * @param productos
     */
    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    /**
     * Metodo que calcula el precio base total del pedido
     * @return Devuelve el valor del precio del pedido
     */
    public double calcularPrecioTotal() {
        double total = 0;
        for (Productos producto : productos) {

            total += producto.getPrecio();
        }
        return total;
    }

    /**
     * Metodo que calcula el precio con su descuento
     * @return Devuelve el precio total con el descuento
     */
    public double calcularPrecioDescuento() {
        double total = calcularPrecioTotal();
        if (total > MINIMO_DESCUENTO) {
            total -= (total * DESCUENTO_PORCENTAJE);
        }
        return total;
    }
}
