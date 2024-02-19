package anexo9.Banco;

public class SistemaBancario {
    public static void main(String[] args) {
        Banco banco = new Banco("Mi Banco", 0.05);

        Cliente cliente1 = new Cliente("Cliente1");
        CuentaBancaria cuentaPrincipal1 = new CuentaPrincipal("123456");
        CuentaBancaria cuentaAhorro1 = new CuentaAhorro("789012");
        cliente1.agregarCuenta(cuentaPrincipal1);
        cliente1.agregarCuenta(cuentaAhorro1);
        banco.agregarCliente(cliente1);

        Cliente cliente2 = new Cliente("Cliente2");
        CuentaBancaria cuentaPrincipal2 = new CuentaPrincipal("345678");
        CuentaBancaria cuentaAhorro2 = new CuentaAhorro("901234");
        cliente2.agregarCuenta(cuentaPrincipal2);
        cliente2.agregarCuenta(cuentaAhorro2);
        banco.agregarCliente(cliente2);

        cuentaPrincipal1.depositar(1000);
        cuentaPrincipal1.retirar(200);
        cuentaPrincipal1.transferir(cuentaAhorro1, 300);

        cuentaPrincipal2.depositar(1500);
        cuentaPrincipal2.retirar(500);
        cuentaPrincipal2.transferir(cuentaAhorro2, 700);

        banco.realizarPrestamo(cliente1, 500);
        banco.realizarPrestamo(cliente2, 800);

        banco.imprimirResumenFinanciero();
    }
}
