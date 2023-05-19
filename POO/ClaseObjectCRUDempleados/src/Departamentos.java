
public class Departamentos {
	// Atributos
	int clave;
	String nombre; // Llave del hasmap
	float sueldo;

	public Departamentos() {

	}

	public Departamentos(String nombre) {

		this.nombre = nombre;
	}

	public Departamentos(int clave, String nombre, float sueldo) {

		this.clave = clave;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Departamentos [clave=" + clave + ", nombre=" + nombre + ", sueldo=" + sueldo + "]\n";
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
