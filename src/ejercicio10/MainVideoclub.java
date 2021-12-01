package ejercicio10;

import utilidades.Utilidades;

public class MainVideoclub {

	public static final int MAX_ARRAY = 5;
	
	public static void main(String[] args) {
		
		Serie[] listaSeries = new Serie[MAX_ARRAY];
		Videojuego[] listaVideojuegos = new Videojuego[MAX_ARRAY];
			
		listaSeries[0] = new Serie();
		listaSeries[1] = new Serie("juego de tronos","George R. Martin");
		listaSeries[2] = new Serie("Los Simpsons",30,"Realidad","Matt Groening");
		listaSeries[3] = new Serie("La casa de papel",6,"ciencia ficcion", "Alex Pina");
		listaSeries[4] = new Serie("El juego del calamar",1,"ciencia ficcion","Corea");
		
		listaVideojuegos[0] = new Videojuego();
		listaVideojuegos[1] = new Videojuego("Fortnite", 35);
		listaVideojuegos[2] = new Videojuego("God Of War",30,"Action RPG", "SantaMonica Studios");
		listaVideojuegos[3] = new Videojuego("Dark Souls",50,"Action RPG", "FromSoftware");
		listaVideojuegos[4] = new Videojuego("Ajedrez",2500,"Belico","Anonimo");
		
		for (int i = 0; i<MAX_ARRAY;i++){
			int ale= Utilidades.generarNumeroAleatorio(0, 1);
			
			if(ale==0){
				listaSeries[i].entregar();
			}
			ale= Utilidades.generarNumeroAleatorio(0, 1);
			
			if(ale==0){
				listaVideojuegos[i].entregar();
			}
		}
		int seriesEntregadas=0;
		int videojuegosEntregados=0;
		
		for(int i = 0; i <MAX_ARRAY;i++){
			System.out.println(i+"--> "+listaSeries[i]);
			System.out.println();
			if(listaSeries[i].isEntregado()){
				seriesEntregadas++;
				listaSeries[i].devolver();
				System.out.println("Se ha entregado "+listaSeries[i].toString());
			}
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		for(int i = 0; i <MAX_ARRAY;i++){
			System.out.println(i+"--> "+listaVideojuegos[i]);
			System.out.println();
			if(listaVideojuegos[i].isEntregado()){
				videojuegosEntregados++;
				listaVideojuegos[i].devolver();
				System.out.println("Se ha entregado "+listaVideojuegos[i].toString());
			}	
		}
		System.out.println("Se han entregado "+seriesEntregadas+" series.");
		System.out.println("Se han entregado "+videojuegosEntregados+" videojuegos.");
		
		Serie serieMayor = listaSeries[0];
		for(int i = 1; i<MAX_ARRAY;i++){
			if (listaSeries[i].compareTo(serieMayor)==1){
				serieMayor=listaSeries[i];
			}
		}
		Videojuego videojuegoMayor = listaVideojuegos[0];
		for(int i = 1; i<MAX_ARRAY;i++){
			if (listaVideojuegos[i].compareTo(videojuegoMayor)==1){
				videojuegoMayor=listaVideojuegos[i];
			}
		}
		System.out.println(serieMayor);
		System.out.println(videojuegoMayor);
	}

}
