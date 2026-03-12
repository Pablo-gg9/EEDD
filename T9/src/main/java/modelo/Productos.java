/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 * Clase que gestiona productos
 * @author Pablo
 */
public class Productos {

    private String nombre;
    private double precio;

    /**
     * Constructor por parametros de la clase productos
     * @param nombre establece el nombre de un producto
     * @param precio establece el precio de un producto
     */
    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Getter del atributo nombre
     * @return Devuelve el valor del nombre de un producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del atributo nombre
     * @param nombre Establece el valor del atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo precio 
     * @return Devuelve el valor del precio de un producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter del atributo precio
     * @param precio Establece un precio para un produto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
