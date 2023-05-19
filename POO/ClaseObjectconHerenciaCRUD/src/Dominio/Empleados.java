package Dominio;

public class Empleados {

	// Atributos

	int claveE;
	String nombreE;
	long celE;
	int edad;
	long nss;

	public Empleados() {
		
	}

	public Empleados(int claveE, String nombreE, long celE, int edad, Long nss) {
	
		this.claveE = claveE;
		this.nombreE = nombreE;
		this.celE = celE;
		this.edad = edad;
		this.nss = nss;
	}

	@Override
	public String toString() {
		return "Empleados [claveE=" + claveE + ", nombreE=" + nombreE + ", celE=" + celE + ", edad=" + edad + ", nss="
				+ nss + "]";
	}

	public int getClaveE() {
		return claveE;
	}

	public void setClaveE(int claveE) {
		this.claveE = claveE;
	}

	public String getNombreE() {
		return nombreE;
	}

	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	public long getCelE() {
		return celE;
	}

	public void setCelE(long celE) {
		this.celE = celE;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Long getNss() {
		return nss;
	}

	public void setNss(Long nss) {
		this.nss = nss;
	}

}
