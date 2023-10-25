package examengabriel.examen;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestPedidosController {

    @GetMapping("/pedidos")
    public Pedidos getPedidos(){
        return new Pedidos("pedido 1", "pedido 2", "pedido 3");
    }

     @GetMapping("/pedido")
    public void getLista(){
        System.out.println("genLista");
        Pedidos pedidosLista = new Pedidos(); 
        pedidosLista.genLista();
        
    }
    
    @PostMapping("/pedidos")
    public void addLista(String cantidad, String precio, String descripcion){
        Pedidos pedidos = new Pedidos(cantidad,precio,descripcion);
        pedidos.addPedidos(pedidos);
        pedidos.getLista();

    }

     @PutMapping("/pedidos")
    public void addPedidos(String cantidad, String precio, String descripcion, int index){
        Pedidos pedidos = new Pedidos(cantidad, descripcion, precio);
        pedidos.updateListPedidos(pedidos, index);
        pedidos.getLista();

    }

    @DeleteMapping("/pedidos")
    public void removePedidos(int index){
        Pedidos pedidos = new Pedidos();
        pedidos.genLista();
        pedidos.getLista();
        pedidos.removePedidos(index);
        
    }



}
