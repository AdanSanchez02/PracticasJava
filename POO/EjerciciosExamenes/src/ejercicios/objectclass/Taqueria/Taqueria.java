package ejercicios.objectclass.Taqueria;

public class Taqueria {

	// Atributos
	String idTienda; // Llave
	String Ubicacion;
	long horasTrabajador;
	long numTelefono;

	public Taqueria() {

	}

	public Taqueria(String idTienda) { // Constructor de la llave

		this.idTienda = idTienda;
	}

	public Taqueria(String idTienda, String ubicacion, long horasTrabajador, long numTelefono) {

		this.idTienda = idTienda;
		Ubicacion = ubicacion;
		this.horasTrabajador = horasTrabajador;
		this.numTelefono = numTelefono;
	}

	@Override
	public String toString() {
		return "Taqueria [idTienda=" + idTienda + ", Ubicacion=" + Ubicacion + ", horasTrabajador=" + horasTrabajador
				+ ", numTelefono=" + numTelefono + "]\n";
	}

	public String getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(String idTienda) {
		this.idTienda = idTienda;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public long getHorasTrabajador() {
		return horasTrabajador;
	}

	public void setHorasTrabajador(long horasTrabajador) {
		this.horasTrabajador = horasTrabajador;
	}

	public long getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(long numTelefono) {
		this.numTelefono = numTelefono;
	}

}
