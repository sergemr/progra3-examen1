const BaseController = require('./BaseController');

class PedidosController extends BaseController {
    constructor() {
        super();
    }

    async getTotal(pedido) {
        const total = pedido.cantidad * pedido.precio;
        const iva = total * 0.15;
        const totalConIva = total + iva;

        console.log(`Total del pedido con IVA: ${totalConIva}`);

        return totalConIva;
    }
}

module.exports = PedidosController;