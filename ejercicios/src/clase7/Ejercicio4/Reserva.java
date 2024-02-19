package clase7.Ejercicio4;

class Reserva {
	// Atributos
	private Cliente cliente;
	private Habitacion habitacion;
	private String fechaInicio;
	private String fechaFin;

	// Constructor
	public Reserva(Cliente cliente, Habitacion habitacion, String fechaInicio, String fechaFin) {
		this.cliente = cliente;
		this.habitacion = habitacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	// Método para mostrar la información de la reserva
	public void mostrarInformacion() {
		System.out.println("Reserva para el cliente:");
		cliente.mostrarInformacion();

		System.out.println("Habitación reservada:");
		habitacion.mostrarInformacion();

		System.out.println("Fecha de inicio: " + fechaInicio);
		System.out.println("Fecha de fin: " + fechaFin);
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}
}