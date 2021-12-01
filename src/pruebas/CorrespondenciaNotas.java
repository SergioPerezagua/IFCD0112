package pruebas;

public class CorrespondenciaNotas {

	public static void main(String[] args) {
	int nota;
	int maximo = 10;
	int minimo = 0;
	
	nota = (int) Math.round(minimo + Math.random() * (maximo - minimo));
	
	if (nota <5)
		{
			System.out.print("Un " + nota + " es suspenso");
		}
	
		else if (nota <6)
		{
			System.out.print("Un " + nota + " es suficiente");
		}
		else if (nota <7)
		{
			System.out.print("Un " + nota + " es bien");
		}
		else if (nota <9)
		{
			System.out.print("Un " + nota + " es notable");
		}
		else
		{
			System.out.print("Un " + nota + " es sobresaliente");
		}
	}

}
