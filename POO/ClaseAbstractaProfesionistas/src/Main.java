import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		// Atributos Profesionistas
		String nombreP;
		int duracionP;
		String especialidadP;
		// Atributos Informatica
		String tecnologiaI;
		String herramientaI;

		IngInformatica informatica;
		Scanner lectura = null;

		int menu, menuI, indice;

		Implementacion imp = new Implementacion();

		do {

			System.out.println("\nMENU PRINCIPAL\n");
			System.out.println("1 --- Informatica");
			System.out.println("2 --- Salir");
			lectura = new Scanner(System.in);
			menu = lectura.nextInt();

			switch (menu) {

			case 1:

				do {

					System.out.println("\n	MENU INFORMATICA \n");
					System.out.println("1 --- ALTA");
					System.out.println("2 --- EDITAR");
					System.out.println("3 --- ELIMINAR");
					System.out.println("4 --- BUSCAR");
					System.out.println("5 --- MOSTRAR");
					System.out.println("6 --- SALIR");

					lectura = new Scanner(System.in);
					menuI = lectura.nextInt();

					switch (menuI) {

					case 1:

						System.out.println("\n	Ingrese los valores solicitados \n");

						System.out.println("Nombre de la profesion");
						lectura = new Scanner(System.in);
						nombreP = lectura.nextLine();

						System.out.println("Duracion de la carrera en meses");
						lectura = new Scanner(System.in);
						duracionP = lectura.nextInt();

						System.out.println("Especialidad de la carrera");
						lectura = new Scanner(System.in);
						especialidadP = lectura.nextLine();

						System.out.println("Tecnologia usada");
						lectura = new Scanner(System.in);
						tecnologiaI = lectura.nextLine();

						System.out.println("Herramienta de apoyo");
						lectura = new Scanner(System.in);
						herramientaI = lectura.nextLine();

						informatica = new IngInformatica(nombreP, duracionP, especialidadP, tecnologiaI, herramientaI);
						imp.guardar(informatica);

						break;

					case 2:
						System.out.println("Lista de Usuarios de alta y sus Indices");
						imp.mostrarIndice();

						System.out.println("\n  Ingrese el indice del Usuario a editar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						informatica = (IngInformatica) imp.buscar(indice);

						System.out.println("Especialidad a cambiar");
						lectura = new Scanner(System.in);
						especialidadP = lectura.nextLine();

						informatica.setEspecialidadP(especialidadP);
						imp.editar(indice, informatica);

						break;

					case 3:

						System.out.println("Lista de Usuarios de alta y sus Indices");
						imp.mostrarIndice();

						System.out.println("\n  Ingrese el indice del Usuario a eliminar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						informatica = (IngInformatica) imp.buscar(indice);
						imp.eliminar(indice);
						System.out.println("Se elimino al usuarior" + informatica);

						break;

					case 4:

						System.out.println("Lista de Usuarios de alta y sus Indices");
						imp.mostrarIndice();

						System.out.println("\n  Ingrese el indice del Usuario a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						informatica = (IngInformatica) imp.buscar(indice);

						System.out.println("Se encontro el Departamento: " + informatica);

						break;

					case 5:
						imp.listar();
						break;

					case 6:
						break;
					}

				} while (menuI < 6);

				break;

			case 2:
				break;
			}

		} while (menu < 2);

	}

}
