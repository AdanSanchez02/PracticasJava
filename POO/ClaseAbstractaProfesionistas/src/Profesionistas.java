
public abstract class Profesionistas {

	//Atributos
	String nombreP;
	int duracionP;
	String especialidadP;
	
	public Profesionistas() {
		super();
	}

	public Profesionistas(String nombreP, int duracionP, String especialidadP) {
		super();
		this.nombreP = nombreP;
		this.duracionP = duracionP;
		this.especialidadP = especialidadP;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public int getDuracionP() {
		return duracionP;
	}

	public void setDuracionP(int duracionP) {
		this.duracionP = duracionP;
	}

	public String getEspecialidadP() {
		return especialidadP;
	}

	public void setEspecialidadP(String especialidadP) {
		this.especialidadP = especialidadP;
	}
	
	
	
}
