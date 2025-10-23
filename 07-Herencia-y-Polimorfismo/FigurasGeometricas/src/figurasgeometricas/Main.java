/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

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

        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Circulo(2.5);

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " → Área: " + f.calcularArea());
        }

    }
}
