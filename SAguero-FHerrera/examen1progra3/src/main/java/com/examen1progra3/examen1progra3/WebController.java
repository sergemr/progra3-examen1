package com.examen1progra3.examen1progra3;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {
    Pedido misPedidos = new Pedido();
    
    @GetMapping("/getTotal")
    public String getTotal(){
        System.out.println("Total: "+misPedidos.getTotal());
        return misPedidos.getTotal();
    }

    @GetMapping("/genPedidos")
    public String genPedidos(){
        misPedidos.genPedidos();
        return "Pedidos genericos fueron creados";
    }
    
    @GetMapping("/pedido")
    public String getPedidos(){
        misPedidos.getPedidos();
        return "Pedido imprimidos en consolda";
    }

    @PostMapping("/pedido")
    public void addPedido(int cantidad, Double precio, String descripcion){
        Pedido miPedido = new Pedido(cantidad, precio, descripcion);
        misPedidos.addPedido(miPedido);
        misPedidos.getPedidos();
    }

    @PutMapping("/pedido")
    public void editPedido(int index, int cantidad, Double precio, String descripcion){
        Pedido elPedido = new Pedido(cantidad, precio, descripcion);
        misPedidos.updateListMember(elPedido, index);
        misPedidos.getPedidos();
    }

    @DeleteMapping("/pedido")
    public String deletePedido(int index){
        misPedidos.removePedido(index);
        misPedidos.getPedidos();
        return "Pedido eliminado con exito!";
    }

}
