package ejercicio2;
import java.util.Scanner;
public class personaMain {

	private static String nombre;
	private static int edad;
	private static String dni;
	private static char sexo;
	private static double peso;
	private static double altura;
	
	
	public static String teclearTexto_2(){
		
		String text = "done";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el nombre : ");
		nombre = sc.nextLine();
		System.out.print("Introduzca la edad : ");
		edad = sc.nextInt();
		System.out.print("Introduzca el sexo : ");
		sexo =sc.next().charAt(0);
		
		System.out.println();
		
		
		return text;
	}
	public static String teclearTexto(){
		
		String text = "done";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el nombre : ");
		nombre = sc.nextLine();
		System.out.print("Introduzca la edad : ");
		edad = sc.nextInt();
		System.out.print("Introduzca el sexo : ");
		sexo =sc.next().charAt(0);
		System.out.print("Introduzca el peso : ");
		peso = sc.nextDouble();
		System.out.print("Introduzca la altura : ");
		altura = sc.nextDouble();
		
		System.out.println();
		
		
		return text;
	}
	
	public static String comprobarIMC(int n){
	String texto ="";

	if (n == -1){
		texto = "delgado: el peso esta por debajo de lo normal.";	
	}
	else if (n == 0){
		texto = "normal: el peso esta dentro de la normalidad.";
	}else if(n == 1){
		texto = "sobrepeso: el peso esta por encima de lo normal.";
	}else if (n==2){
		texto = "Sin datos de peso y/o altura, no se puede calcular el IMC.";
	}
	return texto;
	}
	
	public static String comprobarEdad(boolean mayorDeEdad){
		String texto ="";
		
		if (mayorDeEdad == true){
			texto = "es mayor de edad";
		}else if (mayorDeEdad == false){
			texto = "es menor de edad.";}
		return texto;
	}
	public static void main(String[] args) {
		
		String texto;
		
		texto = teclearTexto();
		Persona persona_1 = new Persona(nombre,edad,sexo,peso,altura);
		
		texto = teclearTexto_2();
		Persona persona_2 = new Persona(nombre,edad,sexo);
		Persona persona_3 = new Persona();
		
		System.out.println(comprobarIMC(persona_1.calcularIMC(persona_1.getPeso(),persona_1.getAltura())));
		System.out.println(comprobarEdad(persona_1.esMayorDeEdad(persona_1.getEdad())));
		System.out.println();
		System.out.println(persona_1);
		System.out.println(comprobarIMC(persona_2.calcularIMC(persona_2.getPeso(),persona_2.getAltura())));
		System.out.println(comprobarEdad(persona_2.esMayorDeEdad(persona_2.getEdad())));
		System.out.println();
		System.out.println(persona_2);
		System.out.println(comprobarIMC(persona_3.calcularIMC(persona_3.getPeso(),persona_3.getAltura())));
		System.out.println(comprobarEdad(persona_3.esMayorDeEdad(persona_3.getEdad())));
		System.out.println();
		System.out.println(persona_3);
	}

}
