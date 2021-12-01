package pruebas;

import java.util.Scanner;

public class ComprobarNumerosPrimos {

	public static int introducirNumero(){
	
		System.out.print("Introduzca un numero, por favor: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		sc.close();
		return numero;
	}
	
	public static int comprobarPrimo(int numero){
	
		int contador = 0;
	
		
	for (int i= 2;i<numero;i++){
		
		if (numero % 1 == 0){
			contador++;		
		}
		
	}
		return contador;
	}
	
	public static void main(String[] args) {
		int contador = 0;
		contador = comprobarPrimo(contador);
		int num = introducirNumero();
	
	if (contador >0)
		{
			System.out.print(num + " no es primo.");
		}
		else
		{
		System.out.print(num + " es primo.");
		}
	}
		
}

