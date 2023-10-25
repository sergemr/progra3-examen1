package com.examen1.examen1;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int cantidad;
    private double precio;
    private String descripcion;
    private double total;

    private List <Pedido> pedidos = new ArrayList<Pedido>();
    public Pedido(){}

    public Pedido(int cantidad, double precio, String descripcion){
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        
    }


    

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotal() {
        return total;
    }
 
    public void setTotal(double total) {
        this.total = total;
    }

    public void generarPedido(){
        Pedido pedido1 = new Pedido(3,10000, "Caldosa");
        pedido1.setTotal(getTotalFinal(pedido1.precio));
        Pedido pedido2 = new Pedido(7, 6678, "mesa");
        pedido2.setTotal(getTotalFinal(pedido2.precio));
        Pedido pedido3 = new Pedido(8, 34576, "silla");
        pedido3.setTotal(getTotalFinal(pedido3.precio));
        Pedido pedido4 = new Pedido(6, 764329, "cubeta");
        pedido4.setTotal(getTotalFinal(pedido4.precio));
        Pedido pedido5 = new Pedido(2, 99730, "rastrillo");
        pedido5.setTotal(getTotalFinal(pedido5.precio));
        
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
        pedidos.add(pedido5);
    }

    public void getPedidos(){
        for(Pedido elPedido : pedidos){
            System.out.println("Cantidad: " + elPedido.getCantidad() +"\n" +"Precio: "+elPedido.getPrecio() +"\n" + "Desc: " + elPedido.getDescripcion() + "\n" + "Total: " + elPedido.getTotal());
        }
    }

    public void addPedido(Pedido pedido)
    {
        pedido.setTotal(getTotalFinal(pedido.precio));
        pedidos.add(pedido);
    }

    public void removePedido(int index) {
        pedidos.remove(index);
    }


    public void updatePedido (Pedido pedido, int index) {
        this.generarPedido();
        pedido.setTotal(getTotalFinal(pedido.precio));
        pedidos.set(index, pedido);
        this.getPedidos();
    }

    public double getTotalFinal(double totales){
        double calculo=totales*1.15;
        return calculo;
    }




}


