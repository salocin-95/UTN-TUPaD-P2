/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadora;

/**
 *
 * @author Rodrigo
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Crear propietario
        Propietario propietario = new Propietario("Rodrigo", "40123456");

        // Crear computadora (composición con PlacaMadre + asociación bidireccional con Propietario)
        Computadora pc = new Computadora("Dell", "SN123456", "Z490-A PRO", "Intel Z490", propietario);

        // Mostrar detalles
        System.out.println("💻 Computadora de " + pc.getPropietario().getNombre());
        System.out.println("Marca: " + pc.getMarca());
        System.out.println("Número de Serie: " + pc.getNumeroSerie());
        System.out.println("Placa Madre: " + pc.getPlaca().getModelo() + " (" + pc.getPlaca().getChipset() + ")");
        System.out.println("Propietario también accede: " + propietario.getComputadora().getMarca());
    }
    
}
