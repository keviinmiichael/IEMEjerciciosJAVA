package clase7.Ejercicio4;

class GestorReservas {
	private Habitacion[] habitaciones;
	private Reserva[] reservas;
	private int numHabitaciones;
	private int contadorReservas = 0;

	public GestorReservas(int capacidadMaxima) {
		this.habitaciones = new Habitacion[capacidadMaxima];
		this.reservas = new Reserva[capacidadMaxima];
		this.numHabitaciones = 0;
	}

	public void agregarHabitacion(Habitacion habitacion) {
		if (numHabitaciones < habitaciones.length) {
			habitaciones[numHabitaciones] = habitacion;
			numHabitaciones++;
		} else {
			System.out.println("Error al agregar habitación. " + "Capacidad máxima alcanzada.");
		}
	}

	public void realizarReserva(Reserva reserva) {
		Habitacion habitacionReservada = reserva.getHabitacion();
		boolean habitacionEncontrada = false;

		for (int i = 0; i < numHabitaciones; i++) {
			if (habitaciones[i].getNumero() == habitacionReservada.getNumero()) {
				habitacionReservada.cambiarEstado("ocupada");
				reservas[contadorReservas] = reserva;
				contadorReservas++;
				System.out.println("Reserva realizada con éxito.");
				habitacionEncontrada = true;
				break;
			}
		}

		if (!habitacionEncontrada) {
			System.out.println("Error al realizar la reserva. Habitación no válida.");
		}
	}

	public void mostrarInformacionReservas() {
		System.out.println();
		System.out.println("Información sobre las reservas:");
		System.out.println();
		for (int i = 0; i < numHabitaciones; i++) {
			Habitacion habitacion = habitaciones[i];
			if (habitacion != null && habitacion.getEstado().equals("ocupada")) {
				System.out.println();
				System.out.println("Habitación " + habitacion.getNumero() + ":");
				Reserva reserva = encontrarReservaPorHabitacion(habitacion);
				if (reserva != null) {
					reserva.mostrarInformacion();
				}
			}
		}
	}

	private Reserva encontrarReservaPorHabitacion(Habitacion habitacion) {
		for (int i = 0; i < numHabitaciones; i++) {
			Habitacion habitacionActual = habitaciones[i];
			if (habitacionActual != null && habitacionActual.equals(habitacion)) {
				Reserva reserva = null;
				for (int j = 0; j < contadorReservas; j++) {
					if (reservas[j].getHabitacion().getNumero() == habitacion.getNumero()) {
						reserva = reservas[j];
					}
				}
				return reserva;
			}
		}
		return null;
	}

	public void mostrarOcupacionHotel(String fechaInicio, String fechaFin) {
		System.out.println();
		System.out.println("Ocupación del hotel en el rango de fechas " + fechaInicio + " a " + fechaFin + ":");

		for (int i = 0; i < contadorReservas; i++) {
			Reserva reserva = reservas[i];
			if (reserva != null && estaEnFecha(reserva, fechaInicio, fechaFin)) {
				System.out.println("Reserva para el cliente " + reserva.getCliente().getNombre() + " en la habitación "
						+ reserva.getHabitacion().getNumero() + " desde " + reserva.getFechaInicio() + " hasta "
						+ reserva.getFechaFin());
			}
		}
	}

	private boolean estaEnFecha(Reserva reserva, String fechaInicio, String fechaFin) {
		String reservaInicio = reserva.getFechaInicio();
		String reservaFin = reserva.getFechaFin();
		return (reservaInicio.compareTo(fechaFin) < 0 && reservaFin.compareTo(fechaInicio) > 0);
	}

}