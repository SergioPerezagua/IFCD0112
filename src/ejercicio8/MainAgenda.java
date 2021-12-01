package ejercicio8;

import java.util.Scanner;

import utilidades.Utilidades;

public class MainAgenda {

	private static final int MINIMO_CONTACTO = 3;
	private static final int MAXIMO_CONTACTO = 10;
	
	public static void main(String[] args) {
		
		int opcion;
		boolean salir = false;
		
		Scanner sc = new Scanner(System.in);
		
		Agenda agendaTelefonica =  new Agenda(Utilidades.generarNumeroAleatorio(MINIMO_CONTACTO, MAXIMO_CONTACTO));
		
		Contacto c;
		String nombre;
		int telefono;
		
		do{
		System.out.println("1. - Añadir Contacto");
		System.out.println("2. - Listar todos los contactos");
		System.out.println("3. - Buscar un contacto");
		System.out.println("4. - Existe contacto");
		System.out.println("5. - Eliminar un concacto");
		System.out.println("6. - Huecos disponibles para mas contactos");
		System.out.println("7. - agenda llena?");
		System.out.println("8- SALIR");
		System.out.println();
		System.out.println("escriba una de las opciones");
		
		opcion = sc.nextInt();
		
		switch(opcion){
		case 1:
			
			nombre = Utilidades.introducirTexto("Escribe un nombre");
			System.out.println("Escribe un telefono:" );
			telefono = Utilidades.introducirNumeroConTexto("Escribe un telefono");
			c = new Contacto(nombre,telefono);
			agendaTelefonica.aniadirContacto(c);
			break;
		case 2:
			agendaTelefonica.listarContactos();
			break;
		case 3:
			nombre = Utilidades.introducirTexto("Escribe un nombre");
			agendaTelefonica.buscaContacto(nombre);
			break;
		case 4:
			nombre = Utilidades.introducirTexto("Escribe un nombre");
			c = new Contacto(nombre,0);
			if(agendaTelefonica.existeContacto(c)){
				System.out.println("El contacto EXISTE");
			}else{
				System.out.println("El contacto NO EXISTE");
			}
			break;
		case 5:
			nombre = Utilidades.introducirTexto("Escribe un nombre");
			c = new Contacto(nombre,0);
			agendaTelefonica.eliminarContacto(c);
			break;
		case 6:
			System.out.println("Hay "+agendaTelefonica.huecosLibres()+" huecos libres");
			break;
		case 7:
			if (agendaTelefonica.agendaLlena()){
				System.out.println("Agenda llena");
			}else{
				System.out.println("Agenda no esta llena");
			}
			break;
		case 8:
			System.out.println("se cerrara la aplicacion");
			salir = true;
			
		}
		
		
	}while (!salir);
		sc.close();
	}
}
