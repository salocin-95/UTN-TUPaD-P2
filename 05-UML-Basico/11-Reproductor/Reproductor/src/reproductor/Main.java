/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor;

/**
 *
 * @author Rodrigo
 */
public class Main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear artista
        Artista artista1 = new Artista("The Beatles", "Rock");

        // Crear canción
        Cancion cancion1 = new Cancion("Hey Jude", artista1);

        // Crear reproductor
        Reproductor reproductor = new Reproductor();

        // Usar el método reproducir (dependencia de uso)
        reproductor.reproducir(cancion1);
    }
    
}
