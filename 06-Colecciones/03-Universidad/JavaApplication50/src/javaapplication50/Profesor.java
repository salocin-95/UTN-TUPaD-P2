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
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);          // 1️⃣ Agregar a la lista
            if (c.getProfesor() != this) {
                c.setProfesor(this); // 2️⃣ Sincronizar el lado del curso
            }
        }
    }
    
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);       // 1️⃣ Quitar de la lista
            if (c.getProfesor() == this) {
                c.setProfesor(null); // 2️⃣ Romper la relación desde el curso
            }
        }
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad;
    }
    
    public void mostrarInfo() {
        System.out.println(this.toString());
    }

}
