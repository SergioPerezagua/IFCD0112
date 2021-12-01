package ejercicio5;

import java.util.ArrayList;

import utilidades.Utilidades;

public class Baraja {

	private static final int TOTAL_BARAJA = 40;
	
	private ArrayList<Carta> baraja;

	public Baraja() {

		this.baraja = new ArrayList <Carta>();
		crearBaraja();
	}
	
	private void crearBaraja(){
		
		
		for (int j = 0; j < Carta.PALO_CARTA.length;j++){
			for (int k = 0;k < Carta.NUMERO_CARTA.length; k++){
				baraja.add(new Carta(Carta.NUMERO_CARTA[k],Carta.PALO_CARTA[j]));
			}
		}
	}
	public void visualizarBaraja(){
		for(int i = 0; i < baraja.size();i++){
			System.out.println(baraja.get(i).getNumero() + baraja.get(i).getPalo());
		}
	}
	
	public void barajar(){
		int posicionAleatoria;
		Carta c;
		
		for (int i = 0;i < baraja.size()-1; i++){
			posicionAleatoria = Utilidades.generarNumeroAleatorio(0, TOTAL_BARAJA-1);
			c=baraja.get(posicionAleatoria);
			baraja.set(posicionAleatoria, baraja.get(i));
			baraja.set(i, c);
		}
	}
	public Carta siguienteCarta(){
		Carta c = null;
		if(baraja.isEmpty()){
			System.out.println("NO quedan cartas");
		}else{	
		
			c = baraja.get(0);
		
		}
		return c;
	}
	public int cartasDisponibles(){
		int cantidad;
		cantidad = baraja.size();
		return cantidad;
	}
	/*public darCartas(int cantidad){
		
		Carta cartaAEntregar=null;
		for (int i=0; i<cantidad-1;i++){
			cartaAEntregar= siguienteCarta();
			baraja.remove(0);
			cartasEntregadas.add(cartaAEntregar);
		}
	}*/
	public Carta darCarta(){
		
		Carta cartaAEntregar=null;
		
		cartaAEntregar= siguienteCarta();
		baraja.remove(0);
		
		return cartaAEntregar;
		
	}
}			

