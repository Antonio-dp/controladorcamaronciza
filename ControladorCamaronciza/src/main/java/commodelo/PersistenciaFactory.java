package commodelo;

import persistencia.PedidosJpaController;

public class PersistenciaFactory {
    public static PedidosJpaController crearPersistenciaPedido(){
        return new PedidosJpaController();
    }
}
