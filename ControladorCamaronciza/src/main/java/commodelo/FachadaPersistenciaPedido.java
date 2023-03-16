package commodelo;

import coninterfaces.IFachadaPersistenciaPedido;
import dominio.Pedido;
import modelos.ModeloPedido;

public class FachadaPersistenciaPedido implements IFachadaPersistenciaPedido {
    private ModeloPedido modeloPedido;
    public FachadaPersistenciaPedido(){
        this.modeloPedido = PersistenciaFactory.crearPersistenciaPedido();
    }
    @Override
    public Pedido crearPedido(Pedido pedido) {
        return modeloPedido.registrar(pedido);
    }

    @Override
    public Pedido consultarPedido(Pedido pedido){
        return modeloPedido.consultar(pedido.getId());
    }

    @Override
    public Pedido eliminarPedido(Pedido pedido) {
        return modeloPedido.eliminar(pedido);
    }
}
