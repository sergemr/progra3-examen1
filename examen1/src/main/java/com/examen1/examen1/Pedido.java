package com.examen1.examen1;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cantidad;
    private String precio;
    private String descripcion;

    List<Pedido> Plist = new ArrayList<Pedido> ();

    public Pedido(String cantidad, String precio, String descripcion){
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public void getPedidoList(){
        Pedido Pedido1 = new Pedido("4","1000","Coca-Cola");
        Pedido Pedido2 = new Pedido("6","2500","Jamon");
        Pedido Pedido3 = new Pedido("10","750","Atun");

        Plist.add(Pedido1);
        Plist.add(Pedido2);
        Plist.add(Pedido3);

        for(Pedido PedidoIteracion : Plist){
            System.out.println("Descripción: " + PedidoIteracion.getDescripcion());
            System.out.println("Cantidad: " + PedidoIteracion.getCantidad());
            System.out.println("Precio: " + PedidoIteracion.getPrecio());
            System.out.println();
        }

    }

    /*AGREGA UN PEDIDO A LA LISTA (POST) */ 
    public void addPedido(Pedido pedido){
        Plist.add(pedido);
    }

    /*ACTUALIZA UN PEDIDO (PUT) */
    public void updatePedido(Pedido pedido, int index){
        this.getPedidoList();
        Plist.set(index, pedido);
    }
    /*BORRA UN PEDIDO (DELETE) */
    public void delPedido(int index){
        Plist.remove(index);
    }
    
    /*GETTERS AND SETTERS PARA LA CLASE */

    public String getCantidad() {
        return cantidad;
    }

    public String getPrecio(){
        return precio;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public void setCantidad(String cantidad){
        this.cantidad = cantidad;
    }

    public void setPrecio(String precio){
        this.precio = precio;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
