/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagable;

/**
 *
 * @author Rodrigo
 */
public class Efectivo implements Pagable {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago en efectivo de $" + monto);
    }
}