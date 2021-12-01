package pruebas;

import java.util.Scanner;

public class PrimosEntre1_Y_n {

	public static int teclearNumero(){
		
		System.out.print("Teclee un numero para comprobar: ");
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
			System.out.print(numero + " ");
		}
		
	}
		return contador;
	} 
	
	public static void main(String[] args) {
	

	}

}
