package clase8;
import java.util.ArrayList;


class TiendaElectronica {
    private ArrayList<Producto> inventario;
    private ArrayList<Cliente> clientes;

    public TiendaElectronica() {
        inventario = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
        System.out.println("Producto agregado al inventario: " + producto);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente);
    }

    public void realizarVentaAlContado(Cliente cliente, Producto producto, int cantidad) {
        if (clientes.contains(cliente) && inventario.contains(producto)) {
            producto.realizarVenta(cantidad);
            cliente.comprarAlContado(producto, cantidad);
        } else {
            System.out.println("Cliente o producto no registrados en la tienda.");
        }
    }

    public void realizarVentaAlContadoConPagoAdicional(Cliente cliente, Producto producto, int cantidad, double pagoAdicional) {
        if (clientes.contains(cliente) && inventario.contains(producto)) {
            producto.realizarVenta(cantidad, pagoAdicional);
            cliente.comprarAlContado(producto, cantidad, pagoAdicional);
        } else {
            System.out.println("Cliente o producto no registrados en la tienda.");
        }
    }

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public String toString() {
        StringBuilder tiendaInfo = new StringBuilder("Inventario actualizado:\n");
        for (Producto producto : inventario) {
            tiendaInfo.append(producto).append("\n");
        }

        tiendaInfo.append("\nClientes registrados:\n");
        for (Cliente cliente : clientes) {
            tiendaInfo.append(cliente).append("\n");
        }

        return tiendaInfo.toString();
    }
}
