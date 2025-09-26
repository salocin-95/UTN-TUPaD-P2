/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;

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
        Cliente cliente1 = new Cliente("Rodrigo", "1231231244");
        Mesa mesa1 = new Mesa(12,4);
        Reserva reserva1 = new Reserva("25/09/2025", "20:30", cliente1, mesa1);
        System.out.println("Detalle de la reserva:");
        System.out.println("Fecha: " + reserva1.getFecha());
        System.out.println("Hora: " + reserva1.getHora());
        System.out.println("Cliente: " + reserva1.getCliente().getNombre() + 
                           " (Tel: " + reserva1.getCliente().getTelefono() + ")");
        System.out.println("Mesa: Nº" + reserva1.getMesa().getNumero() + 
                           " - Capacidad: " + reserva1.getMesa().getCapacidad() + " personas");
    }
    
    
}
