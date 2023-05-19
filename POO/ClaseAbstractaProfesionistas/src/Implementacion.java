import java.util.*;

public class Implementacion implements Metodos {

	//Declaramos la lista
	List<Object> listObj = new ArrayList<Object>();
	
	@Override
	public void guardar(Object obj) {
		// TODO Esbozo de método generado automáticamente
		listObj.add(obj);
	}

	@Override
	public void editar(int indice, Object obj) {
		// TODO Esbozo de método generado automáticamente
		listObj.set(indice, obj);
	}

	@Override
	public void eliminar(int idndice) {
		// TODO Esbozo de método generado automáticamente
		listObj.remove(idndice);
	}

	@Override
	public Object buscar(int indice) {
		// TODO Esbozo de método generado automáticamente
		return listObj.get(indice);
	}

	@Override
	public void listar() {
		// TODO Esbozo de método generado automáticamente
		System.out.println(listObj);
	}
	
	public void mostrarIndice() {
		for(int i=0; i < listObj.size(); i++) {
			System.out.printf("\n [%d] " + listObj.get(i), i);
		}
	}
}
