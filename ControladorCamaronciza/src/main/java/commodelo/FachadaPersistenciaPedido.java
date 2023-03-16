package commodelo;

import coninterfaces.IFachadaPersistenciaPedido;
import modelo.Pedidos;
import persistencia.PedidosJpaController;
import persistencia.exceptions.IllegalOrphanException;
import persistencia.exceptions.NonexistentEntityException;

import java.util.List;

public class FachadaPersistenciaPedido implements IFachadaPersistenciaPedido {
    private PedidosJpaController modeloPedido;
    public FachadaPersistenciaPedido(){
        this.modeloPedido = PersistenciaFactory.crearPersistenciaPedido();
    }
    @Override
    public void crearPedido(Pedidos pedido) {
        modeloPedido.create(pedido);
    }

    @Override
    public void editarPedido(Pedidos pedido) throws Exception {
        modeloPedido.edit(pedido);
    }

    @Override
    public void eliminarPedido(Pedidos pedido) {
        try {
            modeloPedido.destroy(pedido.getIdPedido());
        } catch (IllegalOrphanException e) {
            throw new RuntimeException(e);
        } catch (NonexistentEntityException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Pedidos> consultarPedidos() {
        return modeloPedido.findPedidosEntities();
    }

    @Override
    public Pedidos consultarPedidoById(Integer id) {
        return modeloPedido.findPedidos(id);
    }
}
