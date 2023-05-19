
public class Corredores {

	// Atributos
	int numeroC; // Este va a ser mi llave
	String nombre;
	String apellido;
	int edad;
	float estatura;

	public Corredores() {
	}

	//Constructor para nuestro HasMap
	public Corredores(int numeroC) {
		this.numeroC = numeroC;
	}

	public Corredores(int numeroC, String nombre, String apellido, int edad, float estatura) {
		this.numeroC = numeroC;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Corredores [numeroC=" + numeroC + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", estatura=" + estatura + "]\n ";
	}

	public int getNumeroC() {
		return numeroC;
	}

	public void setNumeroC(int numeroC) {
		this.numeroC = numeroC;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

}
