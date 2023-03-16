package coninterfaces;

import modelo.Pedidos;

import java.util.List;

public interface IFachadaPersistenciaPedido {
    public void crearPedido(Pedidos pedido);
    public void editarPedido(Pedidos pedido) throws Exception;
    public void eliminarPedido(Pedidos pedido);

    public List<Pedidos> consultarPedidos();
    public Pedidos consultarPedidoById(Integer id);
}
