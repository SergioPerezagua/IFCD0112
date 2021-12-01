package ejercicio9;

import utilidades.Utilidades;

public class AlmacenMain {
	
	private static final int MINIMO_ESTANTERIA = 3;
	private static final int MAXIMO_ESTANTERIA = 10;
	
	private static final String[] MARCAS = {"Marca A","Marca B","Marca C","Marca D"};
	private static final String[] ORIGEN = {"Origen 1","Origen 2","Origen 3","origen 4"};
	private static final boolean[] VALORES_DE_VERDAD = {true,false};
	
	public static void main(String[] args) {
		int filas = Utilidades.generarNumeroAleatorio(MINIMO_ESTANTERIA, MAXIMO_ESTANTERIA);
		int columnas = Utilidades.generarNumeroAleatorio(MINIMO_ESTANTERIA, MAXIMO_ESTANTERIA);;
		
		int posiblesBebidas = filas * columnas;
		int numeroBebidas = Utilidades.generarNumeroAleatorio(1, posiblesBebidas);
		
		Almacen a = new Almacen(filas,columnas);
		
		Bebidas b;
		
		for(int i=0; i<numeroBebidas;i++){
			switch(i%2){
			case 0:
				b = new AguaMineral(Utilidades.generarNumeroAleatorioConNDecimales(0.0, 5.0, 1), 
						            Utilidades.generarNumeroAleatorioConNDecimales(0.5, 5.0, 1), 
						            MARCAS[Utilidades.generarNumeroAleatorio(0,MARCAS.length-1)],
						            ORIGEN[Utilidades.generarNumeroAleatorio(0,ORIGEN.length-1)]);
				a.agregarBebida(b);
				break;
			default:
				b = new BebidasAzucaradas(Utilidades.generarNumeroAleatorioConNDecimales(0.0, 5.0, 1), 
			            Utilidades.generarNumeroAleatorioConNDecimales(0.5, 5.0, 1), 
			            MARCAS[Utilidades.generarNumeroAleatorio(0,MARCAS.length-1)],
				        i, VALORES_DE_VERDAD[Utilidades.generarNumeroAleatorio(0, 1)]);
	                a.agregarBebida(b);
	                break;
			}
		}
		a.mostrarInformacionBebidas();
		System.out.println("El precio total de todas las bebidas es " + a.calcularPrecioTotalBebidas());
		System.out.println("El precio total de todas las bebidas en esta columna es " + a.calcularPrecioTotalPorColumna(Utilidades.generarNumeroAleatorio(0,columnas-1)));
		System.out.println("El precio total de todas las bebidas de esta marca es " +	a.calcularPrecioTotalPorMarca(MARCAS[Utilidades.generarNumeroAleatorio(0, MARCAS.length-1)]));
	}

}
