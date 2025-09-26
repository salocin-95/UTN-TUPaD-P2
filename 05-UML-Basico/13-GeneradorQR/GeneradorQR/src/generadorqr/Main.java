/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorqr;

/**
 *
 * @author Rodrigo
 */
public class Main {
    public static void main(String[] args) {
    // Crear usuario
    Usuario usuario1 = new Usuario("Rodrigo", "rodrigo@mail.com");

    // Crear generador de QR
    GeneradorQR generador = new GeneradorQR();

    // Generar un código QR (dependencia de creación)
    generador.generar("QR-123456789", usuario1);
    }
}
