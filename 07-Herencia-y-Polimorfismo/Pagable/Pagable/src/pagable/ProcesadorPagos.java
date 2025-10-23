/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagable;

/**
 *
 * @author Rodrigo
 */
public class ProcesadorPagos {
    
    public static <T extends Pagable> void procesarPago(T medio, double monto) {
        System.out.println("Procesando pago...");
        medio.pagar(monto);
        System.out.println("Pago completado!\n");
    }
}
