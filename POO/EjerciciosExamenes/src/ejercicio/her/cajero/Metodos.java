package ejercicio.her.cajero;

public interface Metodos {
	public void guardar(Object obj);

	public void editar(int indice, Object obj);

	public void eliminar(int idndice);

	public Object buscar(int indice);

	public void listar();
}
