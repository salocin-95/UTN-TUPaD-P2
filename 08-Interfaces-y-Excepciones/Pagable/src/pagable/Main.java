/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagable;

/**
 *
 * @author Rodrigo
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rodrigo");
        Pedido pedido = new Pedido(cliente);

        try {
            pedido.agregarProducto(new Producto("Laptop", 1500.0));
            pedido.agregarProducto(new Producto("Mouse", 50.0));

            System.out.println("Total del pedido: $" + pedido.calcularTotal());

            pedido.cambiarEstado("ENVIADO");

            PagoConDescuento pago = new TarjetaCredito();
            double totalConDescuento = pago.aplicarDescuento(pedido.calcularTotal());
            pago.procesarPago(totalConDescuento);

        } catch (Exception e) {
            System.out.println("Ocurrió un error en el pedido: " + e.getMessage());
        } finally {
            System.out.println("Proceso de pedido finalizado.");
        }
    }
}