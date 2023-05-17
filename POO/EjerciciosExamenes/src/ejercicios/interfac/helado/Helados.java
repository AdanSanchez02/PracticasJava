package ejercicios.interfac.helado;

public class Helados {
	
	String sabor;
	String recipiente;
	String cantidad;
	String toppy;
	int costo;
	
	public Helados() {
		
	}

	public Helados(String sabor, String recipiente, String cantidad, String toppy, int costo) {
		
		this.sabor = sabor;
		this.recipiente = recipiente;
		this.cantidad = cantidad;
		this.toppy = toppy;
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Helados [sabor=" + sabor + ", recipiente=" + recipiente + ", cantidad=" + cantidad + ", toppy=" + toppy
				+ ", costo=" + costo + "]\n";
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getRecipiente() {
		return recipiente;
	}

	public void setRecipiente(String recipiente) {
		this.recipiente = recipiente;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getToppy() {
		return toppy;
	}

	public void setToppy(String toppy) {
		this.toppy = toppy;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	
	

}
