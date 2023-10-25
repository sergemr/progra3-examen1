package com.examen1.examen1;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestPedidoController {

    

    @GetMapping("/pedidos")
    public void getPedidos(){
        Pedido listaPedido = new Pedido();
        listaPedido.generarPedido();
        listaPedido.getPedidos();
    }

    @PostMapping("/pedidos")
    public void addPedido(int cantidad, double precio, String descripcion){
        Pedido pedido = new Pedido( cantidad, precio,  descripcion);
        pedido.addPedido(pedido);
        pedido.getPedidos();
    }

    @PutMapping("/pedidos")
    public void updateCantidadPedido(int cantidad, double precio, String descripcion, int index){
        Pedido pedido = new Pedido( cantidad, precio,  descripcion);
        pedido.updateCantidadPedido(pedido, index);
        pedido.getPedidos();
    }

    @DeleteMapping("/pedidos")
    public void delAlmacen(int index ){
        Pedido pedido = new Pedido();
        pedido.generarPedido();
        pedido.getPedidos();
        pedido.removePedido(index);
        pedido.getPedidos();
    }
}
