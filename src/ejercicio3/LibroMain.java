package ejercicio3;

import java.util.Scanner;

public class LibroMain {
	String titulo, autor;
	static Scanner sc = new Scanner(System.in);
	
	private static String teclearDatos(){
		String texto;
		texto=sc.nextLine();
		return texto;
	}
	
	public static void compararPaginas(Libro libro_1, Libro libro_2){
	
		if (libro_1.getNumeroPaginas() > libro_2.getNumeroPaginas()){
			System.out.println("El libro 1 tiene mas paginas que el libro 2");
		}else{
			System.out.println("El libro 2 tiene mas paginas que el libro 1");
		
		}
	}
	
	public static void main(String[] args) {
		String titulo, autor;
		
		System.out.println("introduce el titulo: ");
		titulo = teclearDatos();
		
		System.out.println("introduce el autor: ");
		autor = teclearDatos();
		
		Libro libro_1 = new Libro(titulo, autor);
		
		System.out.println("introduce el titulo: ");
		titulo = teclearDatos();
		
		System.out.println("introduce el autor: ");
		autor = teclearDatos();
		Libro libro_2 = new Libro(titulo, autor);
		
		System.out.println(libro_1.tostring());
		System.out.println(libro_2.tostring());
		
		compararPaginas(libro_1, libro_2);
			
	}

}
