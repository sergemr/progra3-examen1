package examengabriel.examen;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {

    private String cantidad;
    private String descripcion;
    private String precio;
    
    private List<Pedidos> pedidos = new ArrayList<Pedidos>();
    public Pedidos(){}; //constructor bacio  
    public Pedidos(String cantidad, String precio, String descripcion) {

        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;

    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void getLista() {


        this.genLista();

        for (Pedidos pedidoslista : pedidos) {
            System.out.println(pedidoslista.getPrecio());
            System.out.println(pedidoslista.getDescripcion());
            System.out.println(pedidoslista.getCantidad());

        }
    }

    public void genLista() {
        Pedidos pedido1 = new Pedidos("Piña", "Manzana", "Pera");
        Pedidos pedido2 = new Pedidos("arroz", "pan", "aceite");
        Pedidos pedido3 = new Pedidos("coca", "frijoles", "mantequilla");

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
    }

    public void addPedidos(Pedidos pedido) {
        pedidos.add(pedido);
    }

    public void removePedidos(int index) {
        pedidos.remove(index);
    }

    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void updateListPedidos (Pedidos pedido, int index) {
        this.genLista();
        pedidos.set(index, pedido);
        this.getLista();
    }

}

