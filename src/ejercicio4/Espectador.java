package ejercicio4;

public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;
	
	public Espectador(String nombre, int edad, double dinero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
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

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "Espectador con nombre: " + nombre + ", tiene " + edad + " años y tiene " + dinero + " € en el bolsillo";
	}
	
	public boolean tieneGuita(double precioEntrada){
		if (this.dinero >= precioEntrada){
			return true;
		}else{
			return false;
		}
	}
	public boolean tieneEdad(int edadMinima){
		if (this.edad >= edadMinima){
			return true;
		}else{
			return false;
		}
	}
	
	public void pagarEntrada(double precioEntrada){
		if (tieneGuita(precioEntrada)){
			this.dinero = dinero - precioEntrada;
		
		}
	}
}
