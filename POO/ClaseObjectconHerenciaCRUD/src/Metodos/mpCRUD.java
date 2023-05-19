package Metodos;

public interface mpCRUD {

	public void guardar(Object obj);

	public void editar(int indice, Object obj);

	public void eliminar(int indice);

	public Object buscar(int indices);

	public void listar();

}
