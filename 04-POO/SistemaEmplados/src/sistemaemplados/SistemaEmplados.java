/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaemplados;

/**
 *
 * @author Rodrigo
 */
public class SistemaEmplados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // Crear empleados usando constructor completo
        Empleado emp1 = new Empleado(101, "Rodrigo Pérez", "Desarrollador", 50000);
        Empleado emp2 = new Empleado(102, "Ana Gómez", "Analista", 45000);

        // Crear empleados usando constructor simplificado
        Empleado emp3 = new Empleado("Luis Martínez", "Soporte");
        Empleado emp4 = new Empleado("María López", "Diseñadora");

        // Actualizar salarios
        emp1.actualizarSalario(10);                // Aumento 10%
        emp2.actualizarSalario(5000, true);       // Aumento fijo de 5000
        emp3.actualizarSalario(5);                 // Aumento 5%
        emp4.actualizarSalario(2000, true);       // Aumento fijo de 2000

        // Imprimir información de los empleados
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    
    
    }
    
}
