package Dominio;

public class Departamentos {

	// Atributos

	int claveD;
	String nombreD;
	float sueldoD;

	public Departamentos() {

	}

	public Departamentos(int claveD, String nombreD, float sueldoD) {

		this.claveD = claveD;
		this.nombreD = nombreD;
		this.sueldoD = sueldoD;
	}

	@Override
	public String toString() {
		return "Departamentos [claveD=" + claveD + ", nombreD=" + nombreD + ", sueldoD=" + sueldoD + "]";
	}

	public int getClaveD() {
		return claveD;
	}

	public void setClaveD(int claveD) {
		this.claveD = claveD;
	}

	public String getNombreD() {
		return nombreD;
	}

	public void setNombreD(String nombreD) {
		this.nombreD = nombreD;
	}

	public float getSueldoD() {
		return sueldoD;
	}

	public void setSueldoD(float sueldoD) {
		this.sueldoD = sueldoD;
	}

}
