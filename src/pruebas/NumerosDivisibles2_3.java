package pruebas;

public class NumerosDivisibles2_3 {
	
	public static void main(String[] args) {
		
		int num = 1;
		
		while (num <= 100){
		
			if ((num %2 ==0) && (num %3 == 0)){
				
			System.out.print(num + " ");
			}
			num++;
		}

	}

}
