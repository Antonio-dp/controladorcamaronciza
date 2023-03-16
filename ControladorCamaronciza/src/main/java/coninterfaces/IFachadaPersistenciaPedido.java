package coninterfaces;

import dominio.Pedido;

import java.util.List;

public interface IFachadaPersistenciaPedido {
    public void crearPedido(Pedido pedido);
    public void consultarPedido(Pedido pedido);
    public void eliminarPedido(Pedido pedido);
}
