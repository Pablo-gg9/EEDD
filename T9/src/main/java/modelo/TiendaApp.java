package modelo;

import java.util.ArrayList;
import java.util.List;

public class TiendaApp {

    public static void mostrarPedido(List<String> pedidos) {

        for (String iteracion : pedidos) {
            String[] partes = iteracion.split(",");
            String nombre = partes[0];
            String producto = partes[1];
            double precio = Double.parseDouble(partes[2]);
            System.out.println("Cliente: " + nombre);
            System.out.println("Producto: " + producto);
            System.out.println("Precio: " + precio);
            System.out.println("-------------------");

        }
    }

    public static double calcularPrecio(List<String> pedidos) {
        double total = 0.0;
        for (String iteracion : pedidos) {
            String[] partes = iteracion.split(",");
            double precio = Double.parseDouble(partes[2]);
            total += precio;
        }
        return total;
    }

    public static double aplicarDescuento(double total, double precioDescuento, double descuento) {
        if (total > precioDescuento) {
            total -= (total * descuento);
        }

        return total;
    }

    public static void main(String[] args) {

        List<String> pedidos = new ArrayList();

        pedidos.add("Juan,Portatil,900");
        pedidos.add("Juan,Raton,20");
        pedidos.add("Juan,Teclado,50");

        final double precioDescuento = 500;
        final double descuento = 0.15;

        mostrarPedido(pedidos);

        System.out.println("TOTAL FINAL: " + aplicarDescuento(calcularPrecio(pedidos), precioDescuento, descuento));
    }
}
