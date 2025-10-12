/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication50;

/**
 *
 * @author Rodrigo
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor != null) {
            // 1️⃣ Quitar este curso del profesor anterior
            this.profesor.eliminarCurso(this);
        }

        this.profesor = nuevoProfesor; // 2️⃣ Asignar nuevo profesor

        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            // 3️⃣ Asegurarse de que el profesor tenga este curso en su lista
            nuevoProfesor.agregarCurso(this);
        }
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + '}';
    }
    
    public void mostrarInfo() {
        System.out.println(this.toString());
    }
}
