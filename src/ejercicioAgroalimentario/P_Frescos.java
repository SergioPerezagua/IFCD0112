package ejercicioAgroalimentario;

public class P_Frescos extends Productos{

	public P_Frescos(String fechaCaducidad,int numeroLote,String fechaEnvasado,String paisOrigen){
		setFechaCaducidad(fechaCaducidad);
		setNumeroLote(numeroLote);
		setFechaEnvasado(fechaEnvasado);
		setPaisOrigen(paisOrigen);
	}

	@Override
	public String toString() {
		return "P_Frescos [toString()=" + super.toString() + "]";
	}

	

}
	

