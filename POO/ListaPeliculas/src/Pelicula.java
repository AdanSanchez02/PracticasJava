
public class Pelicula {
	//Atributos de mi onjeto
	String nombre;
	String genero;
	float duracion;
	String director;
	int anio;
	
	public Pelicula() {
	}
	public Pelicula(String nombre, String genero, float duracion, String director, int anio) {
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		this.director = director;
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", director=" + director
				+ ", anio=" + anio + "]\n";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public float getDuracion() {
		return duracion;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
}
