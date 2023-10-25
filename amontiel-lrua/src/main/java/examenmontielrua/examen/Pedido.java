package examenmontielrua.examen;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private int Precio;
    private int Cantidad;
    private String Descripcion;

    public int getPrecio() {
        return Precio;
    }
    public int getCantidad(){
        return Cantidad;
    }
    public String getDescripcion(){
        return Descripcion;
    }

    public void setPrecio(int Precio){
        this.Precio = Precio;
    }
    public void setCantidad(int Cantidad){
        this.Cantidad = Cantidad;
    }
    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }

    public List<Pedido> pedidos = new ArrayList<Pedido>();

    public Pedido(){}
    public Pedido(int Precio, int Cantidad ,String Descripcion){
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
    }

    public void addPedido(Pedido pedido){
        pedidos.add (pedido);
    }    
    public void removePedido(int index){
        pedidos.remove(index);
    }
    
    public void getPedidos() {
        for (Pedido pedidoiteracion : pedidos){
            System.out.println(pedidoiteracion.getDescripcion());
        }
    }  

    public void updateListMember(Pedido pedido, int index){
        pedidos.set(index,pedido);
        this.getPedidos();
    }

    public void genPedidos(){
        Pedido pedido1 = new Pedido(100, 200, "Pedido1");
        Pedido pedido2 = new Pedido(100, 200, "Pedido2");
        pedidos.add(pedido1);
        pedidos.add(pedido2);
    }

    public void getTotal() {
        for (Pedido pedidoiteracion : pedidos){
            double PrecioA = pedidoiteracion.getPrecio();
            double Total = PrecioA+(PrecioA*(15/100));
            System.out.println(Total);
        }
    } 
}
