package pruebas;

public class CorrespondenciaNotasSwitch {
	public static void main(String[] args) {
		int nota;
		int maximo = 10;
		int minimo = 0;
		
		nota = (int) Math.round(minimo + Math.random() * (maximo - minimo));
		
		switch (nota)
		{
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.print("Un " + nota + " es suspenso"); 
				break;
			case 5: 
				System.out.print("Un " + nota + " es suficiente");
				break;
			case 6:
				System.out.print("Un " + nota + " es bien");
				break;
			case 7:
			case 8:
				System.out.print("Un " + nota + " es notable");
				break;
			case 9:
			case 10:
				System.out.print("Un " + nota + " es sobresaliente");
				break;
		}
	}

}



