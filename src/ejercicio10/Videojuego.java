package ejercicio10;

public class Videojuego implements Entregable {
	
	private static final int HORAS_DEF = 10;
	private static final String COMPANIA_DEF = "desconocido";
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;
	
	public Videojuego() {
		
		this.titulo = Entregable.titulo;
		this.horasEstimadas = HORAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = Entregable.genero;
		this.compania = COMPANIA_DEF;
	}

	public Videojuego(String titulo, int horasEstimadas) {
		
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO_DEF;
		this.genero = Entregable.genero;
		this.compania = COMPANIA_DEF;
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO_DEF;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}

	@Override
	public void entregar() {
		this.entregado = true;
		
	}

	@Override
	public void devolver() {
		this.entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
		
		return entregado;
	}

	@Override
	public int compareTo(Object obj) {
		
		int estado = MENOR;	
		
		Videojuego videojuegoExterno = (Videojuego)obj;
		
		if(horasEstimadas>videojuegoExterno.getHorasEstimadas()){
			estado = MAYOR;
		}
		else if(horasEstimadas == videojuegoExterno.getHorasEstimadas()){
			estado = IGUAL;
		}
		return estado;
	}
}
	

