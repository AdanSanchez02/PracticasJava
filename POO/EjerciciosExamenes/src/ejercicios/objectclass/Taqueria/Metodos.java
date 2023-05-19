package ejercicios.objectclass.Taqueria;

public interface Metodos {
	// Clase Object me encapsular cualquier objeto
	public void guardar(Object obj, String clase);

	public void editar(Object obj, String clase);

	public void eliminar(Object obj, String clase);

	public Object buscarTaqueria(Object obj);

	public Object buscarEmpleado(Object obj);

	public void mostrarTaqueria();

	public void mostrarEmpleado();
}
