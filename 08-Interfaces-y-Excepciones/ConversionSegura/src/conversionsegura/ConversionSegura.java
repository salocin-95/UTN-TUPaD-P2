/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionsegura;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class ConversionSegura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto); // Puede lanzar NumberFormatException
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada inválida, no es un número entero.");
        } finally {
            sc.close();
        }
    }
    
}
