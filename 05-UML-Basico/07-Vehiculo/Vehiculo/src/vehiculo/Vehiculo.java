/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Rodrigo
 */
public class Vehiculo {

    private String patente;
    private String modelo;
    private Conductor conductor;
    private Motor motor;

    public Vehiculo(String patente, String modelo, Conductor conductor, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.conductor = conductor;
        this.motor = motor;
        conductor.setVehiculo(this); // Asociacion birideccional
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        conductor.setVehiculo(this);
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    
    
    
}
