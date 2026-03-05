package modelo;

import java.util.ArrayList;
import java.util.List;

public class TiendaApp {

    public static void mostrarPedido(Pedidos pedidoNuevo) {

        for (String pedido : pedidoNuevo) {
            System.out.println("Cliente: " + pedidoNuevo.getCliente().getNombre());
            System.out.println("Producto: " + pedidoNuevo.getProductos().getNombre());
            System.out.println("Precio: " + pedidoNuevo.getProductos().getPrecio());
            System.out.println("-------------------");

        }
    }

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Juan");
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Portatil", 900));
        productos.add(new Producto("Raton", 20));
        productos.add(new Producto("Teclado", 50));
        Pedido pedido = new Pedido(cliente, productos);

        mostrarPedido(pedido);

        double precioFinal = pedido.calcularPrecioDescuento();
        System.out.println("El precio dinal es : " + precioFinal);

    }
}
