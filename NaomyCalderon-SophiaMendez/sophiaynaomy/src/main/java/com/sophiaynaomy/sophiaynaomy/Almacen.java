package com.sophiaynaomy.sophiaynaomy;

import java.util.ArrayList;
import java.util.List;


public class Almacen {

    private String Producto;//precio,cantidad y producto
    private String Descripcion;
    private int Cantidad;
    private int Precio;

    private List<Almacen> productos = new ArrayList<Almacen>();

    public Almacen(){}; //constructor    
    public Almacen(String Producto, String Descripcion,int Cantidad, int Precio) {
        this.Producto = Producto;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }

    public String getProducto() {
        return Producto;
    }
    
    public void getProductos() {
  

        for (Almacen producto : productos) {
            System.out.println(producto.getProducto());
        }
       
    }

    public void genProductos() {
        Almacen Producto1 = new Almacen ("collar", "perlas y jollas", 65, 2000);
        Almacen Producto2 = new Almacen("anillo", "diamante", 5, 600000);
        Almacen Producto3 = new Almacen ("pulsera", "piedras", 7,8000);
        Almacen Producto4 = new Almacen ("pulsera", "piedras", 7,8000);
        
        productos.add(Producto1);
        productos.add(Producto2);
        productos.add(Producto3);
        productos.add(Producto4);
    }

    public void addProductos(Almacen productos) {
        productos.addProductos(productos);
    }

    public void removeProductos(int index) { 
        productos.remove(index);
    }

    public String getDescripcion()
    {
        return Descripcion;
    }

    public int getCantidad()
    {
        return Cantidad;
    }

    public int getPrecio()
    {
        return Precio;
    }

    public void setProducto (String Producto)
    {
        this.Producto = Producto;
    }

     public void setDescripcion (String Descripcion)
    {
        this.Descripcion = Descripcion;
    }

    public void setCantidad (int Cantidad)
    {
        this.Cantidad = Cantidad;
    }

    public void setPrecio (int Precio)
    {
        this.Precio = Precio;
    }

    public void updateListMember (Almacen Producto, int index) {
        this.genProductos();
        Almacen Producto2 = new Almacen("anillo", "diamante", 5, 600000);
        productos.add(Producto2);
        productos.set(index, Producto2);
        this.getProductos(); 

 }

}