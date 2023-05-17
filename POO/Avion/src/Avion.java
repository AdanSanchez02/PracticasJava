
public class Avion {

	// Atributos del objeto
	String marca;
	long fechaManufactura;
	String modelo;
	String comprador;
	long placa;
	long precio;
	
	// Constructor vacio
	public Avion() {

	}

	// Constructor con todo los parametros
	// Sobrecarga de metodos
	public Avion(String marca, long fechaManufactura, String modelo, String comprador, long placa, long precio) {
		this.marca = marca;
		this.fechaManufactura = fechaManufactura;
		this.modelo = modelo;
		this.comprador = comprador;
		this.placa = placa;
		this.precio =  precio;
	}

	// Convierte a cadena cualquier objeto
	@Override
	public String toString() {
		return "Avion [marca=" + marca + ", fechaManufactura=" + fechaManufactura + ", modelo=" + modelo
				+ ", comprador=" + comprador + ", placa=" + placa + ", precio" + precio +"]";
	}

	// Encapsulamiento -- Es un pilar de la programacion

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public long getFechaManufactura() {
		return fechaManufactura;
	}

	public void setFechaManufactura(long fechaManufactura) {
		this.fechaManufactura = fechaManufactura;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public long getPlaca() {
		return placa;
	}

	public void setPlaca(long placa) {
		this.placa = placa;
	}
	
	public long getPrecio() {
		return precio;
	}

	public void setPrecio(long precio) {
		this.precio = precio;
	}

}
