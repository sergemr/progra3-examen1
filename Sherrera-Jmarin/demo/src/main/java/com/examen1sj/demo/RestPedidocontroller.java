package com.examen1sj.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestPedidocontroller {
    Pedido misPedidos = new Pedido();
    
    @GetMapping("/getPedidos")
    public String genPedidos(){
        misPedidos.genPedidos();
        return "Pedidos generados";
    }
    
    @GetMapping("/pedido")
    public String getPedidos(){
        misPedidos.getPedidos();
        return "Pedido";
    }

    @PostMapping("/postpedido")
    public void addPedido(int cantidad, int precio, String descripcion){
        Pedido miPedido = new Pedido(cantidad, precio, descripcion);
        misPedidos.addPedido(miPedido);
        misPedidos.getPedidos();
    }

    @PutMapping("/pedido")
    public void editPedido(int index, int cantidad, int precio, String descripcion){
        Pedido elPedido = new Pedido(cantidad, precio, descripcion);
        misPedidos.updateListMember(elPedido, index);
        misPedidos.getPedidos();
    }

    @DeleteMapping("/pedido")
    public String deletePedido(int index){
        misPedidos.removePedido(index);
        misPedidos.getPedidos();
        return "Pedido eliminado";
    }

}
