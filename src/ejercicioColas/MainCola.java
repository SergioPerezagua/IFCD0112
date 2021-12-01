package ejercicioColas;

import utilidades.Utilidades;

public class MainCola {

	public static void main(String[] args) {
		
		int opcion;
		int numero = 1;
		ColaCine colacine = new ColaCine();
		
		for (int i = 1; i<= Utilidades.generarNumeroAleatorio(20, 40);i++){
			opcion = Utilidades.generarNumeroAleatorio(1, 2);
			
			switch (opcion){
			case 1:
				colacine.push(numero);
				numero++;
				System.out.println(colacine);
				break;
			case 2:
				if (!colacine.isEmpty())
				colacine.pop();
				System.out.println(colacine);
				break;
			}
			System.out.println(colacine);
		}
		/*colacine.push(1);
		colacine.push(2);
		colacine.push(3);
		colacine.push(4);
		colacine.push(5);
		System.out.println(colacine)
		colacine.pop();
		System.out.println(colacine);*/
	}
}


	


