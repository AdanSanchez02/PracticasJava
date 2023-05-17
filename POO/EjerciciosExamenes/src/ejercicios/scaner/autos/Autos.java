package ejercicios.scaner.autos;

public class Autos {

	String marca;
	String modelo;
	String version;
	int anio;
	String caja;
	long precio;
	float motor;

	public Autos() {

	}

	public Autos(String marca, String modelo, String version, int anio, String caja, long precio, float motor) {

		this.marca = marca;
		this.modelo = modelo;
		this.version = version;
		this.anio = anio;
		this.caja = caja;
		this.precio = precio;
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", version=" + version + ", anio=" + anio + ", caja="
				+ caja + ", precio=" + precio + ", motor=" + motor + "]\n";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getCaja() {
		return caja;
	}

	public void setCaja(String caja) {
		this.caja = caja;
	}

	public long getPrecio() {
		return precio;
	}

	public void setPrecio(long precio) {
		this.precio = precio;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}

}
