package commodelo;

import conexiones.ConexionBD;
import interfaces.IConexionBD;
import modelos.ModeloPedido;


public class PersistenciaFactory {
    private static final IConexionBD conexionBD = ConexionBD.getInstance();
    public static ModeloPedido crearPersistenciaPedido(){
        return new ModeloPedido(conexionBD);
    }
}
