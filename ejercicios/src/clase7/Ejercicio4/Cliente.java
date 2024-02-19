package clase7.Ejercicio4;

class Cliente {
	private String nombre;
	private String numeroTelefono;

	public Cliente(String nombre, String numeroTelefono) {
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre del cliente: " + nombre);
		System.out.println("Número de teléfono: " + numeroTelefono);
	}

	public String getNombre() {
		return nombre;
	}

}
