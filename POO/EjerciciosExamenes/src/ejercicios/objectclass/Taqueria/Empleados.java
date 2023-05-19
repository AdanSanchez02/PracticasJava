package ejercicios.objectclass.Taqueria;

public class Empleados {
	// Atributos
	int numEmpleado; // Llave
	String nombre;
	String apPaterno;
	String cuentaBanco;
	Taqueria taqueria;

	public Empleados() {
		
	}

	public Empleados(int numEmpleado) { // Constructor de la Llave
	
		this.numEmpleado = numEmpleado;
	}

	public Empleados(int numEmpleado, String nombre, String apPaterno, String cuentaBanco, Taqueria taqueria) {
		
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.cuentaBanco = cuentaBanco;
		this.taqueria = taqueria;
	}

	@Override
	public String toString() {
		return "Empleados [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", apPaterno=" + apPaterno
				+ ", cuentaBanco=" + cuentaBanco + ", taqueria=" + taqueria + "]\n";
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getCuentaBanco() {
		return cuentaBanco;
	}

	public void setCuentaBanco(String cuentaBanco) {
		this.cuentaBanco = cuentaBanco;
	}

	public Taqueria getTaqueria() {
		return taqueria;
	}

	public void setTaqueria(Taqueria taqueria) {
		this.taqueria = taqueria;
	}

}
