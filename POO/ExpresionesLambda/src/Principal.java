import java.util.*;

public class Principal {

	public static void main(String[] args) {
		String val1 = "";
		String val2 = "";

		Scanner lectura = null;
		System.out.println("Introduce tu nombre");

		lectura = new Scanner(System.in);
		val1 = lectura.nextLine();

		lectura = new Scanner(System.in);
		val2 = lectura.nextLine();

		impMen s = (str1, str2) -> str1 + " " + str2;

		System.out.println("Mensaje: " + s.sconcat(val1, val2));
		// TODO Auto-generated method stub

		// System.out.println("Result: " + s.sconcat("Hello ", "World"));
		// TODO Auto-generated method stub
		// modificarCadena exclamacion = (t) -> "!" + t + "?";

		// imprimir("Hola Mundo", exclamacion);
	}

	public static void imprimir(String texto, modificarCadena formato) {
		String mensaje = formato.ejecutar(texto);
		System.out.println(mensaje);
	}

}

interface modificarCadena {
	String ejecutar(String texto);
}

interface impMen {

	public String sconcat(String a, String b);
}