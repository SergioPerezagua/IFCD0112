package ejercicioAgroalimentario;

public abstract class Productos {
private String fechaCaducidad;
private int numeroLote;
private String fechaEnvasado;
private String paisOrigen;

public String getFechaCaducidad() {
	return fechaCaducidad;
}
public void setFechaCaducidad(String fechaCaducidad) {
	this.fechaCaducidad = fechaCaducidad;
}
public int getNumeroLote() {
	return numeroLote;
}
public void setNumeroLote(int numeroLote) {
	this.numeroLote = numeroLote;
}
public String getFechaEnvasado() {
	return fechaEnvasado;
}
public void setFechaEnvasado(String fechaEnvasado) {
	this.fechaEnvasado = fechaEnvasado;
}
public String getPaisOrigen() {
	return paisOrigen;
}
public void setPaisOrigen(String paisOrigen) {
	this.paisOrigen = paisOrigen;
}
@Override
public String toString() {
	return "Productos [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + ", fechaEnvasado="
			+ fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
}


}
