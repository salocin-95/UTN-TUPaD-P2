/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorvideo;

/**
 *
 * @author Rodrigo
 */
public class Main {
    public static void main(String[] args) {
        // Crear proyecto
        Proyecto proyecto1 = new Proyecto("Documental Historia", 45);

        // Crear editor de video
        EditorVideo editor = new EditorVideo();

        // Exportar proyecto (dependencia de creación)
        editor.exportar("MP4", proyecto1);
    }    
}
