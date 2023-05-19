package ejercicio.her.cajero;

public class InfoBanco {

	// Atributos
	String nombreU;
	long numeroT;
	int pinT;

	public InfoBanco() {
		super();
	}

	public InfoBanco(String nombreU, long numeroT, int pinT) {
		super();
		this.nombreU = nombreU;
		this.numeroT = numeroT;
		this.pinT = pinT;
	}

	public String getNombreU() {
		return nombreU;
	}

	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}

	public long getNumeroT() {
		return numeroT;
	}

	public void setNumeroT(long numeroT) {
		this.numeroT = numeroT;
	}

	public int getPinT() {
		return pinT;
	}

	public void setPinT(int pinT) {
		this.pinT = pinT;
	}

}
