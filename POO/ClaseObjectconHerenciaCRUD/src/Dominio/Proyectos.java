package Dominio;

import java.sql.Date;

public class Proyectos {

	// Atributos
	int claveP;
	String nombreP;
	Date fechaI;
	Date fechaF;

	public Proyectos() {
		
	}

	public Proyectos(int claveP, String nombreP, Date fechaI, Date fechaF) {
		
		this.claveP = claveP;
		this.nombreP = nombreP;
		this.fechaI = fechaI;
		this.fechaF = fechaF;
	}

	@Override
	public String toString() {
		return "Proyectos [claveP=" + claveP + ", nombreP=" + nombreP + ", fechaI=" + fechaI + ", fechaF=" + fechaF
				+ "]";
	}

	public int getClaveP() {
		return claveP;
	}

	public void setClaveP(int claveP) {
		this.claveP = claveP;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public Date getFechaI() {
		return fechaI;
	}

	public void setFechaI(Date fechaI) {
		this.fechaI = fechaI;
	}

	public Date getFechaF() {
		return fechaF;
	}

	public void setFechaF(Date fechaF) {
		this.fechaF = fechaF;
	}

}
