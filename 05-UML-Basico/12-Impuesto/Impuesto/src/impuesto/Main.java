/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuesto;

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
        // Crear contribuyente
        Contribuyente contribuyente1 = new Contribuyente("Rodrigo", "20-12345678-9");

        // Crear impuesto
        Impuesto impuesto1 = new Impuesto(10000.0, contribuyente1);

        // Crear calculadora
        Calculadora calculadora = new Calculadora();

        // Usar el método calcular (dependencia de uso)
        calculadora.calcular(impuesto1);
    }
}
