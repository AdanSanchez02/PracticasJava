import java.util.ArrayList;
import java.util.List;

public class Implementaciones implements MetodosFunciones {

	// Declarar las listas
	List<Candidatos> listCandidato = new ArrayList<Candidatos>();
	List<Votantes> listVoto = new ArrayList<Votantes>();

	@Override
	public void guardarCandidato(Candidatos candidato) {
		listCandidato.add(candidato);
	}

	@Override
	public void mostrarCandidato() {
		System.out.println(listCandidato);
	}

	@Override
	public void guardarVotante(Votantes votos) {
		listVoto.add(votos);
	}

	@Override
	public void mostrarVotante() {
		System.out.println(listVoto);
	}

	public void mostrarNombreCandidato() {
		System.out.println("\n   Candidatos Existentes");
		for (int i = 0; i < listCandidato.size(); i++) {
			System.out.printf("\n [%d] " + listCandidato.get(i).getNombreCandidto(), i);
		}
		System.out.println(" ");
	}

	public void mostrarVotosCandidato(String candidato) {
		for (Votantes p : listVoto) {
			if (p.getVotoCand().equals(candidato)) {
				System.out.println("Votante: " + p.getNombreVot());
			}
		}
	}

	public String contar() {
		System.out.println("El total de votantes es: " + listVoto.size());
		int total;
		int[] votos = new int[listCandidato.size()];
		String[] Ganador = new String[listCandidato.size()];
		String Champ;
		for (int i = 0; i < listCandidato.size(); i++) {
			total = 0;
			for (Votantes p : listVoto) {
				if (p.getVotoCand().equals(listCandidato.get(i).getNombreCandidto())) {
					total = total + 1;
				}
			}
			votos[i] = total;
			Ganador[i] = listCandidato.get(i).getNombreCandidto();
		}
		int indice = 0;
		for (int x = 0; x < votos.length; x++) {
			if (votos[x] > votos[indice]) {
				indice = x;
			}
		}
		Champ = Ganador[indice];

		return Champ;
	}

	public void Resultados() {
		System.out.println("El total de votantes es: " + listVoto.size());
		int total;
		int[] votos = new int[listCandidato.size()];
		String[] Gan = new String[listCandidato.size()];
		for (int i = 0; i < listCandidato.size(); i++) {
			total = 0;
			for (Votantes p : listVoto) {
				if (p.getVotoCand().equals(listCandidato.get(i).getNombreCandidto())) {
					total = total + 1;
				}
			}
			votos[i] = total;
			Gan[i] = listCandidato.get(i).getNombreCandidto();
		}
		
		for (int i = 0; i < votos.length; i++) {
			for (int j = 0; j < votos.length; j++) {
				if (votos[i] < votos[j]) {
					int vt = votos[i]; String cd = Gan[i]; 
					votos[i] = votos[j]; Gan[i] = Gan[j];
					votos[j] = vt; Gan[j] = cd;
				}
			}
		}

		for (int j = 0; j < votos.length; j++) {

			System.out.println("Candidato: " + Gan[j] + " obtuvo: " + votos[j] + " votos");
		}

	}
}
