package ejercicio7;

import utilidades.Utilidades;

public abstract class Persona {
	
	private String nombre;
	private int edad;
	private char sexo;
	private boolean asistencia;
	
	
	public Persona(){
		this.nombre = Utilidades.nombreAleatorio() +" "+ Utilidades.apellidoAleatorio()+ " "+ Utilidades.apellidoAleatorio();
		this.edad = Utilidades.generarNumeroAleatorio(16, 30);
		this.sexo = Utilidades.sexoAleatorio();
		disponibilidad();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public boolean isAsistencia() {
		return asistencia;
	}


	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", asistencia=" + isAsistencia() + "]";
	}
	
	public abstract void disponibilidad();
	
}
