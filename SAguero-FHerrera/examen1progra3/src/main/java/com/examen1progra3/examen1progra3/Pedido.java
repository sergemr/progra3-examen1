package com.examen1progra3.examen1progra3;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int cantidad;
    private Double precio;
    private String descripcion;
    private List<Pedido> listaPedidos = new ArrayList<Pedido>();

    public Pedido(int cantidad, Double precio, String descripcion) {
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
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void genPedidos(){
        Pedido pedido1 = new Pedido(1, 1000.25, "Bicicleta");
        Pedido pedido2 = new Pedido(2, 250.68, "Mouse");
        Pedido pedido3 = new Pedido(6, 300.00, "Teclado");
        Pedido pedido4 = new Pedido(5, 658.10, "Laptop");
        Pedido pedido5 = new Pedido(10, 500.63, "Audifonos");
        Pedido pedido6 = new Pedido(1, 25.10, "Televizor");

        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);
        listaPedidos.add(pedido4);
        listaPedidos.add(pedido5);
        listaPedidos.add(pedido6);

    }
    
    public void getPedidos(){
        System.out.println("------------------------------------------------------------------");
        for(Pedido pedidoIterador : listaPedidos){
            System.out.println("Cantidad: " + pedidoIterador.getCantidad() + " - Precio: " + pedidoIterador.getPrecio() + " - Descripcion: "+ pedidoIterador.getDescripcion());
        }
        System.out.println("------------------------------------------------------------------");
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

    public String getTotal(){
        Double total = 0.0;
        Double totalIVA = 0.0;
        Double iva = 0.0;
        for(Pedido pedidoIterador : listaPedidos){
            total = total + pedidoIterador.getPrecio();
        }
        iva = total * 0.15;
        totalIVA = total * 1.15;
        return "Total: " + total.toString() + " - IVA: "+iva.toString() + " - Total Con IVA: "+totalIVA.toString();
    }
}
