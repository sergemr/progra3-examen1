package com.sophiaynaomy.sophiaynaomy;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResAlmacenController {
   
    @GetMapping("/pedido")
    public Almacen getProducto() {
        return new Almacen("perlas", "Pendientes de perlas marinas", 40, 10000);
    }


    @GetMapping("/pedidos")
    public void getAnimals() {
       Almacen productosList = new Almacen();
         productosList.getProducto();
    }

    @PostMapping("/pedidos")
    public void addProducto(String Producto, String Descripcion,int Cantidad, int Precio){
        Almacen producto = new Almacen(Producto, Descripcion, Cantidad, Precio);
        producto.addProductos(producto);
        producto.getProducto();
    }

    @PutMapping("/pedidos")
    public void editProducto(String Producto, String Descripcion,int Cantidad, int Precio, int index){
        Almacen producto = new Almacen(Producto, Descripcion, Cantidad, Precio);
        producto.updateListMember(producto, index);
        producto.getProducto();
    }
    @DeleteMapping("/pedidos")
    public void delAnimal(int index ){
        Almacen productos = new Almacen();
        productos.genProductos();
        productos.getProductos();
        productos.removeProductos(index);
        productos.getProductos();
    }

}

