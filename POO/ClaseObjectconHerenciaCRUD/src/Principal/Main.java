package Principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.*;
import java.text.Format;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import Dominio.Clientes;
import Dominio.Departamentos;
import Dominio.Empleados;
import Dominio.Proyectos;
import Implementacion.ImpClientes;
import Implementacion.ImpDepartamentos;
import Implementacion.ImpEmpleados;
import Implementacion.ImpProyectos;

public class Main {

	public static void main(String[] args) throws ParseException {
		// -------Declarar las variables

		// Atributos Clientes
		int idC;
		String nombreC;
		String appC;
		String apmC;
		String correoC;
		long numC;
		// Atributos Departamentos
		int claveD;
		String nombreD;
		float sueldoD;
		// Atributos Empleados
		int claveE;
		String nombreE;
		long celE;
		int edad;
		long nss;
		// Atributos Proyectos
		int claveP;
		String nombreP;
		String fechaI;
		String fechaF;

		Departamentos departamento;
		Clientes cliente;
		Empleados empleado;
		Proyectos proyecto;

		Scanner lectura = null;
		int menu, menuC, menuD, menuE, menuP, indice;

		// Traer las clases de los objetos
		ImpDepartamentos impD = new ImpDepartamentos();
		ImpClientes impC = new ImpClientes();
		ImpEmpleados impE = new ImpEmpleados();
		ImpProyectos impP = new ImpProyectos();

		do {
			System.out.println("\n     MENU PRINCIPAL  \n");
			System.out.println("1 --- CRUD DEPARTAMENTOS");
			System.out.println("2 --- CRUD CLIENTES");
			System.out.println("3 --- CRUD EMPLEADOS");
			System.out.println("4 --- CRUD PROYECTOS (aun en construccion)");
			System.out.println("5 --- SALIR");
			lectura = new Scanner(System.in);
			menu = lectura.nextInt();
			Object read;

			switch (menu) {

			// ----------------------------------------DEPARTAMENTOS----------------------------------------------------------
			case 1:
				do {
					System.out.println("\n     MENU DEPARTAMENTOS  \n");
					System.out.println("1 --- ALTAS");
					System.out.println("2 --- EDITAR");
					System.out.println("3 --- ELIMINAR");
					System.out.println("4 --- BUSCAR");
					System.out.println("5 --- MOSTRAR");
					System.out.println("6 --- MENU PRINCIPAL");
					lectura = new Scanner(System.in);
					menuD = lectura.nextInt();

					switch (menuD) {

					case 1:

						System.out.println("\n	Introduzca los datos solicitados  ");

						System.out.println("Clave del departamento");
						lectura = new Scanner(System.in);
						claveD = lectura.nextInt();

						System.out.println("Nombre del departamento");
						lectura = new Scanner(System.in);
						nombreD = lectura.nextLine();

						System.out.println("Sueldo ofrecido en el departamento");
						lectura = new Scanner(System.in);
						sueldoD = lectura.nextFloat();

						departamento = new Departamentos(claveD, nombreD, sueldoD);
						impD.guardar(departamento);
						System.out.println("Se guardo correctamente");

						break;

					case 2:

						System.out.println("\n	Departamentos Existentes  ");
						impD.mostrarIndice();

						System.out.println("\n  Ingrese el indice del Departamento a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						departamento = (Departamentos) impD.buscar(indice);

						System.out.println("Sueldo a cambiar del departamento");
						lectura = new Scanner(System.in);
						sueldoD = lectura.nextFloat();

						departamento.setSueldoD(sueldoD);
						impD.editar(indice, departamento);

						break;

					case 3:
						System.out.println("\n	Departamentos Existentes  ");
						impD.mostrarIndice();

						System.out.println("\n  Ingrese el indice del Departamento a eliminar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						departamento = (Departamentos) impD.buscar(indice);
						impD.eliminar(indice);

						System.out.println("Se elimino el Departamento: " + departamento.getNombreD());

						break;

					case 4:
						System.out.println("\n	Departamentos Existentes  ");
						impD.mostrarIndice();
						System.out.println("\n  Ingrese el indice del Departamento a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						departamento = (Departamentos) impD.buscar(indice);

						System.out.println("Se encontro el Departamento: " + departamento.getNombreD());

						break;

					case 5:
						impD.listar();
						break;

					case 6:

						break;
					}

				} while (menuD < 6);
				break;

			// ----------------------------------------Empleados----------------------------------------------------------
			case 3:
				do {
					System.out.println("\n     MENU EMPLEADOS  \n");
					System.out.println("1 --- ALTAS");
					System.out.println("2 --- EDITAR");
					System.out.println("3 --- ELIMINAR");
					System.out.println("4 --- BUSCAR");
					System.out.println("5 --- MOSTRAR");
					System.out.println("6 --- MENU PRINCIPAL");
					lectura = new Scanner(System.in);
					menuD = lectura.nextInt();

					switch (menuD) {

					case 1:

						System.out.println("\n	Introduzca los datos solicitados  ");

						while (true) {
							try {
								System.out.println("clave del empleado");
								lectura = new Scanner(System.in);
								claveE = lectura.nextInt();
								break;
							} catch (Exception e) {
								System.out.println("Introduzca solo numeros enteros");
							}
						}

						System.out.println("Nombre del Empleado");
						lectura = new Scanner(System.in);
						nombreE = lectura.nextLine();

						while (true) {
							try {
								System.out.println("Numero de celular del Empleado");
								lectura = new Scanner(System.in);
								celE = lectura.nextLong();
								break;
							} catch (Exception e) {
								System.out.println("Introduzca solo numeros enteros");
							}
						}

						while (true) {
							try {
								System.out.println("Edad del Empleado");
								lectura = new Scanner(System.in);
								edad = lectura.nextInt();
								break;
							} catch (Exception e) {
								System.out.println("Introduzca solo numeros enteros");
							}
						}
						while (true) {
							try {
								System.out.println("Numero de segurso social");
								lectura = new Scanner(System.in);
								nss = lectura.nextLong();
								break;
							} catch (Exception e) {
								System.out.println("Introduzca solo numeros enteros");
							}
						}

						empleado = new Empleados(claveE, nombreE, celE, edad, nss);
						impE.guardar(empleado);
						System.out.println("Se guardo correctamente");

						break;

					case 2:

						System.out.println("\n	Empleados Existentes  ");
						impE.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el numero del empleado a buscar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							empleado = (Empleados) impE.buscar(indice);

							while (true) {
								try {
									System.out.println("Numero de celular del Empleado");
									lectura = new Scanner(System.in);
									celE = lectura.nextLong();
									break;
								} catch (Exception e) {
									System.out.println("Introduzca solo numeros enteros");
								}
							}

							empleado.setCelE(celE);
							impE.editar(indice, empleado);
						} catch (Exception e) {
							System.out.println("Indice no encontrado o no existente");
						}

						break;

					case 3:

						System.out.println("\n	Empleados Existentes  ");
						impC.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el indice del empleado a eliminar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							empleado = (Empleados) impE.buscar(indice);
							impE.eliminar(indice);

							System.out.println("Se elimino al empleado: " + empleado);
						} catch (Exception e) {
							System.out.println("Indice no encontrado o no existente");
						}

						break;

					case 4:
						System.out.println("\n	Empleados  Existentes  ");
						impE.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el indice del Empleado a buscar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							empleado = (Empleados) impE.buscar(indice);

							System.out.println("Se encontro al Empleado: " + empleado);

						} catch (Exception e) {
							System.out.println("Indice no encontrado o no existente");
						}

						break;

					case 5:
						impE.listar();
						break;

					case 6:

						break;
					}

				} while (menuD < 6);
				break;

			// ----------------------------------------Clientes----------------------------------------------------------
			case 2:
				do {
					System.out.println("\n     MENU CLIENTES  \n");
					System.out.println("1 --- ALTAS");
					System.out.println("2 --- EDITAR");
					System.out.println("3 --- ELIMINAR");
					System.out.println("4 --- BUSCAR");
					System.out.println("5 --- MOSTRAR");
					System.out.println("6 --- MENU PRINCIPAL");
					lectura = new Scanner(System.in);
					menuD = lectura.nextInt();

					switch (menuD) {

					case 1:

						System.out.println("\n	Introduzca los datos solicitados  ");

						while (true) {
							try {
								System.out.println("id del Cliente");
								lectura = new Scanner(System.in);
								idC = lectura.nextInt();
								break;
							} catch (Exception e) {
								System.out.println("Introduzca solo numeros enteros");
							}
						}

						System.out.println("Nombre del Cliente");
						lectura = new Scanner(System.in);
						nombreC = lectura.nextLine();

						System.out.println("Apellido Paterno Cliente");
						lectura = new Scanner(System.in);
						appC = lectura.nextLine();

						System.out.println("Apellido Materno Cliente");
						lectura = new Scanner(System.in);
						apmC = lectura.nextLine();

						System.out.println("Correo Electronico Cliente");
						lectura = new Scanner(System.in);
						correoC = lectura.nextLine();

						while (true) {
							try {
								System.out.println("Numero de celular del cliente");
								lectura = new Scanner(System.in);
								numC = lectura.nextLong();
								break;
							} catch (Exception e) {
								System.out.println("Introduzca solo numeros enteros");
							}
						}

						cliente = new Clientes(idC, nombreC, appC, apmC, correoC, numC);
						impC.guardar(cliente);
						System.out.println("Se guardo correctamente");

						break;

					case 2:

						System.out.println("\n	Clietes Existentes  ");
						impC.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el indice del cliente a buscar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							cliente = (Clientes) impC.buscar(indice);

							System.out.println("Nuevo Correo Electronico del Cliente");
							lectura = new Scanner(System.in);
							correoC = lectura.nextLine();

							cliente.setCorreoC(correoC);
							impC.editar(indice, cliente);
						} catch (Exception e) {
							System.out.println("Indice no encontrado o no existente");
						}

						break;

					case 3:

						System.out.println("\n	Clientes Existentes  ");
						impC.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el indice del cliente a eliminar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							cliente = (Clientes) impC.buscar(indice);
							impC.eliminar(indice);

							System.out.println("Se elimino el Cliente: " + cliente);
						} catch (Exception e) {
							System.out.println("Indice no encontrado o no existente");
						}

						break;

					case 4:
						System.out.println("\n	Clientes  Existentes  ");
						impC.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el indice del Cliente a buscar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							cliente = (Clientes) impC.buscar(indice);

							System.out.println("Se encontro al Cliente: " + cliente.getNombreC());

						} catch (Exception e) {
							System.out.println("Indice no encontrado o no existente");
						}

						break;

					case 5:
						impC.listar();
						break;

					case 6:

						break;
					}

				} while (menuD < 6);
				break;

			// ----------------------------------------Proyectos----------------------------------------------------------
			case 4:
				do {
					System.out.println("\n     MENU PROYECTOS  \n");
					System.out.println("1 --- ALTAS");
					System.out.println("2 --- EDITAR");
					System.out.println("3 --- ELIMINAR");
					System.out.println("4 --- BUSCAR");
					System.out.println("5 --- MOSTRAR");
					System.out.println("6 --- MENU PRINCIPAL");
					lectura = new Scanner(System.in);
					menuD = lectura.nextInt();

					switch (menuD) {

					case 1:

						System.out.println("\n	Introduzca los datos solicitados  ");

						while (true) {
							try {
								System.out.println("clave del proyecto");
								lectura = new Scanner(System.in);
								claveP = lectura.nextInt();
								break;
							} catch (Exception e) {
								System.out.println("Introduzca solo numeros enteros");
							}
						}

						System.out.println("Nombre del Proyecto");
						lectura = new Scanner(System.in);
						nombreP = lectura.nextLine();

						System.out.println("Fecha de Inicio del Proyecto en formato yyyy-mm-dd");
						lectura = new Scanner(System.in);
						fechaI = lectura.nextLine();

						System.out.println("Fecha de Finalizacion del Proyecto en formato yyyy-mm-dd");
						lectura = new Scanner(System.in);
						fechaF =  lectura.nextLine();

						Date date1 = java.sql.Date.valueOf(fechaI);
						Date date2 = java.sql.Date.valueOf(fechaF);

						proyecto = new Proyectos(claveP, nombreP, (java.sql.Date) date1, (java.sql.Date) date2);
						impP.guardar(proyecto);
						System.out.println("Se guardo correctamente");

						break;

					case 2:

						System.out.println("\n	Proyectos Existentes  ");
						impP.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el indice del proyecto a buscar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							proyecto = (Proyectos) impP.buscar(indice);

							System.out.println("Nuevo fecha final del proyecto en formato yyyy-mm-dd");
							lectura = new Scanner(System.in);
							fechaF =  lectura.nextLine();
							Date date3 = java.sql.Date.valueOf(fechaF);
							
							proyecto.setFechaF((java.sql.Date) date3);
							impP.editar(indice, proyecto);
							
						} catch (Exception e) {
							System.out.println("Indice no encontrado o no existente");
						}

						break;

					case 3:

						System.out.println("\n	Clientes Existentes  ");
						impP.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el indice del cliente a eliminar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							proyecto = (Proyectos) impP.buscar(indice);
							impP.eliminar(indice);

							System.out.println("Se elimino el Cliente: " + proyecto);
						} catch (Exception e) {
							System.out.println("Indice no encontrado o no existente");
						}

						break;

					case 4:
						System.out.println("\n	Clientes  Existentes  ");
						impP.mostrarIndice();

						try {
							System.out.println("\n  Ingrese el indice del Cliente a buscar");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();

							proyecto = (Proyectos) impP.buscar(indice);

							System.out.println("Se encontro al Cliente: " + proyecto.getNombreP());

						} catch (Exception e) {
							System.out.println("Indice no encontrado o no existente");
						}

						break;

					case 5:
						impP.listar();
						break;

					case 6:

						break;
					}

				} while (menuD < 6);
				break;

			case 5:
				break;

			}

		} while (menu < 5);

	}

}
