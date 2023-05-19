package ejercicios.claseabstracta.departamentostiendaliverpool;

import java.util.Scanner;

public class Behaivor {

	public static void main(String[] args) {
		// Atributos Tienda
		String nombreT;
		int numeroT;
		String ubicacionT;
		// Atributos Departamentos
		String nombreD;
		String encargadoD;
		int claveT;

		DepartamentosTienda departamento;
		Scanner lectura = null;

		int menu, menuI, indice;

		Implementacion imp = new Implementacion();

		do {

			System.out.println("\nMENU PRINCIPAL\n");
			System.out.println("1 --- Tienda 1");
			System.out.println("2 --- Salir");
			lectura = new Scanner(System.in);
			menu = lectura.nextInt();

			switch (menu) {

			case 1:

				do {

					System.out.println("\n	MENU Tienda \n");
					System.out.println("1 --- ALTA");
					System.out.println("2 --- EDITAR");
					System.out.println("3 --- ELIMINAR");
					System.out.println("4 --- BUSCAR");
					System.out.println("5 --- MOSTRAR");
					System.out.println("6 --- SALIR A MENU PRINCIPAL");

					lectura = new Scanner(System.in);
					menuI = lectura.nextInt();

					switch (menuI) {

					case 1:

						System.out.println("\n	Ingrese los valores solicitados \n");

						System.out.println("Nombre de la Tienda en general");
						lectura = new Scanner(System.in);
						nombreT = lectura.nextLine();

						while (true) {
							try {
								System.out.println("Numero de la tienda");
								lectura = new Scanner(System.in);
								numeroT = lectura.nextInt();
								break;
							} catch (Exception e) {
								System.out.println("Introducir valor del tipo entero");
							}
						}

						System.out.println("Ubicacion de la tienda");
						lectura = new Scanner(System.in);
						ubicacionT = lectura.nextLine();

						System.out.println("Nombre del Departamento dentro de la tienda");
						lectura = new Scanner(System.in);
						nombreD = lectura.nextLine();

						System.out.println("Encargardo de la tienda");
						lectura = new Scanner(System.in);
						encargadoD = lectura.nextLine();

						while (true) {
							try {
								System.out.println("Clave del Departamento");
								lectura = new Scanner(System.in);
								claveT = lectura.nextInt();
								break;
							} catch (Exception e) {
								System.out.println("Introducir valor del tipo entero");
							}
						}

						departamento = new DepartamentosTienda(nombreT, numeroT, ubicacionT, nombreD, encargadoD,
								claveT);
						imp.guardar(departamento);

						break;

					case 2:
						System.out.println("Lista de Departamentos y sus Indices");
						imp.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el indice del Departamento a editar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							departamento = (DepartamentosTienda) imp.buscar(indice);

							System.out.println("Nuevo encargado de la tienda");
							lectura = new Scanner(System.in);
							encargadoD = lectura.nextLine();

							departamento.setEncargadoD(encargadoD);
							imp.editar(indice, departamento);
						} catch (Exception e) {
							System.out.println("Id no encontrado o no existente");
						}

						break;

					case 3:

						System.out.println("Lista de Departamentos y sus Indices");
						imp.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el indice del Departamento a eliminar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							departamento = (DepartamentosTienda) imp.buscar(indice);
							imp.eliminar(indice);
							System.out.println("Se elimino el Departamento: " + departamento.getNombreD());
						} catch (Exception e) {
							System.out.println("Id no encontrado o no existente");
						}

						break;

					case 4:

						System.out.println("Lista de Departamentos y sus Indices");
						imp.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el indice del Departamento a buscar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							departamento = (DepartamentosTienda) imp.buscar(indice);

							System.out.println("Se encontro el Departamento: " + departamento);
						} catch (Exception e) {
							System.out.println("Id no encontrado o no existente");
						}

						break;

					case 5:
						imp.listar();
						break;

					case 6:
						System.out.println("\n		-------- GOOD BYE --------");
						break;
					}

				} while (menuI < 6);

				break;

			case 2:
				System.out.println("\n		-------- THE END --------");
				break;
			}

		} while (menu < 2);

	}

}
