package ejercicio.her.cajero;

public class Cajero extends InfoBanco {
	// Atributos
	long cantidadD;
	long numC;
	String password;

	public Cajero() {
		super();
	}

	public Cajero(String nombreU, long numeroT, int pinT, long cantidadD, long numC, String password) {
		super(nombreU, numeroT, pinT);
		this.cantidadD = cantidadD;
		this.numC = numC;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Cajero [nombreU=" + nombreU + ", numeroT=" + numeroT + ", pinT=" + pinT + ", cantidadD=" + cantidadD
				+ ", numC=" + numC + ", password=" + password + "]";
	}

	public long getCantidadD() {
		return cantidadD;
	}

	public void setCantidadD(long cantidadD) {
		this.cantidadD = cantidadD;
	}

	public long getNumC() {
		return numC;
	}

	public void setNumC(long numC) {
		this.numC = numC;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
