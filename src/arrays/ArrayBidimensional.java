package arrays;

public class ArrayBidimensional {
	
	private static int MINIMO = 1;
	private static int MAXIMO = 100;
	private static int MINIMO1 = 2;
	private static int MAXIMO1 = 10;
	private static int MAXIMO_ALEATORIO = (int) Math.round(MINIMO1 + Math.random() * (MAXIMO1 - MINIMO1));
	private static int MAXIMO_ALEATORIO1 = (int) Math.round(MINIMO1 + Math.random() * (MAXIMO1 - MINIMO1));
	private static int MAXIMO_ALEATORIO2 = (int) Math.round(MINIMO1 + Math.random() * (MAXIMO1 - MINIMO1));
	
	public static void main(String[] args) {
		
		int[][][] arrayNum= new int [MAXIMO_ALEATORIO][MAXIMO_ALEATORIO1][MAXIMO_ALEATORIO2];
		
		System.out.println("Tamaño dimension 1 --> " + MAXIMO_ALEATORIO);
		System.out.println("Tamaño dimension 2 --> " + MAXIMO_ALEATORIO1);
		System.out.println("Tamaño dimension 3 --> " + MAXIMO_ALEATORIO2);
		System.out.println();
		
		for (int i = 0;i <arrayNum.length; i++){
			
			for(int j = 0; j<arrayNum[i].length;j++){
				
				for(int k = 0;k<arrayNum[i][j].length;k++){
				arrayNum[i][j][k]=(int) Math.round(MINIMO + Math.random() * (MAXIMO - MINIMO));
				
					if (arrayNum[i][j][k]<10){	
					System.out.print("00" + arrayNum[i][j][k] + " ");
					}
					
					else if (arrayNum[i][j][k]<100){
						System.out.print("0" + arrayNum[i][j][k] + " ");
					
					}else{
						System.out.print(arrayNum[i][j][k] + " ");
						}
					}
				System.out.println();}
			
			System.out.println();}
		
		System.out.println();}
	
}