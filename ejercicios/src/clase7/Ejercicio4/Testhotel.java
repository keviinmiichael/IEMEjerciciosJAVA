package clase7.Ejercicio4;

public class Testhotel {
	public static void main(String[] args) {

		// Crear instancias de habitaciones
		Habitacion habitacion1 = new Habitacion(101, "individual");
		Habitacion habitacion2 = new Habitacion(201, "doble");

		// Crear instancias de clientes
		Cliente cliente1 = new Cliente("Juan Pérez", "123-456-7890");
		Cliente cliente2 = new Cliente("María Gómez", "987-654-3210");

		// Crear instancias de reservas
		Reserva reserva1 = new Reserva(cliente1, habitacion1, "2022-03-01", "2022-03-07");
		Reserva reserva2 = new Reserva(cliente2, habitacion2, "2022-04-15", "2022-04-20");

		// Crear instancia del gestor de reservas
		GestorReservas gestorReservas = new GestorReservas(10);

		// Agregar habitaciones al gestor
		gestorReservas.agregarHabitacion(habitacion1);
		gestorReservas.agregarHabitacion(habitacion2);

		// Realizar reservas
		gestorReservas.realizarReserva(reserva1);
		gestorReservas.realizarReserva(reserva2);

		// Mostrar información sobre las reservas
		gestorReservas.mostrarInformacionReservas();

		// Mostrar la ocupación del hotel en un rango de fechas
		gestorReservas.mostrarOcupacionHotel("2022-04-01", "2022-04-30");
	}
}
