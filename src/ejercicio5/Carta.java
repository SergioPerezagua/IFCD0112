package ejercicio5;

import java.util.Arrays;

public class Carta {
	public static final int[] NUMERO_CARTA = new int[]{1,2,3,4,5,6,7,10,11,12};
	public static final String[] PALO_CARTA = new String[]{"Espadas","bastos","oros","copas"};
	
	private int numero;
	private String palo;
	
	public Carta(int numero,String palo){
		this.numero = numero;
		this.palo = palo;
	}

	

	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getPalo() {
		return palo;
	}



	public void setPalo(String palo) {
		this.palo = palo;
	}



	public static int[] getNumeroCarta() {
		return NUMERO_CARTA;
	}



	public static String[] getPaloCarta() {
		return PALO_CARTA;
	}



	@Override
	public String toString() {
		
		return "[" + numero + " de " + palo + "]";
	}

}
