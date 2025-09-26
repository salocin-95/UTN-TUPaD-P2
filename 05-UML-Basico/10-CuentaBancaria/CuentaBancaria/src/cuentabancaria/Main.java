/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author Rodrigo
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
                // Crear paciente
    ClaveSeguridad clave1 = new ClaveSeguridad("ajsd11", "2025-09-26");
    
    Titular titular1 = new Titular("Rodrigo", 312314);
    
    CuentaBancaria cuenta1 = new CuentaBancaria("00023334445556667", 124124.5, clave1, titular1);
    
           // Mostrar información
        System.out.println("Cuenta Bancaria:");
        System.out.println("CBU: " + cuenta1.getCbu());
        System.out.println("Saldo: $" + cuenta1.getSaldo());
        System.out.println("Clave de seguridad: " + cuenta1.getClave().getCodigo() +
                           " (última modificación: " + cuenta1.getClave().getUltimaModificacion() + ")");
        System.out.println("Titular: " + cuenta1.getTitular().getNombre() +
                           " - DNI: " + cuenta1.getTitular().getDni());

        // Verificación bidireccional
        System.out.println("Verificación bidireccional:");
        System.out.println("El titular " + titular1.getNombre() +
                           " es dueño de la cuenta con CBU " + titular1.getCuenta().getCbu());
                
    }
}
