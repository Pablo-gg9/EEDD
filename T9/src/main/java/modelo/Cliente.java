/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 * Clase que gestiona clientes 
 * @version 1.0
 * @author Pablo 
 */
public class Cliente {

    private String nombre;
    
    /**
     * Constructor por parametros de la clase
     * @param nombre Nombre del cliente
     */
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo nombre
     * @return Devuelve el valor de nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del atributo nombre
     * @param nombre Establece un valor para el atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
