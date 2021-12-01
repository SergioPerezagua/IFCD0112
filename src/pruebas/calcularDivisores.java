package pruebas;

import java.util.Scanner;

public class calcularDivisores {

	public static int teclearNumero()
	{
			int num;
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca un numero, por favor: ");
			num = sc.nextInt();
			sc.close();
			return num;
	}
	
	public static void calcularDivisoresDeN(int n)
	{
		for (int i = 1 ; i <= n ; i++)
		{
				if (n % i == 0)
			{
				visualizarDivisor(i);
			}
		}
	}
	
	public static void visualizarDivisor(int x)
		{
			System.out.print(x + " ");
		}
	
	public static void main(String[] args) 
		{
			int numero;
			numero = teclearNumero();
			calcularDivisoresDeN(numero);
		}
		
}


