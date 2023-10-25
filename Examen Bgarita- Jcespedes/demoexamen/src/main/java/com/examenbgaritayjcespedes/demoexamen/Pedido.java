package com.examenbgaritayjcespedes.demoexamen;
import java.util.ArrayList;
import java.util.List;

public class Pedido{
    private String name;
    private String description;
    private String monto;
    

    private List<Pedido> pedidos = new ArrayList<Pedido>();

    public Pedido(){};    
    public Pedido(String name, String description, String monto ) {
        this.name = name;
        this.description = description;
        this.monto = monto;
        
    }
    public String getdescription(){
        return description;
    }
      
     public String getmonto(){
        return monto;
    }
    
    public String getName() {
        return name;
    }

    public void getpedidos() {
  

        for (Pedido pedidoIteracion : pedidos) {
            System.out.println(pedidoIteracion.getName());
        }
       
    }
    public void genPedidos() {
        Pedido pedido1 = new Pedido("Mircoondas", "electrodomestico", "5000");
        Pedido pedido2 = new Pedido("Refrigerador", "electrodomestico","7000");
        Pedido pedido3 = new Pedido("crema ", "Producto de belleza", "9000");
        Pedido pedido4 = new Pedido("omega 3", "suplemento", "10000");

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
 
       
    }
    

    public void addPedido(Pedido pedido)
    {
        pedidos.add(pedido);
    }
    public void removePedido(int descripcion) {
        pedidos.remove(descripcion);
    }



   
    


    public void setName(String name) {
        this.name = name;
    }

    public void setdescription(String description) {
          this.description = description;
    }

    
    public void updateListMember (Pedido pedido, int descripcion) {
        this.genPedidos();
        pedidos.set(descripcion, pedido);
        this.getpedidos();
    }
}

