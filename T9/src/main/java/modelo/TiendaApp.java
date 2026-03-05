package modelo;

import java.util.ArrayList;
import java.util.List;

public class TiendaApp {

    public static void main(String[] args) {

        List<String> pedidos = new ArrayList();

        pedidos.add("Juan,Portatil,900");
        pedidos.add("Juan,Raton,20");
        pedidos.add("Juan,Teclado,50");

        double total = 0;
        final double precioDescuento=500;
        final double descuento =0.15;
        
        for(String iteracion : pedidos ){
                
            String[] partes = iteracion.split(",");

            String nombre = partes[0];
            String producto = partes[1];
            double precio = Double.parseDouble(partes[2]);

            total = total + precio;

            System.out.println("Cliente: " + nombre);
            System.out.println("Producto: " + producto);
            System.out.println("Precio: " + precio);
            System.out.println("-------------------");
        }


        if (total > precioDescuento) {
            total = total - (total * descuento);
        }

        System.out.println("TOTAL FINAL: " + total);
    }
}