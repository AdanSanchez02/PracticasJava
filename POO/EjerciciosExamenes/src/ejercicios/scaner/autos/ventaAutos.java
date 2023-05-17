package ejercicios.scaner.autos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ventaAutos {

	// Declaramos variables
	public static String marca;
	public static String modelo;
	public static String version;
	public static int anio;
	public static String caja;
	public static long precio;
	public static float motor;

	public static int indice, buscarI;

	// Espacio de memoria
	public static Autos car = null;
	// Funcion scanner
	public static Scanner lectura = null;
	// Lista
	public static List<Autos> listCar = new ArrayList<Autos>();

	public static void main(String[] args) {
		menuPrincipal();
	}

	public static void menuPrincipal() { // Menu principal

		int menuP, lecM;
		boolean flag = true;
		do {
			System.out.println("Menu de Opciones");
			System.out.println("1 -- Dar de alta");
			System.out.println("2 -- Buscar auto");
			System.out.println("3 -- Editar auto");
			System.out.println("4 -- Eliminar auto");
			System.out.println("5 -- Contar Producto");
			System.out.println("6 -- Mostrar autos");
			System.out.println("7 -- Buscar por modelo de auto");
			System.out.println("8 -- Eliminar por modelo de auto");
			System.out.println("9 -- Vaciar");
			System.out.println("10 -- Salir");

			lecM = valI();
			menuP = lecM;
			
			if (menuP > 0 && menuP < 11) {
				switch (menuP) {
				case 1:
					altaCar();
					break;
				case 2:
					buscarI = buscarIndice();
					car = listCar.get(buscarI);
					System.out.println("info: " + car);
					break;
				case 3:
					editarAuto();
					break;
				case 4:
					eliminarAuto();
					break;
				case 5:
					System.out.println("Productos en existencia" + listCar.size());
					break;
				case 6:
					System.out.println("Autos en existencia");
					for (int i = 0; i < listCar.size(); i++) {
						System.out.printf("\n [%d] " + listCar.get(i), i);
					}
					break;
				case 7:
					buscarModelo();
					break;
				case 8:
					eliminarModelo();
					break;
				case 9:
					delAll();
					break;
				case 10:
					flag = false;
					break;
				}
			} else {
				System.out.println("Ingrese una opcion correcta");
			}

		} while (flag == true);
	}

	public static void delAll() {
		System.out.println("Desea Eliminar todos los autos");
		System.out.println("1 -- si, 2 -- regresar al menu principal");
		int vc;
		lectura = new Scanner(System.in);
		vc = lectura.nextInt();
		if (vc == 1) {
			listCar.clear();
			System.out.println("Se han eliminado los datos correctamente");
		}
	}

	public static void eliminarModelo() {
		System.out.println(" Modelos de Autos en existencia");
		for (int i = 0; i < listCar.size(); i++) {
			System.out.printf("\n [%d] " + listCar.get(i).getModelo(), i);
		}

		System.out.println("\nIngrese el Modelo del Auto a eliminar");
		String elMod = " ";
		lectura = new Scanner(System.in);
		elMod = lectura.nextLine();
		for (int n = 0; n < listCar.size(); n++) {
			if (listCar.get(n).getModelo().equals(elMod)) {
				listCar.remove(n);
				System.out.println("Se elimino: " + elMod);
			}
		}
	}

	public static void buscarModelo() {
		System.out.println(" Modelos de Autos en existencia");
		for (int i = 0; i < listCar.size(); i++) {
			System.out.printf("\n [%d] " + listCar.get(i).getModelo(), i);
		}

		System.out.println("\nIngrese el Modelo del Auto a buscar");
		String name = " ";
		lectura = new Scanner(System.in);
		name = lectura.nextLine();

		for (Autos p : listCar) {
			if (p.getModelo().equals(name)) {

				System.out.println("Se encontro: " + p);
			}
		}

	}

	public static void eliminarAuto() {
		System.out.println("Indice y Modelo del Auto ");
		for (int i = 0; i < listCar.size(); i++) {
			System.out.printf("\n [%d] " + listCar.get(i).getModelo(), i);
		}

		System.out.println("\nIngrese el indice del auto a eliminar");
		lectura = new Scanner(System.in);
		indice = lectura.nextInt();
		listCar.remove(indice);
		System.out.println("Se ha eliminado el auto con el indice " + indice + " correctamente");

	}

	public static void editarAuto() {
		int menuS;
		boolean aux = true;
		System.out.println("Indice y Modelo del Auto a buscar");
		for (int i = 0; i < listCar.size(); i++) {
			System.out.printf("\n [%d] " + listCar.get(i).getModelo(), i);
		}

		System.out.println("\nIngrese el indice del auto a modificar");
		int edA = valI();
		indice = edA;

		car = listCar.get(indice);
		System.out.println("Se encontro el Auto" + car);

		do {
			System.out.println("Submenu de datos del auto");
			System.out.println("1 -- Editar version del auto");
			System.out.println("2 -- Editar año del auto");
			System.out.println("3 -- Menu principal");

			lectura = new Scanner(System.in);
			menuS = lectura.nextInt();

			switch (menuS) {
			case 1:
				System.out.println("Ingrese la version a modificar del auto");
				lectura = new Scanner(System.in);
				version = lectura.nextLine();
				car.setVersion(version);
				listCar.set(indice, car);
				System.out.println("Se edito correctamente");
				aux = false;
				break;

			case 2:
				System.out.println("Ingrese el año a modificar del auto");
				lectura = new Scanner(System.in);
				int ao = valI();
				car.setAnio(ao);
				listCar.set(indice, car);
				System.out.println("Se edito correctamente");
				aux = false;
				break;

			case 3:
				break;
			}

		} while (aux == true);
	}

	public static int buscarIndice() {
		System.out.println("Indice y Modelo del Auto a buscar");
		for (int i = 0; i < listCar.size(); i++) {
			System.out.printf("\n [%d] " + listCar.get(i).getModelo(), i);
		}

		System.out.println("\nIngrese el indice del Auto a buscar");
		int bI = valI();
		indice = bI;

		return indice;
	}

	public static void altaCar() {
		System.out.println("Ingrese los datos solicitados");

		System.out.println("Ingrese la Marca");
		lectura = new Scanner(System.in);
		marca = lectura.nextLine();
		System.out.println("Ingrese el Modelo");
		lectura = new Scanner(System.in);
		modelo = lectura.nextLine();

		System.out.println("Ingrese la Version");
		lectura = new Scanner(System.in);
		version = lectura.nextLine();

		System.out.println("Ingrese el año del auto");
		int an = valI();
		anio = an;

		System.out.println("Ingrese tipo de caja");
		lectura = new Scanner(System.in);
		caja = lectura.nextLine();

		System.out.println("Ingrese el precio");
		long pr = valL();
		precio = pr;

		System.out.println("Ingrese la version del motor");
		float vm = valF();
		motor = vm;

		car = new Autos(marca, modelo, version, anio, caja, precio, motor);
		listCar.add(car);
		System.out.println(listCar);
	}

	public static float valF() {
		float f;
		while (true) {
			try {
				lectura = new Scanner(System.in);
				f = lectura.nextFloat();
				break;
			} catch (Exception e) {
				System.out.println("Ingrese el dato en formato float y sin caracteres");
			}
		}
		return f;
	}

	public static int valI() {
		int f;
		while (true) {
			try {
				lectura = new Scanner(System.in);
				f = lectura.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Ingrese el dato en formato entero y sin caracteres");
			}
		}
		return f;
	}

	public static long valL() {
		long f;
		while (true) {
			try {
				lectura = new Scanner(System.in);
				f = lectura.nextLong();
				break;
			} catch (Exception e) {
				System.out.println("Ingrese el dato en formato long y sin caracteres");
			}
		}
		return f;
	}

}
