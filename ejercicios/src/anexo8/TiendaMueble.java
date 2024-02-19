package anexo8;

import java.util.ArrayList;
import java.util.List;

public class TiendaMueble {
    private List<Mueble> inventario;
    private List<Cliente> clientes;

    public TiendaMueble() {
        this.inventario = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarMueble(Mueble mueble) {
        inventario.add(mueble);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Factura realizarVenta(List<Mueble> muebles, Cliente cliente, double descuentoEspecifico) {
        for (Mueble mueble : muebles) {
            mueble.restarStock(1);
            cliente.acumularPuntosFidelidad(10); 
        }

        return new Factura(muebles, cliente, descuentoEspecifico);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inventario:\n");
        for (Mueble mueble : inventario) {
            sb.append("- ").append(mueble.toString()).append("\n");
        }
        sb.append("Clientes:\n");
        for (Cliente cliente : clientes) {
            sb.append("- ").append(cliente.toString()).append("\n");
        }
        return sb.toString();
    }
}

