package ejercicio.her.cajero;

import java.util.Scanner;

public class Acciones {

	// Atributos Bnaco
	static String nombreU;
	static long numeroT;
	static int pinT;
	// Atributos Cajero
	static long cantidadD;
	static long numC;
	static String password;

	static Cajero cajero;
	static Scanner lectura = null;
	static Implementacion imp = new Implementacion();

	static boolean log = true;
	static long user;
	static long PIN;
	static int verificado;

	static int menuP, menuA, menuEditarA, menuC, indice;

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		menuPrincipal();

	}

	public static void menuCajero() {
		do {
			System.out.println("\n	Cajero \n");
			System.out.println("1 --- Consulta Saldo");
			System.out.println("2 --- Depositar Efectivo");
			System.out.println("3 --- Retirar Efectivo");
			System.out.println("4 --- Regresar a menu principal");

			lectura = new Scanner(System.in);
			menuC = lectura.nextInt();

			switch (menuC) {
			case 1:
				cajero = (Cajero) imp.buscar(indice);
				System.out.println("Usuario: " + cajero.getNombreU());
				System.out.println("Saldo: " + cajero.getCantidadD());
				break;

			case 2:
				depositarSaldo();
				break;

			case 3:
				retirarSaldo();
				break;

			case 4:
				break;
			}

		} while (menuC < 4);
	}
	
	public static void retirarSaldo() {
		cajero = (Cajero) imp.buscar(indice);

		System.out.println("Saldo Actual: " + cajero.getCantidadD());
		long retiro;
		while (true) {
			try {
				System.out.println("Introduzca la cantidad efectivo a retirar:\n");
				System.out.println("Solo puede retirar en billetes de 1000, 500, 200, 100, 50, 20");
				lectura = new Scanner(System.in);
				retiro = lectura.nextLong();
				
				if(retiro > 20 && retiro < cajero.getCantidadD()) {
					long mod = retiro %10;
					System.out.println("Usted Retiro: " + (retiro-mod));
					long auxD;
					auxD = cajero.getCantidadD() - retiro;
					cajero.setCantidadD(auxD+mod);
					imp.editar(indice, cajero);
					System.out.println("Saldo Actual: " + cajero.getCantidadD());
					break;
				}
				else {
					System.out.println("Saldo Insuficiente");
					break;
				}
				
			} catch (Exception e) {
				System.out.println("Dato no valido, favor de introducir enteros");
			}
		}
	}

	public static void depositarSaldo() {
		cajero = (Cajero) imp.buscar(indice);

		System.out.println("Introduzca el efectivo:");
		while (true) {
			try {
				lectura = new Scanner(System.in);
				cantidadD = lectura.nextLong();
				long auxD;
				auxD = cantidadD + cajero.getCantidadD();
				cajero.setCantidadD(auxD);
				imp.editar(indice, cajero);
				System.out.println("Saldo Actual: " + cajero.getCantidadD());
				break;
			} catch (Exception e) {
				System.out.println("Dato no valido, favor de introducir enteros");
			}
		}
	}

	public static void loginCajero() {

		do {
			System.out.println("\n	Introduzca los datos solicitado");

			System.out.println("\n Numero de tarjeta");
			lectura = new Scanner(System.in);
			user = lectura.nextLong();

			System.out.println("\n PIN TARJETA");
			lectura = new Scanner(System.in);
			PIN = lectura.nextLong();

			verificado = imp.validacionUsuario(user, PIN);

			if (verificado == 1) {
				indice = imp.indiceUsuarioCajero(user, PIN);
				menuCajero();
				log = false;
			} else {
				System.out.println("Usuario no encontrado");
				log = false;
			}

		} while (log == true);
	}

	public static void menuAltaUsuario() {
		do {
			System.out.println("\n	MENU ALTA USUARIO \n");
			System.out.println("1 --- ALTA");
			System.out.println("2 --- EDITAR");
			System.out.println("3 --- ELIMINAR");
			System.out.println("4 --- BUSCAR");
			System.out.println("5 --- MOSTRAR");
			System.out.println("6 --- SALIR A MENU PRINCIPAL");

			try {
				lectura = new Scanner(System.in);
				menuA = lectura.nextInt();

				switch (menuA) {
				case 1:
					altaUsuario();
					break;
				case 2:
					editarUsuario();
					break;
				case 3:
					eliminarUsuario();
					break;
				case 4:
					buscarUsuario();
					break;
				case 5:
					imp.listar();
					break;
				case 6:
					break;
				}

			} catch (Exception e) {
				System.out.println("Seleccion no valida");
				menuA = 0;
			}

		} while (menuA < 6);

	}

	public static void editarUsuario() {
		do {

			System.out.println("\n	EDITAR USUARIO \n");
			System.out.println("1 --- Tarjeta");
			System.out.println("2 --- Pin");
			System.out.println("3 --- Celular");
			System.out.println("4 --- Contrasena");
			System.out.println("5 --- Salir");

			try {
				lectura = new Scanner(System.in);
				menuEditarA = lectura.nextInt();

				switch (menuEditarA) {
				case 1:
					System.out.println("Lista de Usuarios y sus Indices");
					imp.mostrarIndice();

					try {
						System.out.println("\n Ingrese el indice del Usario a modificar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						cajero = (Cajero) imp.buscar(indice);

						System.out.println("Numero de Tarjeta Nueva");
						while (true) {
							try {
								lectura = new Scanner(System.in);
								numeroT = lectura.nextLong();
								cajero.setNumeroT(numeroT);
								imp.editar(indice, cajero);
								break;
							} catch (Exception e) {
								System.out.println("Dato no valido, favor de introducir enteros");
							}
						}

					} catch (Exception e) {
						System.out.println("Id no encontrado o no existente");
					}

					break;
				case 2:
					System.out.println("Lista de Usuarios y sus Indices");
					imp.mostrarIndice();

					try {
						System.out.println("\n Ingrese el indice del Usario a modificar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						cajero = (Cajero) imp.buscar(indice);

						System.out.println("Nuevo Pin");
						while (true) {
							try {
								lectura = new Scanner(System.in);
								pinT = lectura.nextInt();
								cajero.setPinT(pinT);
								imp.editar(indice, cajero);
								break;
							} catch (Exception e) {
								System.out.println("Dato no valido, favor de introducir enteros");
							}
						}

					} catch (Exception e) {
						System.out.println("Id no encontrado o no existente");
					}

					break;
				case 3:
					System.out.println("Lista de Usuarios y sus Indices");
					imp.mostrarIndice();

					try {
						System.out.println("\n Ingrese el indice del Usario a modificar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						cajero = (Cajero) imp.buscar(indice);

						System.out.println("Numero Celular Nuevo");
						while (true) {
							try {
								lectura = new Scanner(System.in);
								numC = lectura.nextLong();
								cajero.setNumC(numC);
								imp.editar(indice, cajero);
								break;
							} catch (Exception e) {
								System.out.println("Dato no valido, favor de introducir enteros");
							}
						}

					} catch (Exception e) {
						System.out.println("Id no encontrado o no existente");
					}

					break;
				case 4:
					System.out.println("Lista de Usuarios y sus Indices");
					imp.mostrarIndice();

					try {
						System.out.println("\n Ingrese el indice del Usario a modificar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						cajero = (Cajero) imp.buscar(indice);

						System.out.println("Contrasena Nueva");
						lectura = new Scanner(System.in);
						password = lectura.nextLine();
						cajero.setPassword(password);
						imp.editar(indice, cajero);

					} catch (Exception e) {
						System.out.println("Id no encontrado o no existente");
					}

					break;

				case 5:
					break;
				}

			} catch (Exception e) {
				System.out.println("Seleccion no valida");
				menuEditarA = 0;
			}

		} while (menuEditarA < 5);
	}

	public static void eliminarUsuario() {
		System.out.println("Lista de Usuarios y sus Indices");
		imp.mostrarIndice();

		try {
			System.out.println("\n Ingrese el indice del Usario a dar de baja");
			lectura = new Scanner(System.in);
			indice = lectura.nextInt();
			cajero = (Cajero) imp.buscar(indice);
			imp.eliminar(indice);
			System.out.println("Se dio de baja al Usuario: " + cajero.getNombreU());
		} catch (Exception e) {
			System.out.println("Id no encontrado o no existente");
		}
	}

	public static void buscarUsuario() {
		System.out.println("Lista de Usuarios y sus Indices");
		imp.mostrarIndice();

		try {
			System.out.println("\n Ingrese el indice del Usario a buscar");
			lectura = new Scanner(System.in);
			indice = lectura.nextInt();
			cajero = (Cajero) imp.buscar(indice);
			System.out.println("Informacion del Usuario: " + cajero);
		} catch (Exception e) {
			System.out.println("Id no encontrado o no existente");
		}
	}

	public static void altaUsuario() {

		System.out.println("\n	Ingrese los valores solicitados \n");

		System.out.println("Nombre del Usuario");
		lectura = new Scanner(System.in);
		nombreU = lectura.nextLine();

		System.out.println("Numero de Tarjeta");
		while (true) {
			try {
				lectura = new Scanner(System.in);
				numeroT = lectura.nextLong();
				break;
			} catch (Exception e) {
				System.out.println("Dato no valido, favor de introducir enteros");
			}
		}

		System.out.println("Pin de Tarjeta");
		while (true) {
			try {
				lectura = new Scanner(System.in);
				pinT = lectura.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Dato no valido, favor de introducir enteros");
			}
		}

		System.out.println("Cantidad inicial de efectivo para alta");
		while (true) {
			try {
				lectura = new Scanner(System.in);
				cantidadD = lectura.nextLong();
				break;
			} catch (Exception e) {
				System.out.println("Dato no valido, favor de introducir enteros");
			}
		}

		System.out.println("Numero Celular");
		while (true) {
			try {
				lectura = new Scanner(System.in);
				numC = lectura.nextLong();
				break;
			} catch (Exception e) {
				System.out.println("Dato no valido, favor de introducir enteros");
			}
		}

		System.out.println("Contrasena");
		lectura = new Scanner(System.in);
		password = lectura.nextLine();

		cajero = new Cajero(nombreU, numeroT, pinT, cantidadD, numC, password);
		imp.guardar(cajero);
		System.out.println("Informacion guardada con exito");
	}

	public static void menuPrincipal() {

		do {

			System.out.println("\nMENU BANCOMER BIENVENIDO\n");
			System.out.println("1 --- ALTA USUARIO");
			System.out.println("2 --- CAJERO");
			System.out.println("2 --- CERRAR APLICACION");
			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();

			switch (menuP) {
			case 1:
				menuAltaUsuario();
				break;

			case 2:
				loginCajero();
				break;

			case 3:
				System.out.println("\n		----- Vuelva Pronto -----");
				break;
			}

		} while (menuP < 3);
	}

}
