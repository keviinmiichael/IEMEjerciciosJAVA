package clase7.Ejercicio4;

class Habitacion {
	private int numero;
	private String tipo;
	private String estado;

	public Habitacion(int numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		this.estado = "disponible";
	}

	public void cambiarEstado(String nuevoEstado) {
		this.estado = nuevoEstado;
	}

	public void mostrarInformacion() {
		System.out.println();
		System.out.println("Número de habitación: " + numero);
		System.out.println("Tipo de habitación: " + tipo);
		System.out.println("Estado de habitación: " + estado);
	}

	public int getNumero() {
		return numero;
	}

	public String getEstado() {
		return estado;
	}

}
