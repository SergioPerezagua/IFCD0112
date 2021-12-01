package pruebas;

public class NumeroAleatorioComprobar {

	public static void main(String[] args) {
	
		int aleatorio;
		int minimo=0;
		int maximo=100;
		
		
		aleatorio = (int) Math.round(minimo + Math.random() * (maximo - minimo));
	
		
		if (aleatorio %2 == 0)
		{
			System.out.println(aleatorio + " es par");
		}
		else
		{
			System.out.println(aleatorio + " es impar");
		}	
	}

}
