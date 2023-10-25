package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int Cantidad;
    private int Precio;
    private String Descripcion;

    private List<Pedido> pedidos = new ArrayList<Pedido>();

    public Pedido(){};    
    public Pedido(int Cantidad, int Precio, String Descripcion) {
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
  
    }
    
    public int getCantidad() {
        return Cantidad;
    }

    public void getPedidos() {
  

        for (Pedido pedidoIteracion : pedidos) {
            System.out.println(pedidoIteracion.getCantidad());
        }
       
    }
    public void genPedidos() {
        Pedido pedido1 = new Pedido(1, 50000, "Tennis");
        Pedido pedido2 = new Pedido(2, 20000, "Camisa");
        Pedido pedido3 = new Pedido(3, 80000, "Pantalon");
        Pedido pedido4 = new Pedido(4, 100000, "Bolso");

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
 
       
    }

    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public void removePedido(int index) {
        pedidos.remove(index);
    }

    public int getPrecio() {
        return Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setPrecio(int Precio) {
          this.Precio = Precio;
    }

    public void setDescripcion(String Descripcion) {
          this.Descripcion = Descripcion;
    }

    public void updateListMember (Pedido pedido, int index) {
        this.genPedidos();
        pedidos.set(index, pedido);
        this.getPedidos();
    }

    public static double getTotal(double Precio){
        double total = Precio * 1.15;
        return total;
    }
}
