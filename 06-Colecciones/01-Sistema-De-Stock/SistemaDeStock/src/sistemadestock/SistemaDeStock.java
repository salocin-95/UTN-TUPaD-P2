/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadestock;

/**
 *
 * @author Rodrigo
 */
public class SistemaDeStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inventario inventario = new Inventario();
        Producto mesa = new Producto("123", "mesa", 95000.0, 15, CategoriaProducto.HOGAR);
        Producto microondas = new Producto("345", "microondas", 100000.0, 30, CategoriaProducto.ELECTRONICA);
        Producto jeans = new Producto("543", "jeans", 60000.0, 100, CategoriaProducto.ROPA);
        Producto arroz = new Producto("995", "arroz", 1500.0, 50, CategoriaProducto.ALIMENTOS);
        Producto silla = new Producto("125", "silla", 2400.0, 100, CategoriaProducto.HOGAR);

        inventario.agregarProducto(mesa);
        inventario.agregarProducto(microondas);
        inventario.agregarProducto(jeans);
        inventario.agregarProducto(arroz);
        inventario.agregarProducto(silla);
        
        inventario.listarProductos();
        
        inventario.buscarProductoPorId("12");
        inventario.buscarProductoPorId("123");
       
        System.out.println(inventario.productosPorCategoria(CategoriaProducto.HOGAR)); 
        
        inventario.eliminarProducto("123");
        
        inventario.actulizarStock("15", 0);
        inventario.actulizarStock("125", 150);

        
    }
    
}
