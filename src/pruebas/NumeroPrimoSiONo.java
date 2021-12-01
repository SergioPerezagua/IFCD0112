package pruebas;

import java.util.Scanner;

public class NumeroPrimoSiONo 
{
	public static int teclearTexto()
	{
		int text;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el numero a verificar mayor que 0 : ");
		text = sc.nextInt();
		System.out.println();
		sc.close();
		return text;
	}
	
	public static String esPrimoONoEsPrimo(int t)
	{
		String text = "";
		int contador = 0;

		for (int i = 1 ; i <= t ; i++ )
		{
			if (t%i==0)
			{
				contador++;}
			}
		
			if (contador!=2)
			{
				text="no es primo";
			} 
			else 
			{
				text="es primo";
			}
		
		return text;
	}
		
	public static void main(String[] args)
	{
		int numero;
		String Texto = "";
		numero = teclearTexto();
		Texto = esPrimoONoEsPrimo(numero);
		System.out.println("El numero "+numero+" "+Texto);
	}
}
