package ejercicios.claseabstracta.departamentostiendaliverpool;

public class TiendaGeneral {
	// Atributos
	String nombreT;
	int numeroT;
	String ubicacionT;

	public TiendaGeneral() {
		super();
	}

	public TiendaGeneral(String nombreT, int numeroT, String ubicacionT) {
		super();
		this.nombreT = nombreT;
		this.numeroT = numeroT;
		this.ubicacionT = ubicacionT;
	}

	public String getNombreT() {
		return nombreT;
	}

	public void setNombreT(String nombreT) {
		this.nombreT = nombreT;
	}

	public int getNumeroT() {
		return numeroT;
	}

	public void setNumeroT(int numeroT) {
		this.numeroT = numeroT;
	}

	public String getUbicacionT() {
		return ubicacionT;
	}

	public void setUbicacionT(String ubicacionT) {
		this.ubicacionT = ubicacionT;
	}

}
