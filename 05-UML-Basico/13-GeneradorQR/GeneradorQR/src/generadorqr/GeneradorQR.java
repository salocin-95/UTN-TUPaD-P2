/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadorqr;

/**
 *
 * @author Rodrigo
 */
public class GeneradorQR {

    // Método que crea un CodigoQR (dependencia de creación)
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("Código QR generado para " + usuario.getNombre() +
                           " (" + usuario.getEmail() + "): " + qr.getValor());
    }
    
}
