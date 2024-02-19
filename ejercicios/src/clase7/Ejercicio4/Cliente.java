package clase7.Ejercicio4;

class Cliente {
	// Atributos
	private String nombre;
	private String numeroTelefono;

	// Constructor
	public Cliente(String nombre, String numeroTelefono) {
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}

	// Método para mostrar la información del cliente
	public void mostrarInformacion() {
		System.out.println("Nombre del cliente: " + nombre);
		System.out.println("Número de teléfono: " + numeroTelefono);
	}

	public String getNombre() {
		return nombre;
	}

}
