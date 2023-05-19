package ejercicios.hasmap.empleados;

public class Empleados {

	// Atributos

	int idEmpleado;
	String nombre;
	String turno;
	int sucursal;

	public Empleados(int idEmpleado) {

		this.idEmpleado = idEmpleado;
	}

	public Empleados() {

	}

	public Empleados(int idEmpleado, String nombre, String turno, int sucursal) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.turno = turno;
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return "Empleados [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", turno=" + turno + ", sucursal="
				+ sucursal + "]\n";
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getSucursal() {
		return sucursal;
	}

	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}

}
