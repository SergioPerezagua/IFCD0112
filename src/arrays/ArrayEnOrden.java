package arrays;

public class ArrayEnOrden {

	private static final int MINIMO = 1;
	private static final int MAXIMO = 15;
	private static final int MAXIMO_ALEATORIO = (int) Math.round(MINIMO + Math.random() * (MAXIMO - MINIMO));
	
	public static void main(String[] args) {
		
		
		int[] arrayNum = new int[MAXIMO_ALEATORIO];
		
		for (int i = 0 ;i < MAXIMO_ALEATORIO;i++){
			arrayNum[i]=(int) Math.round(MINIMO + Math.random() * (MAXIMO - MINIMO));
			System.out.println("posicion " + i + "--> " + arrayNum[i]);
			
		}
		System.out.println();
		
		int aux;
		
		for (int i = 0;i < MAXIMO_ALEATORIO; i++){
			for (int j = i + 1;j < MAXIMO_ALEATORIO; j++)
			
				if (arrayNum[i] > arrayNum[j]){
						aux = arrayNum[j];
						arrayNum[j] = arrayNum[i];
						arrayNum[i] = aux;
						
		}
			System.out.println("posicion " +  i + " --> " + arrayNum[i]);
	}
		
}
}


