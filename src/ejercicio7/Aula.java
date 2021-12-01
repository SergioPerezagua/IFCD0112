package ejercicio7;

import java.util.Arrays;

import utilidades.Utilidades;

public class Aula {
	
	static final int MAXIMO_ALUMNOS = 30;
	
	private int idClase;
	private String materia;
	private Profesor profesor;
	private Alumno[] alumnos;
	
	
	public Aula() {
		
		this.idClase = 1;
		this.materia = Profesor.MATERIAS[Utilidades.generarNumeroAleatorio(0, 2)];
		this.profesor = new Profesor();
		this.alumnos = new Alumno[MAXIMO_ALUMNOS];
		crearAlumnos();
	}

	
	public int getIdClase() {
		return idClase;
	}


	public void setIdClase(int idClase) {
		this.idClase = idClase;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public Profesor getProfesor() {
		return profesor;
	}


	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}


	public Alumno[] getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}


	private void crearAlumnos(){
		
		for(int i = 0 ; i < MAXIMO_ALUMNOS ; i++){
			alumnos[i] = new Alumno();
		}
	}
	
	public boolean darClase(){
		
		boolean sePuede = true;
		
		if(!profesor.isAsistencia()){
			System.out.println("No hay profesor disponible");
			sePuede = false;
		}
		else if(!profesor.getMateria().equals(getMateria())){
			System.out.println("No coinciden las materias");
			sePuede = false;
		}
		else if(!asistenciaAlumnos()){
			sePuede = false;
		}	
		return sePuede;
	}
	private boolean asistenciaAlumnos(){
		
		boolean hayAlumnos = false;
		int cantidadAlumnos=0;
		
		for(int i = 0 ; i < MAXIMO_ALUMNOS ; i++){
			
			if (alumnos[i].isAsistencia()){
				cantidadAlumnos++;
			}
			
		}
		System.out.println("hay " + cantidadAlumnos + " alumnos");
		
		if(cantidadAlumnos>=(MAXIMO_ALUMNOS/2)){
			hayAlumnos = true;
		}
		return hayAlumnos;
	}


	@Override
	public String toString() {
		return "Aula [idClase=" + idClase + ", materia=" + materia + ", profesor=" + profesor + ", alumnos="
				+ Arrays.toString(alumnos) + "]";
	}
	
}
