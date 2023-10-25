package com.examen1.examen1;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class RestPedidoController {
    
     @GetMapping("/get")
    public void getPedidoList(){
        Pedido Plist = new Pedido(null,null,null);
        Plist.getPedidoList();
    }

    @PostMapping("/post")
    public void addPedido(String cantidad, String precio, String descripcion){
        Pedido pedido = new Pedido(cantidad,precio,descripcion);
        pedido.addPedido(pedido);
        pedido.getPedidoList();
    }

    @PutMapping("/edit")
    public void updatePedido(String cantidad, String precio, String descripcion, int index){
        Pedido pedido = new Pedido(cantidad,precio,descripcion);
        pedido.updatePedido(pedido, index);
        pedido.getPedidoList();
    }

    @DeleteMapping("/delete")
    public void delPedido(int index){
        Pedido pedido = new Pedido(null, null, null);
        pedido.getPedidoList();
        pedido.delPedido(index);
        pedido.getPedidoList();
    }
}
