package pruebas;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CalcularPerimetroArea {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el radio de su circulo, por favor:");
		
		double perimetro;
		double area;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		int radio = sc.nextInt();
		perimetro = (Math.PI * 2) * radio;
		area = (Math.PI * Math.pow(radio, 2));
		
		System.out.println("El perimetro es " + df.format(perimetro) + " cm");
		System.out.println("El área es " + df.format(area) + " cm²");
		
		sc.close();
	}

}
