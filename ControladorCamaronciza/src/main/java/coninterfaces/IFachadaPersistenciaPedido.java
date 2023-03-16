package coninterfaces;

import dominio.Pedido;

import java.util.List;

public interface IFachadaPersistenciaPedido {
    public Pedido crearPedido(Pedido pedido);
    public Pedido consultarPedido(Pedido pedido);
    public Pedido eliminarPedido(Pedido pedido);
}
