/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rodrigo
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 150000));
        empleados.add(new EmpleadoTemporal("Luis", 120, 1500));
        empleados.add(new EmpleadoTemporal("Marta", 100, 1300));
        empleados.add(new EmpleadoPlanta("Carlos", 180000));

        for (Empleado e : empleados) {
            double sueldo = e.calcularSueldo(); // ← Polimorfismo
            System.out.println(e.getNombre() + " cobra $" + sueldo);

            // Clasificación usando instanceof
            if (e instanceof EmpleadoPlanta) {
                System.out.println("- Es un empleado de planta.\n");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("- Es un empleado temporal.\n");
            }
        }
    }
}