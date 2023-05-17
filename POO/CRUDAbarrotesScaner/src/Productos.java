
public class Productos {
	// Atributos de mi objeto

	long codigoB;
	String clave;
	String nombreP;
	float precio;
	int cantidad;
	String unidadMedida;

	public Productos() {

	}

	public Productos(long codigoB, String clave, String nombreP, float precio, int cantidad, String unidadMedida) {
		this.codigoB = codigoB;
		this.clave = clave;
		this.nombreP = nombreP;
		this.precio = precio;
		this.cantidad = cantidad;
		this.unidadMedida = unidadMedida;
	}

	@Override
	public String toString() {
		return "Productos [codigoB=" + codigoB + ", clave=" + clave + ", nombreP=" + nombreP + ", precio=" + precio
				+ ", cantidad=" + cantidad + ", unidadMedida=" + unidadMedida + "]\n";
	}

	public long getCodigoB() {
		return codigoB;
	}

	public void setCodigoB(long codigoB) {
		this.codigoB = codigoB;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

}
