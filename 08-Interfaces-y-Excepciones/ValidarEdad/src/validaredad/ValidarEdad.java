/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validaredad;

/**
 *
 * @author Rodrigo
 */
public class ValidarEdad {

    /**
     * @param args the command line arguments
     */
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        }
        System.out.println("Edad válida: " + edad);
    }

    public static void main(String[] args) {
        try {
            validarEdad(150); // Prueba con edad inválida
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
    
}
