import java.util.Random;

public class Test {

	public String getCadena(int length) {
		String abcMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String abcMinus = "abcdefghijklmnopqrstuvwxyz";

		String caracteres = abcMayus + abcMinus;
		Random mRandom = new Random();

		String res = "";
		int pos;
		char car;
		for (int i = 0; i < length; i++) {
			pos = mRandom.nextInt(caracteres.length());
			car = caracteres.charAt(pos);
			res += car;
		}

		return res;
	}

	public void comparacion(String Cad) {

		char l = ' ';
		int aux1 = 0, aux2 = 0;
		for (int i = 0; i < Cad.length(); i++) {
			l = Cad.charAt(i);
			if (l == 'A') {
				aux1 += 1;
			}
			if (l == 'a') {
				aux2 += 1;
			}
		}
		System.out.println("El total de A es: " + aux1 + " El total de a es: " + aux2);
	}

	public void regresion(String Cad) {
		char l = ' ';
		String res = "";
		for (int i = 98; i >= 0; i--) {
			l = Cad.charAt(i);
			res += l;
		}
		System.out.println("La cadena inversa: " + res);
	}

	public static void main(String[] args) {

		Test cadena = new Test();
		String Cad = cadena.getCadena(250);
		System.out.println("Cadena: " + Cad);
		cadena.comparacion(Cad);
		cadena.regresion(Cad);

	}

}
