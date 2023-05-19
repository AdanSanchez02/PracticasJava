package Dominio;

public class Clientes {
	// Atributos
	int idC;
	String nombreC;
	String appC;
	String apmC;
	String correoC;
	long numC;

	public Clientes() {

	}

	public Clientes(int idC, String nombreC, String appC, String apmC, String correoC, long numC) {

		this.idC = idC;
		this.nombreC = nombreC;
		this.appC = appC;
		this.apmC = apmC;
		this.correoC = correoC;
		this.numC = numC;
	}

	@Override
	public String toString() {
		return "Clientes [idC=" + idC + ", nombreC=" + nombreC + ", appC=" + appC + ", apmC=" + apmC + ", correoC="
				+ correoC + ", numC=" + numC + "]";
	}

	public int getIdC() {
		return idC;
	}

	public void setIdC(int idC) {
		this.idC = idC;
	}

	public String getNombreC() {
		return nombreC;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public String getAppC() {
		return appC;
	}

	public void setAppC(String appC) {
		this.appC = appC;
	}

	public String getApmC() {
		return apmC;
	}

	public void setApmC(String apmC) {
		this.apmC = apmC;
	}

	public String getCorreoC() {
		return correoC;
	}

	public void setCorreoC(String correoC) {
		this.correoC = correoC;
	}

	public long getNumC() {
		return numC;
	}

	public void setNumC(long numC) {
		this.numC = numC;
	}

}
