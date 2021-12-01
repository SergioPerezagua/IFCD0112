package ejercicio4;

public class Cine {
	private static final int LETRA_MAXIMA = 9;
	private static final int NUMERO_MAXIMO = 8;		
	private Pelicula pelicula;
	private double precioEntrada;
	private Asiento asientos[][];
	
	
	public Cine(String titulo,int duracion,int edadMinima,String director,double precioEntrada){
		pelicula = new Pelicula(titulo,duracion,edadMinima,director);
		
		/*pelicula.setTitulo(titulo);
		pelicula.setDuracion(duracion);
		pelicula.setEdadMinima(edadMinima);
		pelicula.setDirector(director);*/
		
		this.precioEntrada = precioEntrada;
		asientos = new Asiento[LETRA_MAXIMA][NUMERO_MAXIMO];
		disposicionAsientos();
	}
	
	
	public void disposicionAsientos(){
		for (int x = 0 ; x <= asientos.length-1; x++ ){
			for (int y = 0 ; y <= asientos[0].length-1 ; y++){
				asientos[x][y] = new Asiento((char)('A' + x) , y); //A --> 65
			}
		}
	}
	
	
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	
	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}
	
	public Asiento[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[][] asientos) {
		this.asientos = asientos;
	}


	@Override
	public String toString() {
		String texto="Cine [pelicula=" + pelicula.toString() + ", precioEntrada=" + precioEntrada + "]";
		return texto;
	}

	public void visualizarButacas(){
		for (int x = 0 ; x <= asientos.length-1 ; x++ ){
			for (int y = 0 ; y <= asientos[0].length-1; y++){
				System.out.println(asientos[x][y]);
				
			}
			System.out.println();
		}

	}
	
}
