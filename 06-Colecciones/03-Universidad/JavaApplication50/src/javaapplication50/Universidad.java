/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication50;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        }
    }
    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            System.out.println("Curso agregado: " + c.getNombre());
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("Asignado " + profesor.getNombre() + " al curso " + curso.getNombre());
        } else {
            System.out.println("Curso o profesor no encontrado");
        }
    }
    
    public void listarProfesores() {
        System.out.println("\nProfesores:");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("\nCursos:");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + curso.getNombre());
        } else {
            System.out.println("No se encontró el curso con código: " + codigo);
        }
    }

        public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            
            ArrayList<Curso> listaCursos = new ArrayList<>(profesor.getCursos());
            for (Curso c : listaCursos) {
                profesor.eliminarCurso(c);
            }
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + profesor.getNombre());
        } else {
            System.out.println("No se encontró profesor con id: " + id);
        }
    }
}
