/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        System.out.println("Libro agregado: " + titulo);
    }
    
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("\n📚 Libros en la biblioteca " + nombre + ":");
        libros.forEach(Libro::mostrarInfo);
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("🗑️ Libro eliminado: " + libro);
        } else {
            System.out.println("❌ No se encontró un libro con ISBN " + isbn);
        }
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
    public void mostrarAutoresDisponibles() {
        System.out.println("\nAutores disponibles:");

        ArrayList<Autor> autoresMostrados = new ArrayList<>();

        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (!autoresMostrados.contains(autor)) {
                System.out.println("- " + autor);
                autoresMostrados.add(autor);
            }
        }

        if (autoresMostrados.isEmpty()) {
            System.out.println("No hay autores disponibles.");
        }
    }
}
