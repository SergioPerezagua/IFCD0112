package ejercicio5;

import java.util.ArrayList;

import utilidades.Utilidades;

public class MainBaraja {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		ArrayList <Carta> barajaCartasEntregadas = new ArrayList <Carta>();
		int cantidad = 0;
		
		baraja.visualizarBaraja();
		System.out.println("--------BARAJAMOS---------");
		baraja.barajar();
		baraja.visualizarBaraja();
		System.out.println("---------EMPEZAMOS A REPARTIR--------");
		baraja.siguienteCarta();
	
		do{
			cantidad = Utilidades.generarNumeroAleatorio(1, 5);
			
			if (baraja.cartasDisponibles() >= cantidad){
				for(int i = 0; i < cantidad;i++){
					barajaCartasEntregadas.add(baraja.darCarta());
				}
				System.out.println(barajaCartasEntregadas);
			}else{
				System.out.println("No quedan tantas cartas");
			}
		}while(barajaCartasEntregadas.size() < 40);	
	}

}
