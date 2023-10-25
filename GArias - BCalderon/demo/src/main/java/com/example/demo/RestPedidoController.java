package com.example.demo;

//import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@RequestMapping("/pedido")
public class RestPedidoController {
        
    @GetMapping("/pedido")
    public Pedido getPedido() {
        return new Pedido(0, 0, null);
    }

    @GetMapping("/pedidos")
    public void getPedidos() {
       Pedido pedidoList = new Pedido();
         pedidoList.getPedidos();
    }

    @PostMapping("/pedido")
    public void addPedido(int Cantidad, int Precio, String Descripcion){
        System.out.println(Cantidad + Precio + Descripcion);
        Pedido pedido = new Pedido(Cantidad, Precio, Descripcion);
        pedido.addPedido(pedido);
        pedido.getPedidos();
    }

     @PutMapping("/pedido")
    public void editPedido(int Cantidad, int Precio, String Descripcion, int index){
        System.out.println(Cantidad + Precio + Descripcion + index);
        Pedido pedido = new Pedido(Cantidad, Precio, Descripcion);
        pedido.updateListMember(pedido, index);
        pedido.getPedidos();
    }
    @DeleteMapping("/pedido")
    public void delPedido(int index ){
        Pedido pedido = new Pedido();
        pedido.genPedidos();
        pedido.getPedidos();
        pedido.removePedido(index);
        pedido.getPedidos();
    }

}
