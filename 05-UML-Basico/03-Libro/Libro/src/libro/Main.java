/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

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
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires, Argentina");
        Libro libro = new Libro("Cien Años de Soledad", "978-84-376-0494-7", autor, editorial);

        System.out.println(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' fue escrito por " + libro.getAutor().getNombre());
    }
}
