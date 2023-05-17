
public class Persona {

	// Atributos del objeto
	String nombre;
	int edad;
	String genero;
	String estadoCivil;
	long numCelular;

	// Constructor vacio
	public Persona() {

	}

	// Constructor con todo los parametros
	// Sobrecarga de metodos
	public Persona(String nombre, int edad, String genero, String estadoCivil, long numCelular) {

		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.estadoCivil = estadoCivil;
		this.numCelular = numCelular;
	}

	// Convierte a cadena cualquier objeto
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", estadoCivil=" + estadoCivil
				+ ", numCelular=" + numCelular + "]\n";
	}

	// Encapsulamiento -- Es un pilar de la programacion
	// Es un metodo o funcion
	public String getNombre() {
		return nombre;
	}

	// Es un procedimiento
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public long getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(long numCelular) {
		this.numCelular = numCelular;
	}

}
