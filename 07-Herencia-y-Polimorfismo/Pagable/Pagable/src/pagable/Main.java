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
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9876-5432");
        Transferencia transferencia = new Transferencia("Cuenta001", "Cuenta002");
        Efectivo efectivo = new Efectivo();

        // Procesamos los pagos con un mismo método genérico
        ProcesadorPagos.procesarPago(tarjeta, 15000);
        ProcesadorPagos.procesarPago(transferencia, 50000);
        ProcesadorPagos.procesarPago(efectivo, 2000);
    }
}
