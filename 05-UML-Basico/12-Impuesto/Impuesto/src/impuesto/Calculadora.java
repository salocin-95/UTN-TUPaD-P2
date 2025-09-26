/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuesto;

/**
 *
 * @author Rodrigo
 */
public class Calculadora {
    
    public void calcular(Impuesto impuesto) {
        // Por ejemplo, calcular 21% de IVA
        double resultado = impuesto.getMonto() * 0.21;
        System.out.println("Impuesto a pagar para " +
                           impuesto.getContribuyente().getNombre() + ": $" + resultado);
    }
    
}
