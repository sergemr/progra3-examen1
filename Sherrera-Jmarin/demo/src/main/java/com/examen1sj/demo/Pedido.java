package com.examen1sj.demo;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int cantidad;
    private int precio;
    private String descripcion;
    private List<Pedido> listaPedidos = new ArrayList<Pedido>();

    public Pedido(int cantidad, int precio, String descripcion) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Pedido() {
    }
    

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void genPedidos(){
        Pedido pedido1 = new Pedido(1, 1500, "Tennis");
        Pedido pedido2 = new Pedido(6, 2, "Zapatos");
        Pedido pedido3 = new Pedido(4, 380, "Robot");
        Pedido pedido4 = new Pedido(3, 1558, "Escoba");
        Pedido pedido5 = new Pedido(1, 600, "Headset");

        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);
        listaPedidos.add(pedido4);
        listaPedidos.add(pedido5);

    }
    
    public void getPedidos(){
        for(Pedido pedidoIterador : listaPedidos){
            System.out.println(pedidoIterador.getCantidad()+ pedidoIterador.getPrecio()+ pedidoIterador.getDescripcion());
        }
    }

    public void addPedido(Pedido Pedido){
        listaPedidos.add(Pedido);
    }

    public void removePedido(int index) {
        listaPedidos.remove(index);
    }

    public void updateListMember (Pedido Pedido, int index) {
        listaPedidos.set(index, Pedido);
    }


}
