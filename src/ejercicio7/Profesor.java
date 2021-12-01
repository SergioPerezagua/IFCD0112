package ejercicio7;

import utilidades.Utilidades;

public class Profesor extends Persona{
	
	protected static final String[] MATERIAS = {"matematicas","filosofia","fisica"};
	private String materia;

	public Profesor() {
		super();
		this.materia = MATERIAS[Utilidades.generarNumeroAleatorio(0, 2)];
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Profesor [materia=" + materia + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void disponibilidad() {
		
		int probabilidad = Utilidades.generarNumeroAleatorio(1, 100);
		
		if (probabilidad < 20){
			setAsistencia(false);
		}else{
			setAsistencia(true);
		}
	}
	
	
}
