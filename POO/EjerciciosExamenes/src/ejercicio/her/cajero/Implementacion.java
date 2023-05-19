package ejercicio.her.cajero;

import java.util.*;

public class Implementacion implements Metodos {
	Cajero caj;
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
	public void eliminar(int indice) {
		// TODO Esbozo de método generado automáticamente
		listObj.remove(indice);
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

		for (int i = 0; i < listObj.size(); i++) {
			Cajero caj = (Cajero) listObj.get(i);
			System.out.printf(i + " " + caj.getNombreU());
		}
	}
	
	public int indiceUsuarioCajero(long usuario, long pin) {
		int val = 0;
		for (int i = 0; i < listObj.size(); i++) {
			Cajero caj = (Cajero) listObj.get(i);
			//System.out.printf(i + " " + caj.getNombreU());
			
			if(caj.getNumeroT() == usuario) {
				System.out.print("Tarjeta del usuario: " + caj.getNumeroT());
				if(caj.getPinT() == pin) {
					System.out.println("  Pin del usuario: " + caj.getPinT());
					val = i;
				}
			}
		}
		return val;
	}
	public int validacionUsuario(long usuario, long pin) {
		int val = 0;
		for (int i = 0; i < listObj.size(); i++) {
			Cajero caj = (Cajero) listObj.get(i);
			//System.out.printf(i + " " + caj.getNombreU());
			
			if(caj.getNumeroT() == usuario) {
				System.out.println("Tarjeta: " + caj.getNumeroT());
				if(caj.getPinT() == pin) {
					System.out.println("Pin: " + caj.getPinT());
					val = 1;
				}
			}
		}
		return val;
	}

}
