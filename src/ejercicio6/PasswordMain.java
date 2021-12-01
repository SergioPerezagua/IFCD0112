package ejercicio6;

import utilidades.Utilidades;

public class PasswordMain {

	private static final int MINIMA_LONGITUD_PASSWORD = 8;
	private static final int MAXIMA_LONGITUD_PASSWORD = 20;
	public static void main(String[] args) {
		int dimension = Utilidades.introducirNumeroConTexto("Introduce un tamaño de array, por favor: ");
		
		Password[] pwArray = new Password[dimension];
		boolean[] fortalezaArray = new boolean [dimension];
		
		for(int i = 0; i <= pwArray.length-1;i++){
			pwArray[i] = new Password(Utilidades.generarNumeroAleatorio(MINIMA_LONGITUD_PASSWORD, MAXIMA_LONGITUD_PASSWORD));
			fortalezaArray[i] = pwArray[i].esFuerte();
		}
		for (int i = 0; i<=pwArray.length-1;i++){
			System.out.println(pwArray[i].getLongitud() + " - " + pwArray[i].getContrasenia() + " - " + fortalezaArray[i]);
		}
	}

}
