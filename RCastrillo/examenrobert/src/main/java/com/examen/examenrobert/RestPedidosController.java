package com.examen.examenrobert;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestPedidosController {
    
    @GetMapping("/pedido")
    public Pedido getPedido() {
        return new Pedido("omega 3", "suplemento", "10");
    }

    @GetMapping("/pedidos")
    public void getpedidos() {
       Pedido pediList = new Pedido();
         pediList.getpedidos();
    }

    @PostMapping("/pedido")
    public void addPedido(String name, String type, String amount){
        Pedido pedido = new Pedido( name,  type,  amount);
        pedido.addPedido(pedido);
        pedido.getpedidos();
    }

     @PutMapping("/pedido")
    public void editPedido(String name, String type, String amount, int descripcion){
        Pedido pedido = new Pedido( name,  type,  amount);
        pedido.updateListMember(pedido,descripcion);
        pedido.getpedidos();
    }
    @DeleteMapping("/pedido")
    public void delPedido(int descripcion ){
        Pedido pedido = new Pedido();
        pedido.genPedidos();
        pedido.genPedidos();
        pedido.removePedido(descripcion);
        pedido.genPedidos();
    }

}
