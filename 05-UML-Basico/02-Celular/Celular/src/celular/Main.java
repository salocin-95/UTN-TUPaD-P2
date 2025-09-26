/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular;

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
        Bateria bateria = new Bateria("Samsung-BA123", "1200");
        Usuario usuario = new Usuario("Rodrigo", "34340134");
        Celular celular = new Celular("356789123456789", "Samsung", "Galaxy", bateria, usuario);
        System.out.println(bateria);
        System.out.println(usuario);
        System.out.println(celular);
    }

}
