/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaemplados;

/**
 *
 * @author Rodrigo
 */
public class Empleado {
    
    // Atributos de instancia
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributo estático para contar empleados
    private static int totalEmpleados = 0;
    
    // Atributo estático para generar ID automático
    private static int siguienteId = 1;
    
    // Constructor que recibe los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
            this.id = id;
            this.nombre = nombre;
            this.puesto = puesto;
            this.salario = salario;
            totalEmpleados++;
    }

    // Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = siguienteId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000;
        totalEmpleados++;        
    }
    
    // Método sobrecargado para actualizar salario por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario* porcentaje / 100;
    }
    
    // Método sobrecargado para actualizar salario por cantidad fija
    public void actualizarSalario(double cantidad, boolean esCantidadFija) {
        if (esCantidadFija) {
            this.salario += cantidad;
        }
    }
    
    // Métdo toString para representar al emplado
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }
    
    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
}
