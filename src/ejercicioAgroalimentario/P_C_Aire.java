package ejercicioAgroalimentario;

public class P_C_Aire extends P_Congelados {

	private double nitrogeno;
	private double oxigeno;
	private double co2;
	private double vaporH2O;

public P_C_Aire (String fechaCaducidad,int numeroLote,String fechaEnvasado,String paisOrigen, double temperaturaMantenimiento,double nitrogeno,double oxigeno,double co2,double vaporH2O) {
	
	setFechaCaducidad(fechaCaducidad);
	setNumeroLote(numeroLote);
	setFechaEnvasado(fechaEnvasado);
	setPaisOrigen(paisOrigen);
	setTemperaturaMantenimiento(temperaturaMantenimiento);
	setNitrogeno(nitrogeno);
	setOxigeno(oxigeno);
	setCo2(co2);
	setVaporH2O(vaporH2O);
}

public double getNitrogeno() {
	return nitrogeno;
}

public void setNitrogeno(double nitrogeno) {
	this.nitrogeno = nitrogeno;
}

public double getOxigeno() {
	return oxigeno;
}

public void setOxigeno(double oxigeno) {
	this.oxigeno = oxigeno;
}

public double getCo2() {
	return co2;
}

public void setCo2(double co2) {
	this.co2 = co2;
}

public double getVaporH2O() {
	return vaporH2O;
}

public void setVaporH2O(double vaporH2O) {
	this.vaporH2O = vaporH2O;
}

@Override
public String toString() {
	return "P_C_Aire [nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", co2=" + co2 + ", vaporH2O=" + vaporH2O
			+ ", toString()=" + super.toString() + "]";
}


}
