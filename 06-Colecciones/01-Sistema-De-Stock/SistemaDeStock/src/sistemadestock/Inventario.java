/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadestock;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class Inventario {
    
    private ArrayList<Producto> productos; 
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
            System.out.println("------------------------------------");
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        
        boolean encontrado = false;
        
        for (Producto producto : productos) {
            if(producto.getId().equalsIgnoreCase(id)) {
                System.out.println("Producto encontrado: ");
                return producto;
            
            }
        }
        
        return null;
    }
    
    public void eliminarProducto(String id) {
     
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId().equalsIgnoreCase(id)) {
                productos.remove(i);
                System.out.println("Producto eliminado con éxito.");
                System.out.println("------------------------------------");
                System.out.println("Inventario actualizado: ");
                System.out.println("------------------------------------");
                listarProductos();
                return;
            }
        }
    
        System.out.println("No se encontró ningún producto con el ID: " + id);
    
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosEncontrados = new ArrayList<>();
        
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                productosEncontrados.add(producto);
            }
        }
        
        return productosEncontrados;
    }
    
    public void actulizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.println("Stock actulizado para el producto " + producto.getNombre() +
                           ". Nueva cantidad: " + nuevaCantidad);
            System.out.println("------------------------------------");
        } else {
            System.out.println("Producto no encontrado.");
            System.out.println("------------------------------------");
        }
    } 
    
    public void obtenerTotalStock(String id) {
        Producto producto = buscarProductoPorId(id); // 👈 reutilizás tu método existente

        if (producto != null) {
            System.out.println("El producto \"" + producto.getNombre() + 
                               "\" tiene " + producto.getCantidad() + " unidades en stock.");
        } else {
            System.out.println("⚠️ No se encontró ningún producto con el ID: " + id);
        }

    }
    
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null; // Si no hay productos, devolvemos null
        }

        Producto productoMayor = productos.get(0); // 👈 Empezamos con el primero

        for (Producto producto : productos) {
            if (producto.getCantidad() > productoMayor.getCantidad()) {
                productoMayor = producto; // 👈 Guardamos el que tiene más stock
            }
        }

        return productoMayor;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();

        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                filtrados.add(producto);
            }
        }

        return filtrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " + categoria);
        }
    }

    

}
