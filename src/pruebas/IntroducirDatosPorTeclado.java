package pruebas;

import java.util.Scanner;

public class IntroducirDatosPorTeclado {

	 static Scanner sc = new Scanner(System.in);
	
	public static int teclearNumerosSinDecimales() {
	
		System.out.print("teclee un numero SIN decimales, por favor:");
	
		int numeroSD = sc.nextInt();
	
		return numeroSD;
	
	}
	
	public static double teclearNumerosConDecimales() {
		
		System.out.print("teclee un numero CON decimales:");
		
		double numeroCD = sc.nextDouble();
		
		return numeroCD;
	}
	
	public static String teclearPalabra() {
		
		System.out.print("teclee una palabra:");
		
		String palabra = sc.nextLine();
		
		return palabra;
	}

	public static void main(String[] args) {
		
		int numeroSinDecimales;
		double numeroConDecimales;
		String cadenaDeCaracteres;
		
		numeroSinDecimales = teclearNumerosSinDecimales();
		
		System.out.println("hemos tecleado --> " + numeroSinDecimales);
		
		numeroConDecimales = teclearNumerosConDecimales();
		
		System.out.println("hemos tecleado --> " + numeroConDecimales);
		
		cadenaDeCaracteres = teclearPalabra();
		
		System.out.println("hemos tecleado --> " + cadenaDeCaracteres);
		
		sc.close();
	}

}
