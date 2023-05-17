package ejercicios.interfac.helado;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//Declarar la coleccion de objetos
				
				Helados hel1 = new Helados("Vainilla", "Cono", "3bolitas", "galleta", 20);
				Helados hel2 = new Helados("Chocolate", "Cono", "2bolitas", "chispas", 15);
				Helados hel3 = new Helados("Limon", "Vaso", "5bolitas", "chamoy", 12);
				
				//Instanciar la clase de implementacion, aqui tenemos accesoa la funcionalidad de los metodos
				Implementar imp = new Implementar();
				
				//Guardar
				imp.guardar(hel1);
				imp.guardar(hel2);
				imp.guardar(hel3);
				
				//Mostrar
				imp.mostrar();
				
				//Buscar
				Helados helado = null;
				helado = imp.buscar(0);
				System.out.println("Helado de: " + helado.getSabor());
				
				//Editar
				helado = imp.buscar(1);
				System.out.println("Helado de: " + helado.getSabor());
				helado.setSabor("Oreo");
				imp.editar(1, helado);
				
				imp.mostrar();
				
				//Eliminar
				imp.eliminar(2);
				
				imp.mostrar();
				
				//Contar
				
				imp.contar();
		
	}

}
