
public class Candidatos {

	// Atributos

	String nombreCandidto;

	public Candidatos() {

	}

	public Candidatos(String nombreCandidto) {

		this.nombreCandidto = nombreCandidto;
	}

	@Override
	public String toString() {
		return "Candidatos [nombreCandidto=" + nombreCandidto + "]\n";
	}

	public String getNombreCandidto() {
		return nombreCandidto;
	}

	public void setNombreCandidto(String nombreCandidto) {
		this.nombreCandidto = nombreCandidto;
	}

}
