import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		int numeroC; // Este va a ser mi llave
		String nombre;
		String apellido;
		int edad;
		float estatura;

		Corredores corredor = null;
		Scanner lectura = null;
		Implementaciones imp = new Implementaciones();

		int menuP, subMenu;

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

				System.out.println("\nIngreso los valores solicitados");

				System.out.println("Numero de Corredor");
				lectura = new Scanner(System.in);
				numeroC = lectura.nextInt();

				System.out.println("Nombre");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				System.out.println("Apellido");
				lectura = new Scanner(System.in);
				apellido = lectura.nextLine();

				System.out.println("Edad");
				lectura = new Scanner(System.in);
				edad = lectura.nextInt();
				
				System.out.println("Estatura");
				lectura = new Scanner(System.in);
				estatura = lectura.nextFloat();

				// Guardar
				corredor = new Corredores(numeroC, nombre, apellido, edad, estatura);
				imp.guardar(corredor);
				break;

			case 2:
				System.out.println("Ingrese el numero de corredor a editar: ");
				lectura = new Scanner(System.in);
				numeroC = lectura.nextInt();
								
				try {
					corredor = new Corredores(numeroC);
					corredor = imp.buscar(corredor);
					System.out.println("Se encontro el corredor a editar: " + corredor.getNombre());
					
					do {
						System.out.println("\n 	Menu de Edita \n");
						System.out.println("1 -- Editar nombre");
						System.out.println("2 -- Editar edad");
						System.out.println("3 -- Salir");
						
						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();
						
						switch(subMenu) {
						
						case 1:
							
							System.out.println("Ingrese el Nommbre");
							lectura = new Scanner(System.in);
							nombre = lectura.nextLine();
							corredor.setNombre(nombre);
							imp.editar(corredor);
							subMenu = 3;
							break;
						
						case 2:
							
							System.out.println("Ingrese la Edad");
							lectura = new Scanner(System.in);
							edad = lectura.nextInt();
							corredor.setEdad(edad);
							imp.editar(corredor);
							subMenu = 3;
							break;
							
						case 3:
							break;
							
						}
						
					}while(subMenu < 3);
					
				} catch (Exception e) {
					System.out.println("No existe corredor con ese numero");
				}
				break;

			case 3:
				System.out.println("Ingrese el numero de corredor a eliminar: ");
				lectura = new Scanner(System.in);
				numeroC = lectura.nextInt();
				
				try {
					corredor = new Corredores(numeroC);
					corredor = imp.buscar(corredor);
					imp.eliminar(corredor);
					System.out.println("Se el corredor: " + corredor.getNombre());
				} catch (Exception e) {
					System.out.println("No existe corredor con ese numero");
				}
				
				break;

			case 4:
				System.out.println("Ingrese el numero de corredor a buscar: ");
				lectura = new Scanner(System.in);
				numeroC = lectura.nextInt();
								
				try {
					corredor = new Corredores(numeroC);
					corredor = imp.buscar(corredor);
					System.out.println("Se encontro el corredor: " + corredor.getNombre());
				} catch (Exception e) {
					System.out.println("No existe corredor con ese numero");
				}
								
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

}
