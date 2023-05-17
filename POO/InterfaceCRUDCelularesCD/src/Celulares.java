
public class Celulares {
	
	//Atributos
	String marca;
	String modelo;
	String color;
	int capacidadAlm;
	float precio;

	public Celulares() {

	}

	public Celulares(String marca, String modelo, String color, int capacidadAlm, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.capacidadAlm = capacidadAlm;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Celulares [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", capacidadAlm="
				+ capacidadAlm + ", precio=" + precio + "]\n";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacidadAlm() {
		return capacidadAlm;
	}

	public void setCapacidadAlm(int capacidadAlm) {
		this.capacidadAlm = capacidadAlm;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
