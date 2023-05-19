
import java.util.*;

public class Implementacion implements Metodos {

	// Declaramos nuestros hashmaps
	HashMap<String, Departamentos> hashmapDepartamentos = new HashMap<String, Departamentos>();
	Departamentos departamento = null;
	HashMap<Integer, Empleados> hashmapEmpleados = new HashMap<Integer, Empleados>();
	Empleados empleado = null;

	@Override
	public void guardar(Object obj, String clase) {
		// TODO Esbozo de método generado automáticamente
		if (clase.equals("Departamentos")) {
			// Realizar el casteo
			departamento = (Departamentos) obj;
			hashmapDepartamentos.put(departamento.getNombre(), departamento);
		} else if (clase.equals("Empleados")) {
			empleado = (Empleados) obj;
			hashmapEmpleados.put(empleado.getId(), empleado);
		}
	}

	@Override
	public void editar(Object obj, String clase) {
		if (clase.equals("Departamentos")) {
			// Realizar el casteo
			departamento = (Departamentos) obj;
			hashmapDepartamentos.put(departamento.getNombre(), departamento);
		} else if (clase.equals("Empleados")) {
			empleado = (Empleados) obj;
			hashmapEmpleados.put(empleado.getId(), empleado);
		}

	}

	@Override
	public void eliminar(Object obj, String clase) {
		if (clase.equals("Departamentos")) {
			// Realizar el casteo
			departamento = (Departamentos) obj;
			hashmapDepartamentos.remove(departamento.getNombre());
		} else if (clase.equals("Empleados")) {
			empleado = (Empleados) obj;
			hashmapEmpleados.remove(empleado.getId());
		}

	}

	@Override
	public Object buscarDepartamento(Object obj) {
		departamento = (Departamentos) obj;
		return hashmapDepartamentos.get(departamento.getNombre());
	}

	@Override
	public Object buscarEmpleado(Object obj) {
		empleado = (Empleados) obj;
		return hashmapEmpleados.get(empleado.getId());
	}

	@Override
	public void mostrarDerpatamento() {
		// TODO Esbozo de método generado automáticamente
		System.out.println(hashmapDepartamentos);
	}

	@Override
	public void mostrarEmpleado() {
		// TODO Esbozo de método generado automáticamente
		System.out.println(hashmapEmpleados);
	}

}
