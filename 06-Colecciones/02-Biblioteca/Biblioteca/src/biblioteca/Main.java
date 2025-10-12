/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

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
        Biblioteca biblioteca = new Biblioteca("Central");

        Autor autor1 = new Autor("A1", "Gabriel García Marquez", "Colombiano");
        Autor autor2 = new Autor("A2", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A3", "Jorge Luis Borges", "Argentino");

        biblioteca.agregarLibro("ISBN1", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN2", "El amor en los tiempos del colera", 1985, autor1);
        biblioteca.agregarLibro("ISBN3", "La casa de los espiritus", 1982, autor2);
        biblioteca.agregarLibro("ISBN4", "El Aleph", 1945, autor3);
        biblioteca.agregarLibro("ISBN5", "Ficciones", 1944, autor3);
        
        biblioteca.listarLibros();
        
        System.out.println("Buscando libro ISBN3:");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN3");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\nLibros del año 1945:");
        biblioteca.filtrarLibrosPorAnio(1945).forEach(Libro::mostrarInfo);

        System.out.println("\nEliminando libro ISBN2...");
        biblioteca.eliminarLibro("ISBN2");
        biblioteca.listarLibros();

        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        biblioteca.mostrarAutoresDisponibles();
    }
}
