/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagable;

/**
 *
 * @author Rodrigo
 */
public class Transferencia implements Pagable {
    private String cuentaOrigen;
    private String cuentaDestino;

    public Transferencia(String cuentaOrigen, String cuentaDestino) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Transferencia de $" + monto + " desde " + cuentaOrigen + " hacia " + cuentaDestino);
    }
}
