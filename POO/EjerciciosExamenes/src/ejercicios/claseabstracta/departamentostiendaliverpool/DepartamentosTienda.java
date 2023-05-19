package ejercicios.claseabstracta.departamentostiendaliverpool;

public class DepartamentosTienda extends TiendaGeneral {

	// Atributos
	String nombreD;
	String encargadoD;
	int claveT;

	public DepartamentosTienda() {
		super();
	}

	public DepartamentosTienda(String nombreT, int numeroT, String ubicacionT, String nombreD, String encargadoD,
			int claveT) {
		super(nombreT, numeroT, ubicacionT);
		this.nombreD = nombreD;
		this.encargadoD = encargadoD;
		this.claveT = claveT;
	}

	@Override
	public String toString() {
		return "DepartamentosTienda [nombreT=" + nombreT + ", numeroT=" + numeroT + ", ubicacionT=" + ubicacionT
				+ ", nombreD=" + nombreD + ", encargadoD=" + encargadoD + ", claveT=" + claveT + "]\n";
	}

	public String getNombreD() {
		return nombreD;
	}

	public void setNombreD(String nombreD) {
		this.nombreD = nombreD;
	}

	public String getEncargadoD() {
		return encargadoD;
	}

	public void setEncargadoD(String encargadoD) {
		this.encargadoD = encargadoD;
	}

	public int getClaveT() {
		return claveT;
	}

	public void setClaveT(int claveT) {
		this.claveT = claveT;
	}

}
