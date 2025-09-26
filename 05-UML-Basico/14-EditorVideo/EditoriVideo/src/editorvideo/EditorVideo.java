/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package editorvideo;

/**
 *
 * @author Rodrigo
 */
public class EditorVideo {

    // Método que crea un Render (dependencia de creación)
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Proyecto '" + proyecto.getNombre() + "' exportado en formato " +
                           render.getFormato() + " (Duración: " + proyecto.getDuracionMin() + " min)");
    }
}
