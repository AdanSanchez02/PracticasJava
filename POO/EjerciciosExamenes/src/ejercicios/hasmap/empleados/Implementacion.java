package ejercicios.hasmap.empleados;
import java.util.HashMap;

public class Implementacion implements Metodos {

	//Agregamos nuestro HashMap
	
	HashMap<Integer, Empleados> hashmapempleado = new HashMap<Integer, Empleados>();
	
	@Override
	public void guardar(Empleados empleado) {
		// TODO Esbozo de método generado automáticamente
		hashmapempleado.put(empleado.getIdEmpleado(), empleado);
		
	}

	@Override
	public void editar(Empleados empleado) {
		// TODO Esbozo de método generado automáticamente
		hashmapempleado.put(empleado.getIdEmpleado(), empleado);
	}

	@Override
	public void eliminar(Empleados empleado) {
		// TODO Esbozo de método generado automáticamente
		hashmapempleado.remove(empleado.getIdEmpleado());
	}

	@Override
	public Empleados buscar(Empleados empleado) {
		// TODO Esbozo de método generado automáticamente
		Empleados emp = hashmapempleado.get(empleado.getIdEmpleado());
		return emp;
	}
	
	public void mostrar() {
		// TODO Esbozo de método generado automáticamente
		System.out.println(hashmapempleado);
	}
	
	public void contar() {
		System.out.println("El HashMap contiene: " + hashmapempleado.size() + "registros");
	}

}
