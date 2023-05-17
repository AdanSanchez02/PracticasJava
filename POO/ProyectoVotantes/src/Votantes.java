
public class Votantes {

	// Atributos
	String votoCand; // Candidato a quien votaron
	String nombreVot; // Primer nombre del votante


	public Votantes() {
		
	}

	public Votantes(String votoCand, String nombreVot) {
		
		this.votoCand = votoCand;
		this.nombreVot = nombreVot;
	}

	@Override
	public String toString() {
		return "Votantes [votoCand=" + votoCand + ", nombreVot=" + nombreVot + "]\n";
	}

	public String getVotoCand() {
		return votoCand;
	}

	public void setVotoCand(String votoCand) {
		this.votoCand = votoCand;
	}

	public String getNombreVot() {
		return nombreVot;
	}

	public void setNombreVot(String nombreVot) {
		this.nombreVot = nombreVot;
	}

	
}
