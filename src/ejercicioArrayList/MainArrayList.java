package ejercicioArrayList;

import java.util.ArrayList;

import utilidades.Utilidades;

public class MainArrayList {

	private static ArrayList<Integer> rellenarArrayList (ArrayList<Integer> lista){
		for (int i = 0;i <= Utilidades.generarNumeroAleatorio(20,40);i++){
			lista.add(Utilidades.generarNumeroAleatorio(1, 200));
		}
		return lista;
	}
	
	private static void visualizarArrayList(ArrayList<Integer> lista){
		for (int i = 0; i<=lista.size()-1 ; i++){
			System.out.print(lista.get(i) + " ");
		}
	}
	
	private static boolean esta(int numero , ArrayList<Integer> lista){
		boolean encontrado = false;
		for (int i = 0; i<=lista.size()-1 ; i++){
			if (numero == lista.get(i)){
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	private static void ordenarArrayList(ArrayList<Integer> lista){
		
		int aux;
		
		for (int i = 0;i < lista.size()-1; i++){
			for (int j = i + 1;j < lista.size(); j++){
				if (lista.get(i)>lista.get(j)){
					aux = lista.get(j);
					lista.set(j,lista.get(i));
					lista.set(i, aux);
				}
			}	
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		listaNumeros = rellenarArrayList(listaNumeros);
	
		visualizarArrayList(listaNumeros);
		System.out.println();
		
		int numeroABuscar = Utilidades.introducirNumeroConTexto("Introduce un numero para buscarlo en la lista: ");
		
		if (esta(numeroABuscar , listaNumeros)){
			System.out.println("El numero " + numeroABuscar + " esta en la lista, en la posicion " + (listaNumeros.indexOf(numeroABuscar)+1) + ".");
		}else{
			System.out.println("El numero " + numeroABuscar + " no esta en la lista.");
		}
		
		ordenarArrayList(listaNumeros);
		visualizarArrayList(listaNumeros);
	}
	
}
