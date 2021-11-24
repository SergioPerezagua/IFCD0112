package utilidades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Utilidades {
	
	static String [] nombres = {"Antonio", "Andrea","Andres","Oscar","Ricardo","Sergio","Julio","Luiz","Elizabeth"};
	static String [] apellidos = {"Perezagua","Valor","Garcia","Fernandez","Gavilanez","Fernando","Dominguez"};
	static char[] sexo = {'H','M'};
	
/**
 * 
 * @param minimo
 * @param maximo
 * @return
 */
	public static int generarNumeroAleatorio(int minimo, int maximo){
		return (int) Math.round(minimo + Math.random() * (maximo - minimo));
	}
	
	/**
	 * 
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static double generarNumeroAleatorioDecimal(double minimo, double maximo){
		return (minimo + Math.random() * (maximo - minimo));
	}
	
	/**
	 * Metodo que genera un numero aleatorio con una cantidad de decimales indicadas por parametro entre 1 y 4.
	 * @param minimo Valor minimo para la generacion del aleatorio.
	 * @param maximo Valor maximo para la generacion del aleatorio.
	 * @param cantidadDecimales Valor que indica la cantidad de decimales que deseamos en el aleatorio.
	 * @return Numero aleatorio con los decimales indicados.
	 */
	  
	 public static double generarNumeroAleatorioConNDecimales(double minimo, double maximo, int cantidadDecimales){

	  double resultado = 0.0;


	  resultado = generarNumeroAleatorioDecimal(minimo,maximo);

	  switch (cantidadDecimales) {
	  case 1:
	   DecimalFormat formateador1D = new DecimalFormat("#.#");
	   resultado = Double.parseDouble(formateador1D.format(resultado).replace(',', '.'));
	   break;
	  case 2:
	   DecimalFormat formateador2D = new DecimalFormat("#.##");
	   resultado = Double.parseDouble(formateador2D.format(resultado).replace(',', '.'));
	   break;
	  case 3:
	   DecimalFormat formateador3D = new DecimalFormat("#.###");
	   resultado = Double.parseDouble(formateador3D.format(resultado).replace(',', '.'));
	   break;
	  case 4:
	   DecimalFormat formateador4D = new DecimalFormat("#.####");
	   resultado = Double.parseDouble(formateador4D.format(resultado).replace(',', '.'));
	   break;
	   default:
		   DecimalFormat formateadorDefault = new DecimalFormat("#.##");
		   resultado = Double.parseDouble(formateadorDefault.format(resultado).replace(',', '.'));
	  }
	  return resultado;
	 }
	 
	/**
	 * 
	 * @return
	 */
	public static String introducirTexto(){
		Scanner sc=new Scanner(System.in);
		String texto = sc.nextLine();
		//sc.close();
		return texto;
	}
/**
 * 
 * @param texto
 * @return
 */
	public static String introducirTexto(String texto){
		System.out.print(texto);
		Scanner sc=new Scanner(System.in);
		String cadena = sc.nextLine();
		//sc.close();
		return cadena;
	}
	/**
	 * 
	 * @return
	 */
	public static int introducirNumero(){
		Scanner sc=new Scanner(System.in);
		int numero = sc.nextInt();
		//sc.close();
		return numero;
	}
	/**
	 * 
	 * @param num
	 * @return
	 */
	public static  int introducirNumeroConTexto(String texto){
		System.out.print(texto);
		Scanner sc=new Scanner(System.in);
		int numero = sc.nextInt();
		//sc.close();
		return numero;
	}
	/**
	 * 
	 * @return
	 */
	public static double introducirNumeroDecimal(){
		Scanner sc=new Scanner(System.in);
		double numero = sc.nextDouble();
		//sc.close();
		return numero;
	}
	/**
	 * 
	 * @param num
	 * @return
	 */
	public static double introducirNumeroDecimal(double num){
		System.out.print(num);
		Scanner sc=new Scanner(System.in);
		double numero = sc.nextDouble();
		//sc.close();
		return numero;
	}
	/**
	 * 
	 * @return
	 */
	public static String nombreAleatorio(){
		return nombres[generarNumeroAleatorio(0,nombres.length - 1)];
	}
	/**
	 * 
	 * @return
	 */
	public static String apellidoAleatorio(){
		return apellidos[generarNumeroAleatorio(0,apellidos.length - 1)];
	}
	public static char sexoAleatorio(){
		char sexo ='h';
		int ale = Utilidades.generarNumeroAleatorio(1, 2);
		switch(ale){
		case 1:
			sexo = 'H';
			break;
		case 2:
			sexo = 'M';
		}
		return sexo;
	}
}
