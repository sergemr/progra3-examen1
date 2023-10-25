package examenmontielrua.examen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController

public class ExamenRestController {
    
    @GetMapping("/pedidos")
    public void getPedidos(){
        Pedido pedidoList = new Pedido();
        pedidoList.getPedidos();
    }
    
    @PostMapping("/pedidos")
    public void addPedido(int Precio, int Cantidad, String Descripcion) {
        Pedido pedido = new Pedido(Precio,Cantidad,Descripcion);
        pedido.addPedido(pedido);
        pedido.getPedidos();
        pedido.getTotal();
    }

    @DeleteMapping("/pedidos")
    public void removePedido(int index) {
        Pedido pedido = new Pedido();
        pedido.genPedidos();
        pedido.getPedidos();
        pedido.removePedido(index);
        pedido.getPedidos();
        
    }

    @PutMapping("/pedidos")
    public void editPedido(int Precio, int Cantidad, String Descripcion, int index) {
        Pedido pedido = new Pedido(Precio,Cantidad,Descripcion);
        pedido.updateListMember(pedido,index);
        pedido.getPedidos();
    }
}
