package ejercicio10;

public class Serie implements Entregable {
	
	private static final int TEMP_DEF = 3;
	
	private static final String CREADOR_DEF = "desconocido";
	
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie(){
		this.titulo = Entregable.titulo;
		this.numeroTemporadas = TEMP_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = Entregable.genero;
		this.creador = CREADOR_DEF;
	}
	
	public Serie(String titulo,String creador){
		this.titulo = titulo;
		this.numeroTemporadas = TEMP_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = Entregable.genero;
		this.creador = creador;
	}
	public Serie(String titulo,int numeroTemporadas, String genero,String creador){
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = ENTREGADO_DEF;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
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
		
		Serie serieExterna = (Serie)obj;
		
		if(numeroTemporadas>serieExterna.getNumeroTemporadas()){
			estado = MAYOR;
		}
		else if(numeroTemporadas == serieExterna.getNumeroTemporadas()){
			estado = IGUAL;
		}
		return estado;
	}
	
}
