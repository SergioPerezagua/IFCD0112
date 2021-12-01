package ejercicioAgroalimentario;

public class TestHerencia_Main {

	public static void main(String[] args) {
	P_Frescos fresco1 = new P_Frescos ("2021/10/10",1, "2021/20/02","españa");
	P_Frescos fresco2= new P_Frescos("2021/10/10", 2, "2021/20/02", "Andorra");
	
	P_Refrigerados refrigerado1= new P_Refrigerados("2021/10/10",3,"2021/20/02","Italia",2, "AAA");
	P_Refrigerados refrigerado2= new P_Refrigerados("2021/10/10",4,"2021/20/02","Francia",3, "BBB");
	P_Refrigerados refrigerado3= new P_Refrigerados("2021/10/10",5,"2021/20/02","Inglaterra",4, "CCC");
	
	 P_C_Aire congeladoAire1 = new P_C_Aire("2021/10/10", 1, "2021/20/02", "España", 1.1, 1, 2, 3, 4);
	  P_C_Aire congeladoAire2 = new P_C_Aire("2021/10/10", 1, "2021/20/02", "España", 2.2, 5, 6, 7, 8);

	  P_C_Agua congeladoAgua1 = new P_C_Agua("2021/10/10", 1, "2021/20/02", "España", 3.3, 5);
	  P_C_Agua congeladoAgua2 = new P_C_Agua("2021/10/10", 1, "2021/20/02", "España", 4.4, 6);

	  P_C_Nitrogeno congeladoNitrogeno1 = new P_C_Nitrogeno("2021/10/10", 1, "2021/20/02", "España", 5.5, "DDD", 123);

	  System.out.println("Fresco 1 --> " + fresco1.toString());
	  System.out.println();
	  System.out.println("Fresco 2 --> " + fresco2.toString());
	  System.out.println();
	  System.out.println("Refrigerado 1 --> " + refrigerado1.toString());
	  System.out.println();
	  System.out.println("Refrigerado 2 --> " + refrigerado2.toString());
	  System.out.println();
	  System.out.println("Refrigerado 3 --> " + refrigerado3.toString());
	  System.out.println();
	  System.out.println("Aire 1 --> " + congeladoAire1.toString());
	  System.out.println();
	  System.out.println("Aire 2 --> " + congeladoAire2.toString());
	  System.out.println();
	  System.out.println("Agua 1 --> " + congeladoAgua1.toString());
	  System.out.println();
	  System.out.println("Agua 2 --> " + congeladoAgua2.toString());
	  System.out.println();
	  System.out.println("Nitrogeno 1 --> " + congeladoNitrogeno1.toString());
	}

}
