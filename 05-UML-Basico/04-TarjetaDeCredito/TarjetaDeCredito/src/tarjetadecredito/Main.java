/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetadecredito;

/**
 *
 * @author Rodrigo
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente = new Cliente("Rodrigo", "40123456");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/28", cliente, banco);

        System.out.println(tarjeta);
        System.out.println("El cliente " + cliente.getNombre() + " tiene la tarjeta " + cliente.getTarjeta().getNumero() +
                           " emitida por " + cliente.getTarjeta().getBanco().getNombre());
    }
    
}
