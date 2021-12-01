package ejercicioAgroalimentario;

public class P_C_Agua extends P_Congelados{
private double salinidad;

public P_C_Agua (String fechaCaducidad,int numeroLote,String fechaEnvasado,String paisOrigen, double temperaturaMantenimiento,double salinidad) {
	setFechaCaducidad(fechaCaducidad);
	setNumeroLote(numeroLote);
	setFechaEnvasado(fechaEnvasado);
	setPaisOrigen(paisOrigen);
	setTemperaturaMantenimiento(temperaturaMantenimiento);
	setSalinidad(salinidad);
}

public double getSalinidad() {
	return salinidad;
}

public void setSalinidad(double salinidad) {
	this.salinidad = salinidad;
}

@Override
public String toString() {
	return "P_C_Agua [salinidad=" + salinidad + ", toString()=" + super.toString() + "]";
}

}

