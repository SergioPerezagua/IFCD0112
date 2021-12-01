package ejercicioAgroalimentario;

public class P_C_Nitrogeno extends P_Congelados {

	private String metodo;
	private int tiempoExposicion;
	
	public P_C_Nitrogeno(String fechaCaducidad,int numeroLote,String fechaEnvasado,String paisOrigen, double temperaturaMantenimiento,
			String metodo, int tiempoExposicion) {
		setFechaCaducidad(fechaCaducidad);
		setNumeroLote(numeroLote);
		setFechaEnvasado(fechaEnvasado);
		setPaisOrigen(paisOrigen);
		setTemperaturaMantenimiento(temperaturaMantenimiento);
		setMetodo(metodo);
		setTiempoExposicion(tiempoExposicion);
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public int getTiempoExposicion() {
		return tiempoExposicion;
	}

	public void setTiempoExposicion(int tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}

	@Override
	public String toString() {
		return "P_C_Nitrogeno [metodo=" + metodo + ", tiempoExposicion=" + tiempoExposicion + ", toString()="
				+ super.toString() + "]";
	}

}