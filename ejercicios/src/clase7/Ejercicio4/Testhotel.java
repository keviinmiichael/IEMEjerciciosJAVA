package clase7.Ejercicio4;

public class Testhotel {
	public static void main(String[] args) {

		Habitacion habitacion1 = new Habitacion(101, "individual");
		Habitacion habitacion2 = new Habitacion(201, "doble");

		Cliente cliente1 = new Cliente("Juan Pérez", "123-456-7890");
		Cliente cliente2 = new Cliente("María Gómez", "987-654-3210");

		Reserva reserva1 = new Reserva(cliente1, habitacion1, "2022-03-01", "2022-03-07");
		Reserva reserva2 = new Reserva(cliente2, habitacion2, "2022-04-15", "2022-04-20");

		GestorReservas gestorReservas = new GestorReservas(10);

		gestorReservas.agregarHabitacion(habitacion1);
		gestorReservas.agregarHabitacion(habitacion2);

		gestorReservas.realizarReserva(reserva1);
		gestorReservas.realizarReserva(reserva2);

		gestorReservas.mostrarInformacionReservas();

		gestorReservas.mostrarOcupacionHotel("2022-04-01", "2022-04-30");
	}
}
