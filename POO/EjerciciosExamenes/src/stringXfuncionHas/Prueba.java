package stringXfuncionHas;

import java.util.Random;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		// 83503320370387
		Long val = 83503320370387L;
		Long leer;
		String lec;

		Scanner lectura = null;
		String palabra;

		do {

			System.out.println("Introduce una caade de 10 caracterdes del siguiente diccionario: abehimoprstuv ");
			lectura = new Scanner(System.in);
			palabra = lectura.nextLine();
			leer = hash(palabra);
			System.out.println(leer);

			if (val == leer) {
				System.out.println("Cadena Ganadora: " + palabra);
				System.out.println("Valor " + leer);
				break;
			}

		} while (true);

		/*
		 * lec = getCadena(10); System.out.println("Cadena: " + lec); leer = hash(lec);
		 * System.out.println(leer);
		 * 
		 * if(leer == val) { System.out.println("Cadena Ganadora: " + lec);
		 * System.out.println(leer); break; }else { leer = 0L; lec = " "; }
		 */
	}

	public static long hash(String x) {
		long seed = 41;
		String diccionario = "abehimoprstuv";

		for (int i = 0; i < x.length(); i++) {
			seed = (seed * 17 + diccionario.indexOf(x.charAt(i)));
		}
		/*
		 * Inversar de la operacion
		 * 
		 * resultado / 17 ------> seed * 17
		 * 
		 * 83503320370387 4911960021787 288938824811 16996401459 999788321 58811077
		 * 3459475 203498 11970 704 41
		 * 
		 * diccionario.indexof -----> x1*x2 ejemplo
		 * 
		 * 41*17 = 697 - 704 es mi siguiente valor de seed 7 y buscamos en diccionario
		 * el indice que es P
		 * 
		 * 704 * 17 = 11968 - 11 970 2 y la lestra es E
		 * 
		 * 11970 * 17 = 203490 - 203498
		 * 
		 */
		return seed;
	}

	public static String getCadena(int length) {
		String abcPrueba = "abehimoprstuv";
		StringBuilder res;
		res = new StringBuilder(length);
		char car;
		int aux;
		for (int x = 0; x < length; x++) {
			aux = (int) (abcPrueba.length() * Math.random());
			res.append(abcPrueba.charAt(aux));
		}

		return res.toString();
	}
}
