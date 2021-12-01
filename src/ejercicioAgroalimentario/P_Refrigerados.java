package ejercicioAgroalimentario;

public class P_Refrigerados extends P_Frios {
private String codigoOrganismoSupervisor;

public P_Refrigerados(String fechaCaducidad,int numeroLote,String fechaEnvasado,String paisOrigen, double temperaturaMantenimiento,
		String codigoOrganismoSupervisor) {
	setFechaCaducidad(fechaCaducidad);
	setNumeroLote(numeroLote);
	setFechaEnvasado(fechaEnvasado);
	setPaisOrigen(paisOrigen);
	setTemperaturaMantenimiento(temperaturaMantenimiento);
	this.codigoOrganismoSupervisor=codigoOrganismoSupervisor;
}

public String getCodigoOrganismoSupervisor() {
	return codigoOrganismoSupervisor;
}

public void setCodigoOrganismoSupervisor(String codigoOrganismoSupervisor) {
	this.codigoOrganismoSupervisor = codigoOrganismoSupervisor;
}

@Override
public String toString() {
	return "P_Refrigerados [codigoOrganismoSupervisor=" + codigoOrganismoSupervisor + ", toString()=" + super.toString()
			+ "]";
}

}
