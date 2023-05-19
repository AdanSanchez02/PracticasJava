package ejercicios.hasmap.empleados;

import java.util.Scanner;

public class Main {

	static int idEmpleado; // este sera nuestra llave
	static String nombre;
	static String turno;
	static int sucursal;

	static Empleados empleado = null;
	static Scanner lectura = null;
	static Implementacion imp = new Implementacion();

	static int menuP;
	static int subMenu;
	static boolean val = false;

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		menuPrincipal();
	}

	public static void menuPrincipal() {
		do {

			System.out.println("\n 	Menu Principal \n");
			System.out.println("1 -- Alta");
			System.out.println("2 -- Editar");
			System.out.println("3 -- Eliminar");
			System.out.println("4 -- Buscar");
			System.out.println("5 -- Mostrar");
			System.out.println("6 -- Contar");
			System.out.println("7 -- Salir");

			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();

			switch (menuP) {
			case 1:
				altaEmpleado();
				break;
				
			case 2:
				editarEmpleado();
				break;

			case 3:
				eliminarEmpleado();
				break;

			case 4:
				buscarEmpleado();
				break;

			case 5:
				imp.mostrar();
				break;

			case 6:
				imp.contar();
				break;

			case 7:
				break;

			}

		} while (menuP < 7);
	}
	
	public static void altaEmpleado() {
		System.out.println("\nIngreso los valores solicitados");
		
		System.out.println("Numero de Empleado");
		val = true;
		do {
			try {
				lectura = new Scanner(System.in);
				idEmpleado = lectura.nextInt();
				val= false;
			} catch (Exception e) {
				System.out.println("Caracter no valido, ingrese el numero de empleado de forma entero");
				
			}
		}while(val != false);
		
		
		
		System.out.println("Nombre del Empleado");
		lectura = new Scanner(System.in);
		nombre = lectura.nextLine();

		System.out.println("Turno");
		lectura = new Scanner(System.in);
		turno = lectura.nextLine();
		
		System.out.println("Numero de Sucursal");
		val = true;
		do {
			try {
				lectura = new Scanner(System.in);
				sucursal = lectura.nextInt();
				val= false;
			} catch (Exception e) {
				System.out.println("Caracter no valido, ingrese el numero de sucursal de forma entero");
				
			}
		}while(val != false);
	
		// Guardar
		empleado = new Empleados(idEmpleado, nombre, turno, sucursal);
		imp.guardar(empleado);
	}

	public static void editarEmpleado() {
		System.out.println("Ingrese el numero de empleado a editar: ");
		try {
			lectura = new Scanner(System.in);
			idEmpleado = lectura.nextInt();
			
			try {
				empleado = new Empleados(idEmpleado);
				empleado = imp.buscar(empleado);
				System.out.println("Se encontro el empleado a editar: " + empleado.getNombre());
				menuEditarEmpleado();
				
			}catch (Exception e) {
				System.out.println("No existe este numero de empleado");
			}
		} catch (Exception e) {
			System.out.println("Caracter no valido");
		}
		
	}
	
	public static void menuEditarEmpleado() {
		do {
			System.out.println("\n 	Menu de Edita \n");
			System.out.println("1 -- Editar nombre");
			System.out.println("2 -- Editar turno");
			System.out.println("3 -- Salir");
			
			try {
				
				lectura = new Scanner(System.in);
				subMenu = lectura.nextInt();
				
				switch(subMenu) {
				
				case 1:
					
					System.out.println("Ingrese el Nombre");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();
					empleado.setNombre(nombre);
					imp.editar(empleado);
					break;
				
				case 2:
					
					System.out.println("Ingrese el Turno");
					lectura = new Scanner(System.in);
					turno = lectura.nextLine();
					empleado.setTurno(turno);
					imp.editar(empleado);
					break;
					
				case 3:
					break;
					
				}
				
			} catch (Exception e) {
				System.out.println("Caracter no valido");
			}
			
			
		}while(subMenu < 3);
	}
	
	public static void eliminarEmpleado() {
		System.out.println("Ingrese el numero del empleado a eliminar: ");
		try {
			lectura = new Scanner(System.in);
			idEmpleado = lectura.nextInt();
			try {
				empleado = new Empleados(idEmpleado);
				empleado = imp.buscar(empleado);
				imp.eliminar(empleado);
				System.out.println("Se elimino el empleado: " + empleado.getNombre());
			} catch (Exception e) {
				System.out.println("No existe este numero de empleado");
			}
		} catch (Exception e) {
			System.out.println("Caracter no valido");
		}
	}

	public static void buscarEmpleado() {
		System.out.println("Ingrese el numero del empleado a buscar: ");
		try {
			lectura = new Scanner(System.in);
			idEmpleado = lectura.nextInt();
			try {
				empleado = new Empleados(idEmpleado);
				empleado = imp.buscar(empleado);
				System.out.println("Se encontro el empleado: " + empleado.getNombre());
			} catch (Exception e) {
				System.out.println("No existe este numero de empleado");
			}
		} catch (Exception e) {
			System.out.println("Caracter no valido");
		}
	}

}
