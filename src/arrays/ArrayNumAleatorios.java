package arrays;

import utilidades.Utilidades;

public class ArrayNumAleatorios {

	private static final int MINIMO = 1;
	private static final int MAXIMO = 100;
	private static final int MAXIMO_ALEATORIO = (int) Math.round(MINIMO + Math.random() * (MAXIMO - MINIMO));
	
	public static void main(String[] args) {
		
	int[] arrayNum = new int[MAXIMO_ALEATORIO];
		for (int i = 0;i < MAXIMO_ALEATORIO;i++){
		arrayNum[i]=(int) Math.round(MINIMO + Math.random() * (MAXIMO - MINIMO));
		System.out.println("posicion " +  i + "--> " + arrayNum[i]);
		}
	
		
	}

}
