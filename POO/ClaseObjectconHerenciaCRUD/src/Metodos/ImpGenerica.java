package Metodos;

import java.util.ArrayList;
import java.util.List;

public class ImpGenerica implements mpCRUD{

	//Declaramos las listas
	List<Object> listaObjetos = new ArrayList<Object>();
	
	@Override
	public void guardar(Object obj) {
		// TODO Esbozo de método generado automáticamente
		listaObjetos.add(obj);
	}

	@Override
	public void editar(int indice, Object obj) {
		// TODO Esbozo de método generado automáticamente
		listaObjetos.set(indice, obj);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Esbozo de método generado automáticamente
		listaObjetos.remove(indice);
	}

	@Override
	public Object buscar(int indices) {
		// TODO Esbozo de método generado automáticamente
	
		return listaObjetos.get(indices);
	}

	@Override
	public void listar() {
		// TODO Esbozo de método generado automáticamente
		System.out.println(listaObjetos);
	}

	public void mostrarIndice() {
		for (int i = 0; i < listaObjetos.size(); i++) {
			System.out.printf("\n [%d] " + listaObjetos.get(i), i);
		}
		/*
		 * if(listaObjetos.get(i).getClass().equals(Departamentos.class)){
		 * Departamentos dpt = (Departamentos) listaObjetos.get(i);
		 * System.out.printf(i + "" dpt.getNombre());
		 * }
		 */
	}
	
}
