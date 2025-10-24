/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisionsegura;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class DivisionSegura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el numerador: ");
            int numerador = sc.nextInt();
            System.out.print("Ingrese el divisor: ");
            int divisor = sc.nextInt();

            int resultado = numerador / divisor; // Puede lanzar ArithmeticException
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            sc.close();
        }
    }
    
}
