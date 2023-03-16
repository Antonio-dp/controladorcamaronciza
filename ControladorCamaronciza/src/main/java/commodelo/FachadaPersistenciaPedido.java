package commodelo;

import coninterfaces.IFachadaPersistenciaPedido;
import dominio.Pedido;

import java.util.List;
import modelos.ModeloPedido;

public class FachadaPersistenciaPedido implements IFachadaPersistenciaPedido {
    private ModeloPedido modeloPedido;
    public FachadaPersistenciaPedido(){
        this.modeloPedido = PersistenciaFactory.crearPersistenciaPedido();
    }
    @Override
    public void crearPedido(Pedido pedido) {
        modeloPedido.registrar(pedido);
    }

    @Override
    public void consultarPedido(Pedido pedido){
        modeloPedido.consultar(pedido.getId());
    }

    @Override
    public void eliminarPedido(Pedido pedido) {
        modeloPedido.eliminar(pedido);
    }
}
