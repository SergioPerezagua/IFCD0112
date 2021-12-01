package pruebas;

public class ContarNumerosWhile {
	
	public static void main (String[] args){
		
		int minimo = 0;
		int maximo = 100;
		int aleatorio;
		
		aleatorio = (int) Math.round(minimo + Math.random() * (maximo-minimo));
		int i = aleatorio;
		while (i>=0)
		{
			System.out.print(i+" ");
			i--;
		}
	}

}
