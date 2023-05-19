package ejercicios.objectclass.Taqueria;

import java.util.*;

public class Implementacion implements Metodos {

	// Declaramos nuestos HashMaps
	HashMap<String, Taqueria> hashmapTaqueria = new HashMap<String, Taqueria>();
	Taqueria taqueria = null;
	HashMap<Integer, Empleados> hashmapEmpleado = new HashMap<Integer, Empleados>();
	Empleados empleado = null;

	@Override
	public void guardar(Object obj, String clase) {
		if (clase.equals("Taqueria")) {
			// Realizar el casteo
			taqueria = (Taqueria) obj;
			hashmapTaqueria.put(taqueria.getIdTienda(), taqueria);
		} else if (clase.equals("Empleados")) {
			empleado = (Empleados) obj;
			hashmapEmpleado.put(empleado.getNumEmpleado(), empleado);
		}
	}

	@Override
	public void editar(Object obj, String clase) {
		if (clase.equals("Taqueria")) {
			// Realizar el casteo
			taqueria = (Taqueria) obj;
			hashmapTaqueria.put(taqueria.getIdTienda(), taqueria);
		} else if (clase.equals("Empleados")) {
			empleado = (Empleados) obj;
			hashmapEmpleado.put(empleado.getNumEmpleado(), empleado);
		}
	}

	@Override
	public void eliminar(Object obj, String clase) {
		if (clase.equals("Taqueria")) {
			// Realizar el casteo
			taqueria = (Taqueria) obj;
			hashmapTaqueria.remove(taqueria.getIdTienda());
		} else if (clase.equals("Empleados")) {
			empleado = (Empleados) obj;
			hashmapEmpleado.remove(empleado.getNumEmpleado());
		}
	}

	@Override
	public Object buscarTaqueria(Object obj) {
		taqueria = (Taqueria) obj;
		return hashmapTaqueria.get(taqueria.getIdTienda());
	}

	@Override
	public Object buscarEmpleado(Object obj) {
		empleado = (Empleados) obj;
		return hashmapEmpleado.get(empleado.getNumEmpleado());
	}

	@Override
	public void mostrarTaqueria() {
		System.out.println(hashmapTaqueria);
	}

	@Override
	public void mostrarEmpleado() {
		System.out.println(hashmapEmpleado);
	}

}
