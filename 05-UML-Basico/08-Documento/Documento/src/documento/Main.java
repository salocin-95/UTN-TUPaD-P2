/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documento;

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
        Usuario usuario1 = new Usuario("Rodrigo", "rodrigo@gmail.com");
        System.out.println(usuario1);
        FirmaDigital firma1 = new FirmaDigital("HASH123ABC", "2025-09-06", usuario1);
        System.out.println(firma1);
        Documento doc1 = new Documento("Contrato", "Contenido del documento", firma1);
        System.out.println(doc1);
    }
}
