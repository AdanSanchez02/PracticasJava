import java.util.HashMap;

public class Implementaciones implements Metodos {

	// Declaras nuestro HasMap
	HashMap<Integer, Corredores> hashmapCorredor = new HashMap<Integer, Corredores>();
	
	@Override
	public void guardar(Corredores corredor) {
		// TODO Esbozo de método generado automáticamente
		hashmapCorredor.put(corredor.getNumeroC(), corredor);
		
	}

	@Override
	public void editar(Corredores corredor) {
		// TODO Esbozo de método generado automáticamente
		hashmapCorredor.put(corredor.getNumeroC(), corredor);
	}

	@Override
	public void eliminar(Corredores corredor) {
		// TODO Esbozo de método generado automáticamente
		hashmapCorredor.remove(corredor.getNumeroC());
	}

	@Override
	public Corredores buscar(Corredores corredor) {
		// TODO Esbozo de método generado automáticamente
		Corredores cor = hashmapCorredor.get(corredor.getNumeroC());
		return cor;
	}

	public void mostrar() {
		// TODO Esbozo de método generado automáticamente
		System.out.println(hashmapCorredor);
	}
	
	public void contar() {
		System.out.println("El HashMap contiene: " + hashmapCorredor.size() + "registros");
	}

}
