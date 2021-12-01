package ejercicio7;

import utilidades.Utilidades;

public class Alumno extends Persona {

	private int nota;
	

	public Alumno() {
		super();
		this.nota = Utilidades.generarNumeroAleatorio(0, 10);
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void disponibilidad() {
			
		int probabilidad = Utilidades.generarNumeroAleatorio(1, 100);
		
		if (probabilidad < 50){
			setAsistencia(false);
		}else{
			setAsistencia(true);
		}
	}
		
		
}
	
	

