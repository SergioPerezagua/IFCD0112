package ejercicio4;
import utilidades.*;
public class MainCine {
	public static final int EDAD_MINIMA = 0;
	public static final int EDAD_MAXIMA = 90;
	
	public static final double DINERO_MINIMO = 1.0;
	public static final double DINERO_MAXIMO = 35.0;
	
	public static void main(String[] args) {
		
		Cine cine = new Cine("Star Wars", 150, 16, "George Lucas", 14.5);
		
		System.out.print(cine.toString());
		cine.visualizarButacas();
	
	Espectador espectador1 = new Espectador(Utilidades.nombreAleatorio(),Utilidades.generarNumeroAleatorio(EDAD_MINIMA,EDAD_MAXIMA),
											Utilidades.generarNumeroAleatorioConNDecimales(DINERO_MINIMO,DINERO_MAXIMO,2));
	
	System.out.println(espectador1.toString());
	}

}
