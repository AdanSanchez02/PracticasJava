import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// Declarar variables
		int lugarAsiento;
		String destino;
		float precio;
		String horario;

		Boletos boleto = null;

		Implementacion imp = new Implementacion();
		Scanner lectura = null;

		int menuP, indice, subMenu;
		String dest;

		do {

			System.out.println("   Menu Principal");
			System.out.println("	1 -- Alta");
			System.out.println("	2 -- Buscar");
			System.out.println("	3 -- Editar");
			System.out.println("	4 -- Eliminar");
			System.out.println("	5 -- Mostrar");
			System.out.println("	6 -- Lista por Destino");
			System.out.println("	7 -- Contar");
			
			System.out.println("	8 -- Salir");

			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();

			switch (menuP) {
			case 1:

				System.out.println("\nIngreso los valores solicitados");

				System.out.println("Lugar de asiento");
				lectura = new Scanner(System.in);
				lugarAsiento = lectura.nextInt();

				System.out.println("Destino");
				lectura = new Scanner(System.in);
				destino = lectura.nextLine();

				System.out.println("Precio");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();

				System.out.println("Horario");
				lectura = new Scanner(System.in);
				horario = lectura.nextLine();

				// Guardar
				boleto = new Boletos(lugarAsiento, destino, precio, horario);
				imp.guardar(boleto);

				break;

			case 2:

				imp.mostrarIndice();
				System.out.println("\n  Ingrese el indice del boleto a buscar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				boleto = imp.buscar(indice);
				System.out.println("\n Boleto encontrado: " + boleto);

				break;

			case 3:

				imp.mostrarIndice();
				System.out.println("\n  Ingrese el indice del boleto a modificar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				boleto = imp.buscar(indice);
				System.out.println("\n  El boleto a modificar es: " + boleto);

				do {

					System.out.println("   Menu de Editar");
					System.out.println("	1 -- Editar Precio");
					System.out.println("	2 -- Editar Horario de salida");
					System.out.println("	3 -- Salir");
					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();

					switch (subMenu) {
					case 1:
						System.out.println("Ingrese el nuevo precio");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();
						boleto.setPrecio(precio);
						imp.editar(indice, boleto);
						subMenu = 3;
						break;

					case 2:

						System.out.println("Ingrese el Horario de salida");
						lectura = new Scanner(System.in);
						horario = lectura.nextLine();
						boleto.setHorario(horario);
						imp.editar(indice, boleto);
						subMenu = 3;
						break;

					case 3:

						System.out.println("No se realizo ninguna modificacion");
						break;

					}

				} while (subMenu < 3);

				break;

			case 4:

				imp.mostrarIndice();
				System.out.println("\n  Ingrese el indice del boleto a eliminar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				boleto = imp.buscar(indice);
				imp.eliminar(indice);
				System.out.println("\n Boleto eliminado: " + boleto);

				break;

			case 5:
				imp.mostrar();
				break;

			case 6:
				System.out.println("Ingrese el Destino de los boletos a buscar");
				lectura = new Scanner(System.in);
				dest = lectura.nextLine();
				imp.mostrarDestino(dest);
				break;

			case 7:
				float valor = imp.contar();
				System.out.println("Total de ganancias: " + valor);
				break;
				
			case 8:
				break;
			}

		} while (menuP < 8);
	}

}
