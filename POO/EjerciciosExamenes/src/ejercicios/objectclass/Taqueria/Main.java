package ejercicios.objectclass.Taqueria;

import java.util.Scanner;

public class Main {

	// Atributos Taqueria
	static String idTienda; // Llave
	static String Ubicacion;
	static long horasTrabajador;
	static long numTelefono;

	// Atributos Empleados
	static int numEmpleado; // Llave
	static String nombre;
	static String apPaterno;
	static String cuentaBanco;

	static Taqueria taqueria;
	static Empleados empleado;
	static Implementacion imp = new Implementacion();

	static Scanner lectura = null;
	static int menuP, menuD, menuE;

	public static void main(String[] args) {
		menuPrincipal();
	}

	public static void menuPrincipal() {
		do {
			System.out.println("\n 	Menu Principal \n");
			System.out.println("1 -- CRUD Taqueria");
			System.out.println("2 -- CRUD Empleados");
			System.out.println("3 -- Salir");

			try {
				lectura = new Scanner(System.in);
				menuP = lectura.nextInt();

				switch (menuP) {

				case 1:
					menuTaqueriaCRUD();
					break;

				case 2:
					menuEmpleadosCRUD();
					break;

				case 3:
					break;
				}
			} catch (Exception e) {
				System.out.println("Seleccion no valida");
			}

		} while (menuP < 3);
	}

	public static void menuEmpleadosCRUD() {
		do {
			System.out.println("\n 	Menu Empleados \n");
			System.out.println("1 -- Altas");
			System.out.println("2 -- Editar ");
			System.out.println("3 -- Eliminar");
			System.out.println("4 -- Buscar");
			System.out.println("5 -- Mostrar ");
			System.out.println("6 -- Menu principal");

			lectura = new Scanner(System.in);
			menuE = lectura.nextInt();

			switch (menuE) {
			case 1:

				System.out.println("\n 	Ingrese los datos solicitados");

				while (true) {
					try {
						System.out.println("Numero de empleado");
						lectura = new Scanner(System.in);
						numEmpleado = lectura.nextInt();
						break;
					} catch (Exception e) {
						System.out.println("Ingresar numero de empleado en formato entero");
					}
				}

				System.out.println("Nombre");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				System.out.println("Apellido Paterno");
				lectura = new Scanner(System.in);
				apPaterno = lectura.nextLine();

				System.out.println("Cuenta CLABE");
				lectura = new Scanner(System.in);
				cuentaBanco = lectura.nextLine();

				imp.mostrarTaqueria();

				System.out.println("taqueria");
				lectura = new Scanner(System.in);
				idTienda = lectura.nextLine();

				// Antes de dar de alta el empleo le asignamos el departamento
				taqueria = new Taqueria(idTienda);
				taqueria = (Taqueria) imp.buscarTaqueria(taqueria);

				empleado = new Empleados(numEmpleado, nombre, apPaterno, cuentaBanco, taqueria);
				imp.guardar(empleado, "Empleados");
				System.out.println("Se guardo correctamente");

				break;

			case 2:
				try {
					System.out.println("\n	Ingrese el numero del empleado a editar: ");
					lectura = new Scanner(System.in);
					numEmpleado = lectura.nextInt();

					empleado = new Empleados(numEmpleado);
					empleado = (Empleados) imp.buscarEmpleado(empleado);

					System.out.println("\n	Ingrese la nueva cuenta de banco");
					lectura = new Scanner(System.in);
					cuentaBanco = lectura.nextLine();

					empleado.setCuentaBanco(cuentaBanco);

					imp.editar(empleado, "Empleados");
					System.out.println("Se edito Correctamente");

				} catch (Exception e) {
					System.out.println("No existe un empleado con ese numero");
				}

				break;

			case 3:
				try {
					System.out.println("\n 	Ingrese el numero del empleado a eliminar");
					lectura = new Scanner(System.in);
					numEmpleado = lectura.nextInt();
					empleado = new Empleados(numEmpleado);
					empleado = (Empleados) imp.buscarEmpleado(empleado);
					imp.eliminar(empleado, "Empleados");
				} catch (Exception e) {
					System.out.println("No existe numero de empleado o el numero digitado se encuentra mal");
				}

				break;

			case 4:
				System.out.println("\n 	Ingrese el numero del empleado a buscar");

				try {
					lectura = new Scanner(System.in);
					numEmpleado = lectura.nextInt();
					empleado = new Empleados(numEmpleado);
					empleado = (Empleados) imp.buscarEmpleado(empleado);
					System.out.println("Se encontro el empleado" + empleado.getNombre());
				} catch (Exception e) {
					System.out.println("No existe numero de empleado o el numero digitado se encuentra mal");
				}
				break;

			case 5:
				imp.mostrarEmpleado();
				break;

			case 6:
				break;

			}

		} while (menuE < 6);

	}

	public static void menuTaqueriaCRUD() {
		do {
			System.out.println("\n 	Menu Taquerias \n");
			System.out.println("1 -- Altas");
			System.out.println("2 -- Editar ");
			System.out.println("3 -- Eliminar");
			System.out.println("4 -- Buscar");
			System.out.println("5 -- Mostrar ");
			System.out.println("6 -- Menu principal");

			lectura = new Scanner(System.in);
			menuD = lectura.nextInt();

			switch (menuD) {
			case 1:

				System.out.println("\n 	Ingrese los datos solicitados");

				System.out.println("Identificador de Tienda");
				lectura = new Scanner(System.in);
				idTienda = lectura.nextLine();

				System.out.println("Ubicacion");
				lectura = new Scanner(System.in);
				Ubicacion = lectura.nextLine();

				while (true) {
					try {
						System.out.println("Horas de trabajo por jornada");
						lectura = new Scanner(System.in);
						horasTrabajador = lectura.nextLong();
						break;
					} catch (Exception e) {
						System.out.println("Ingrensar solo enteros");
					}
				}

				while (true) {
					try {
						System.out.println("Numero de telefono de la tienda");
						lectura = new Scanner(System.in);
						numTelefono = lectura.nextLong();
						break;
					} catch (Exception e) {
						System.out.println("Ingrensar solo enteros");
					}
				}

				taqueria = new Taqueria(idTienda, Ubicacion, horasTrabajador, numTelefono);
				imp.guardar(taqueria, "Taqueria");
				System.out.println("Se guardo correctamente");

				break;

			case 2:

				System.out.println("\n	Ingrese el Id de la tienda a editar: ");

				try {
					lectura = new Scanner(System.in);
					idTienda = lectura.nextLine();

					taqueria = new Taqueria(idTienda);
					taqueria = (Taqueria) imp.buscarTaqueria(taqueria);
					while (true) {
						try {
							System.out.println("\n	Ingrese las horas por jonadas ");
							lectura = new Scanner(System.in);
							horasTrabajador = lectura.nextLong();

							taqueria.setHorasTrabajador(horasTrabajador);
							imp.editar(taqueria, "Taqueria");
							System.out.println("Se edito Correctamente");
							break;
						} catch (Exception e) {
							System.out.println("Ingrensar solo enteros");
						}
					}

				} catch (Exception e) {
					System.out.println("Id no valida o no existente");
				}

				break;

			case 3:

				System.out.println("\n 	Ingrese el Id de la tienda a eliminar");
				try {
					lectura = new Scanner(System.in);
					idTienda = lectura.nextLine();
					taqueria = new Taqueria(idTienda);
					taqueria = (Taqueria) imp.buscarTaqueria(taqueria);
					imp.eliminar(taqueria, "Taqueria");

				} catch (Exception e) {
					System.out.println("Id no valida o no existente");
				}

				break;

			case 4:

				System.out.println("\n 	Ingrese el Id de la tienda a buscar");

				try {
					lectura = new Scanner(System.in);
					idTienda = lectura.nextLine();
					taqueria = new Taqueria(idTienda);
					taqueria = (Taqueria) imp.buscarTaqueria(taqueria);
					System.out.println("Se encontro el Departamento" + taqueria);

				} catch (Exception e) {
					System.out.println("Id no valida o no existente");
				}

				break;

			case 5:
				imp.mostrarTaqueria();
				break;

			case 6:
				break;
			}

		} while (menuD < 6);
	}

}
