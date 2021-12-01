package pruebas;

public class ContarNumerosDo {
	public static void main (String[] args){
		int minimo = 0;
		int maximo = 100;
		int aleatorio;
		
		aleatorio = (int) Math.round(minimo + Math.random() * (maximo-minimo));
		int i = aleatorio;
		
		do
		{
			System.out.print(i+" ");
			i--;	
		} while (i>=0);
	}

}
