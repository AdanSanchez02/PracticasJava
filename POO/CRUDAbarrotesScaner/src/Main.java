import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Declarar variables
		long codigoB;
		String clave;
		String nombreP;
		float precio;
		int cantidad;
		String unidadMedida;

		// Reserva de espacio de memoria
		Productos producto = null;

		// Es una libreria -- es un conjunto de clases desarrollado por alguien para que
		// nuestra apliccion funcione correctamente
		Scanner lectura = null;

		// Declaramsos la lista
		List<Productos> listProduct = new ArrayList<Productos>();
		int menuP, indice, submenu;

		do {
			System.out.println("Menu de Opciones");
			System.out.println("1 -- Agregar Producto");
			System.out.println("2 -- Buscar Producto");
			System.out.println("3 -- Editar Producto");
			System.out.println("4 -- Elimina Producto");
			System.out.println("5 -- Contar Producto");
			System.out.println("6 -- Mostrar Productos");
			
			
			System.out.println("7 -- Buscar por nombre el producto");
			System.out.println("8 -- Eliminar por nombre el producto");
			System.out.println("9 -- Vaciar");
			
			
			System.out.println("10 -- Salir");

			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();

			switch (menuP) {
			case 1:
				System.out.println("Ingrese el codigo de barra");
				lectura = new Scanner(System.in);
				codigoB = lectura.nextLong();

				System.out.println("Ingrese la clave");
				lectura = new Scanner(System.in);
				clave = lectura.nextLine();

				System.out.println("Ingrese el nombre del producto");
				lectura = new Scanner(System.in);
				nombreP = lectura.nextLine();

				System.out.println("Ingrese el precio");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();

				System.out.println("Ingrese la cantidad del producto");
				lectura = new Scanner(System.in);
				cantidad = lectura.nextInt();

				System.out.println("Ingrese la unidad de medida");
				lectura = new Scanner(System.in);
				unidadMedida = lectura.nextLine();

				// Guardar el objeto
				producto = new Productos(codigoB, clave, nombreP, precio, cantidad, unidadMedida);
				listProduct.add(producto);
				System.out.println(listProduct);
				break;

			case 2:
				System.out.println("Indice y nombre del producto a buscar");
				for (int i = 0; i < listProduct.size(); i++) {
					System.out.printf("\n [%d] " + listProduct.get(i).getNombreP(), i);
				}

				System.out.println("\nIngrese el indice del producto a buscar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				producto = listProduct.get(indice);
				System.out.println("Se encontro el producto" + producto);
				break;

			case 3:

				System.out.println("Indice y nombre del producto a buscar");
				for (int i = 0; i < listProduct.size(); i++) {
					System.out.printf("\n [%d] " + listProduct.get(i).getNombreP(), i);
				}

				System.out.println("\nIngrese el indice del producto a buscar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				producto = listProduct.get(indice);
				System.out.println("Se encontro el producto" + producto);

				do {
					System.out.println("Submenu de productos");
					System.out.println("1 -- Editar nombre del producto");
					System.out.println("2 -- Editar el precio del producto");
					System.out.println("3 -- Menu principal");

					lectura = new Scanner(System.in);
					submenu = lectura.nextInt();

					switch (submenu) {
					case 1:
						System.out.println("Ingrese el nuevo nombre");
						lectura = new Scanner(System.in);
						nombreP = lectura.nextLine();
						producto.setNombreP(nombreP);
						listProduct.set(indice, producto);
						System.out.println("Se edito correctamente");
						break;

					case 2:
						System.out.println("Ingrese el nuevo precio");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();
						producto.setPrecio(precio);
						listProduct.set(indice, producto);
						System.out.println("Se edito correctamente");
						break;

					case 3:
						break;
					}

				} while (submenu < 3);
				break;

			case 4:
				System.out.println("Indice y nombre del producto a eliminar");
				for (int i = 0; i < listProduct.size(); i++) {
					System.out.printf("\n [%d] " + listProduct.get(i).getNombreP(), i);
				}

				System.out.println("\nIngrese el indice del producto a eliminar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				listProduct.remove(indice);
				System.out.println("Se ha eliminado el indice " + indice + " correctamente");
				break;

			case 5:
				System.out.println("Productos en existencia" + listProduct.size());
				break;

			case 6:
				System.out.println(listProduct);
				break;

			case 7: // Buscar por nombre
				System.out.println("Nombre del producto a buscar");
				for (int i = 0; i < listProduct.size(); i++) {
					System.out.printf("\n [%d] " + listProduct.get(i).getNombreP(), i);
				}

				System.out.println("\nIngrese el nombre del producto a buscar");
				String name;
				lectura = new Scanner(System.in);
				name = lectura.nextLine();
				
				for(Productos p: listProduct) {
					if (p.getNombreP().equals(name)) {
						
						System.out.println("Se encontro: " + p);
					}
				}
				
				break;
				
			case 8: // Eliminar por nombre
				System.out.println("Productos existentes");
				for (int i = 0; i < listProduct.size(); i++) {
					System.out.printf("\n [%d] " + listProduct.get(i).getNombreP(), i);
				}

				System.out.println("\nIngrese el nombre del producto a eliminar");
				String aux="";
				lectura = new Scanner(System.in);
				aux = lectura.nextLine();
				
				for(int n=0; n < listProduct.size(); n++) {
					if (listProduct.get(n).getNombreP().equals(aux)) {
						listProduct.remove(n);
						System.out.println("Se elimino: " + aux);
					}
				}

				break;
				
			case 9: // Vaciar toda la lista
				System.out.println("Desea Eliminar todos los productos");
				System.out.println("1 -- si, 2 -- regresar al menu principal");
				int vc;
				lectura = new Scanner(System.in);
				vc = lectura.nextInt();
				if(vc == 1) {
					listProduct.clear();
					System.out.println("Se han eliminado los datos correctamente");
				}
				
				break;
				
			case 10:
				break;
			}

		} while (menuP < 10);
	}
}
