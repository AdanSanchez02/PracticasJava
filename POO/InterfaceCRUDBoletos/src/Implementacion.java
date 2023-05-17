import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {

	// Declarar la lista
	List<Boletos> listBoletos = new ArrayList<Boletos>();

	@Override
	public void guardar(Boletos boleto) {
		// TODO Esbozo de método generado automáticamente
		listBoletos.add(boleto);

	}

	@Override
	public void editar(int i, Boletos boleto) {
		// TODO Esbozo de método generado automáticamente
		listBoletos.set(i, boleto);
	}

	@Override
	public void eliminar(int i) {
		// TODO Esbozo de método generado automáticamente
		listBoletos.remove(i);
	}

	@Override
	public Boletos buscar(int i) {
		// TODO Esbozo de método generado automáticamente
		Boletos bol = listBoletos.get(i);
		return bol;
	}

	@Override
	public void mostrar() {
		// TODO Esbozo de método generado automáticamente
		System.out.println(listBoletos);

	}

	// Metodos agregados manualmente

	public void mostrarDestino(String destino) {
		for (Boletos p : listBoletos) {
			if (p.getDestino().equals(destino)) {
				System.out.println("Boleto con destino a: " + destino + " : " + p);
			}
		}
	}

	public void mostrarIndice() {
		System.out.println("\n   Indice y Destino de boletos");
		for (int i = 0; i < listBoletos.size(); i++) {
			System.out.printf("\n [%d] " + listBoletos.get(i).getDestino(), i);
		}
	}

	public float contar() {
		System.out.println("El total de boletos existentes es: " + listBoletos.size());
		float val, total = 0;
		for (int i = 0; i < listBoletos.size(); i++) {
			val = listBoletos.get(i).getPrecio();
			total = total + val;
		}
		return total;
	}

}
