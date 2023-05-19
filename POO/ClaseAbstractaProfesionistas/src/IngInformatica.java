
public class IngInformatica extends Profesionistas {
	// Atributos
	String tecnologiaI;
	String herramientaI;

	public IngInformatica() {
		super();
	}

	public IngInformatica(String nombreP, int duracionP, String especialidadP, String tecnologiaI,
			String herramientaI) {
		super(nombreP, duracionP, especialidadP);
		this.tecnologiaI = tecnologiaI;
		this.herramientaI = herramientaI;
	}

	@Override
	public String toString() {
		return "IngInformatica [nombreP=" + nombreP + ", duracionP=" + duracionP + ", especialidadP=" + especialidadP
				+ ", tecnologiaI=" + tecnologiaI + ", herramientaI=" + herramientaI + "]\n";
	}

	public String getTecnologiaI() {
		return tecnologiaI;
	}

	public void setTecnologiaI(String tecnologiaI) {
		this.tecnologiaI = tecnologiaI;
	}

	public String getHerramientaI() {
		return herramientaI;
	}

	public void setHerramientaI(String herramientaI) {
		this.herramientaI = herramientaI;
	}

}
