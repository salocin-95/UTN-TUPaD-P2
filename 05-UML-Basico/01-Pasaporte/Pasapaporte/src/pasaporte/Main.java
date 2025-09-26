/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasaporte;

/**
 *
 * @author Rodrigo
 */
public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto("selfie.png", "PNG");
        Titular titular = new Titular("Rodrigo", "40123456");

        Pasaporte pasaporte = new Pasaporte("AR123456", "25/09/2025", foto, titular);

        System.out.println(pasaporte);
        System.out.println("El titular " + titular.getNombre() + " tiene el pasaporte: " + titular.getPasaporte().getNumero());
    }
}
