/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citamedica;

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
                // Crear paciente
        Paciente paciente1 = new Paciente("Ana López", "OSDE");

        // Crear profesional
        Profesional profesional1 = new Profesional("Dr. Pérez", "Cardiología");

        // Crear cita médica
        CitaMedica cita1 = new CitaMedica("2025-10-05", "10:30", paciente1, profesional1);

        // Mostrar información
        System.out.println("Cita médica:");
        System.out.println("Fecha: " + cita1.getFecha());
        System.out.println("Hora: " + cita1.getHora());
        System.out.println("Paciente: " + cita1.getPaciente().getNombre() +
                           " (Obra social: " + cita1.getPaciente().getObraSocial() + ")");
        System.out.println("Profesional: " + cita1.getProfesional().getNombre() +
                           " - Especialidad: " + cita1.getProfesional().getEspecialidad());
    }
}
