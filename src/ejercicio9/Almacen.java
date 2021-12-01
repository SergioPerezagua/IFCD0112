package ejercicio9;

import utilidades.Utilidades;

public class Almacen {
	
	private static final int MINIMO_ESTANTERIA = 3;
	private static final int MAXIMO_ESTANTERIA = 10;
	private Bebidas[][] estanteria;
	
	public Almacen(){
		estanteria = new Bebidas[Utilidades.generarNumeroAleatorio(MINIMO_ESTANTERIA, MAXIMO_ESTANTERIA)]
				                [Utilidades.generarNumeroAleatorio(MINIMO_ESTANTERIA, MAXIMO_ESTANTERIA)];
	}
	
	public Almacen(int filas,int columnas){
		estanteria = new Bebidas[filas][columnas];
	}
	
	public double calcularPrecioTotalBebidas(){
		
		double precioTotal=0;
		
		for(int i = 0; i<estanteria.length;i++){
			for(int j = 0; j <estanteria[i].length;j++){
				if(estanteria[i][j] != null){
				precioTotal += estanteria[i][j].getPrecio();
				}
			}
		}
		return precioTotal;
	}
	
	public double calcularPrecioTotalPorMarca(String marca){
		
		double precioTotal=0;
		
		for(int i = 0; i<estanteria.length;i++){
			for(int j = 0; j <estanteria[0].length;j++){
				if(estanteria[i][j] != null){
					if(estanteria[i][j].getMarca().equalsIgnoreCase(marca)){
						precioTotal += estanteria[i][j].getPrecio();
					}
				}
			}
		}
		return precioTotal;
	}
	
	public double calcularPrecioTotalPorColumna(int columna){
		
		double precioTotal=0;
		if(columna>=0 && columna < estanteria[0].length){
			for(int i = 0;i<estanteria.length;i++){
				if(estanteria[i][columna] != null){
					precioTotal += estanteria[i][columna].getPrecio();
				}	
			}
		}
		return precioTotal;
	}
	public void agregarBebida(Bebidas b){
		
		boolean encontrado = false;
		
		for(int i = 0; i<estanteria.length && encontrado == true;i++){
			for(int j = 0; j <estanteria[0].length;j++){
				if(estanteria[i][j] == null){
					estanteria[i][j]= b;
					encontrado = true;
				}
			}
		}
		if (encontrado){
			System.out.println("bebida añadida");
		}else{
			System.out.println("bebida NO añadida");
		}
	}
	
	public void eliminarBebida(int id){
		
		boolean encontrado = false;
		
		for(int i = 0; i<estanteria.length && encontrado == true;i++){
			for(int j = 0; j <estanteria[0].length;j++){
				if(estanteria[i][j] != null){
					if(estanteria[i][j].getId()==id){
						estanteria[i][j]=null;
						encontrado = true;
					}
				}
			}
		}
		if(encontrado){
			System.out.println("bebida eliminada");
		}else{
			System.out.println("bebida NO eliminada");
		}
	}
	
	public void mostrarInformacionBebidas(){
		
		for(int i = 0; i<estanteria.length;i++){
			for(int j = 0; j <estanteria[0].length;j++){
				if(estanteria[i][j] != null){
					System.out.println("[" + i + ", "+ j +"] --> "+ estanteria[i][j].toString());
				}
			}
		}	
	}
}
