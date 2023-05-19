import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		// Atributos
		int id; // Llave para hashmap
		String nombreE;
		String apPaterno;
		String apMaterno;
		long celular;

		Empleados empleado;
		Departamentos departamento;

		int clave;
		String nombre; // Llave del hasmap
		float sueldo;

		Scanner lectura = null;
		int menuP, menuD, menuE;

		Implementacion imp = new Implementacion();

		do {

			System.out.println("\n 	Menu Principal \n");
			System.out.println("1 -- CRUD Departamentos");
			System.out.println("2 -- CRUS Empleados");
			System.out.println("3 -- Salir");

			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();

			switch (menuP) {
			case 1:

				// CRUD Departamentos
				do {
					System.out.println("\n 	Menu Departamentos \n");
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

						System.out.println("Numero de clave");
						lectura = new Scanner(System.in);
						clave = lectura.nextInt();

						System.out.println("Nombre");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine();

						System.out.println("Sueldo");
						lectura = new Scanner(System.in);
						sueldo = lectura.nextFloat();

						departamento = new Departamentos(clave, nombre, sueldo);
						imp.guardar(departamento, "Departamentos");
						System.out.println("Se guardo correctamente");
						break;

					case 2:
						System.out.println("\n	Ingrese el nombre del departamento a editar: ");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine();

						departamento = new Departamentos(nombre);
						departamento = (Departamentos) imp.buscarDepartamento(departamento);

						System.out.println("\n	Ingrese el nuevo sueldo ");
						lectura = new Scanner(System.in);
						sueldo = lectura.nextFloat();

						departamento.setSueldo(sueldo);
						imp.editar(departamento, "Departamentos");
						System.out.println("Se edito Correctamente");

						break;

					case 3:
						System.out.println("\n 	Ingrese el nombre del departamento a eliminar");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine();

						departamento = new Departamentos(nombre);
						departamento = (Departamentos) imp.buscarDepartamento(departamento);

						imp.eliminar(departamento, "Departamentos");

						break;

					case 4:
						System.out.println("\n 	Ingrese el nombre del departamento a buscar");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine();

						departamento = new Departamentos(nombre);
						departamento = (Departamentos) imp.buscarDepartamento(departamento);
						System.out.println("Se encontro el Departamento" + departamento);
						break;

					case 5:
						imp.mostrarDerpatamento();
						break;

					case 6:
						break;
					}

				} while (menuD < 6);

				break;

			case 2:

				// CRUD Empleados
				do {
					System.out.println("\n 	Menu Departamentos \n");
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

						System.out.println("Numero de empleado");
						lectura = new Scanner(System.in);
						id = lectura.nextInt();

						System.out.println("Nombre");
						lectura = new Scanner(System.in);
						nombreE = lectura.nextLine();

						System.out.println("Apellido Paterno");
						lectura = new Scanner(System.in);
						apPaterno = lectura.nextLine();

						System.out.println("Apellido Materno");
						lectura = new Scanner(System.in);
						apMaterno = lectura.nextLine();

						System.out.println("Celular");
						lectura = new Scanner(System.in);
						celular = lectura.nextLong();

						imp.mostrarDerpatamento();

						System.out.println("Departamento");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine();
						// Antes de dar de alta el empleo le asignamos el departamento
						departamento = new Departamentos(nombre);
						departamento = (Departamentos) imp.buscarDepartamento(departamento);

						empleado = new Empleados(id, nombreE, apPaterno, apMaterno, celular, departamento);
						imp.guardar(empleado, "Empleados");
						System.out.println("Se guardo correctamente");

						break;

					case 2:

						System.out.println("\n	Ingrese el id del empleado a editar: ");
						lectura = new Scanner(System.in);
						id = lectura.nextInt();
						
						empleado = new Empleados(id);
						empleado = (Empleados) imp.buscarEmpleado(empleado);
						
						System.out.println("\n	Ingrese el nuevo numero de celular ");
						lectura = new Scanner(System.in);
						celular = lectura.nextLong();
						
						empleado.setCelular(celular);
				
						imp.editar(empleado, "Empleados");
						System.out.println("Se edito Correctamente");

						break;

					case 3:
						System.out.println("\n 	Ingrese el id del empleado a eliminar");
						lectura = new Scanner(System.in);
						id = lectura.nextInt();

						empleado = new Empleados(id);
						empleado = (Empleados) imp.buscarEmpleado(empleado);

						imp.eliminar(empleado, "Empleados");
						break;

					case 4:
						System.out.println("\n 	Ingrese el id del empleado a buscar");
						lectura = new Scanner(System.in);
						id = lectura.nextInt();

						empleado = new Empleados(id);
						empleado = (Empleados) imp.buscarEmpleado(empleado);

						System.out.println("Se encontro el empleado" + empleado.getNombre());
						break;

					case 5:
						imp.mostrarEmpleado();
						break;

					case 6:
						break;

					}

				} while (menuE < 6);

				break;

			case 3:
				break;

			}

		} while (menuP < 3);

	}

}
