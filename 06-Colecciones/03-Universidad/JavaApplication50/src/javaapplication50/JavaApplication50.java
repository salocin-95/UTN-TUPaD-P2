/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication50;

/**
 *
 * @author Rodrigo
 */
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Universidad uni = new Universidad("Universidad Tecnologica Nacional");
        
        Profesor prof1 = new Profesor("01", "Ana Gomez", "Matematica");
        Profesor prof2 = new Profesor("02", "Luis Perez", "Fisica");
        Profesor prof3 = new Profesor("03", "Maria Lopez", "Programacion");
        
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);
        
        Curso curso1 = new Curso("C101", "Algebra");
        Curso curso2 = new Curso("C102", "Calculo");
        Curso curso3 = new Curso("C201", "Fisica I");
        Curso curso4 = new Curso("C301", "Programacion I");
        Curso curso5 = new Curso("C302", "Programacion II");
        
        uni.agregarCurso(curso1);
        uni.agregarCurso(curso2);
        uni.agregarCurso(curso3);
        uni.agregarCurso(curso4);
        uni.agregarCurso(curso5);
        
        uni.asignarProfesorACurso("C101", "P1"); // Algebra → Ana
        uni.asignarProfesorACurso("C102", "P1"); // Cálculo → Ana
        uni.asignarProfesorACurso("C201", "P2"); // Fisica I → Luis
        uni.asignarProfesorACurso("C301", "P3"); // Programacion I → María
        uni.asignarProfesorACurso("C302", "P3"); // Programacion II → María
        
        uni.listarCursos();
        
        uni.listarProfesores();
        
        System.out.println("\nCambiando profesor de Algebra a Luis Perez...");
        curso1.setProfesor(prof2); // Algebra ahora tiene a Luis

        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("\nEliminando curso C102 (Calculo)...");
        uni.eliminarCurso("C102");

        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("\nEliminando profesor María López...");
        uni.eliminarProfesor("P3");

        uni.listarCursos();
        uni.listarProfesores();
        
        System.out.println("\nCantidad de cursos por profesor:");
        for (Profesor p : new Profesor[]{prof1, prof2, prof3}) {
            System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " curso(s)");
        }
    }
    
}
