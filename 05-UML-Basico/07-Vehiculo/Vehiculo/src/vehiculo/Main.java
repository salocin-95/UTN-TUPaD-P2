/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Rodrigo
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Motor motor1 = new Motor("V8", "MTR-987654");
        Conductor conductor1 = new Conductor("Rodrigo", "LIC-456789");

        // Crear vehículo con motor y conductor de una sola vez
        Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Ford Mustang", conductor1,  motor1);

        System.out.println("Vehículo: " + vehiculo1.getModelo() + " (" + vehiculo1.getPatente() + ")");
        System.out.println("Motor: " + vehiculo1.getMotor().getTipo());
        System.out.println("Conductor: " + vehiculo1.getConductor().getNombre());

        // Verificación bidireccional
        System.out.println("El conductor " + conductor1.getNombre() +
                           " conduce el vehículo con patente " + conductor1.getVehiculo().getPatente());
    }
    
}
