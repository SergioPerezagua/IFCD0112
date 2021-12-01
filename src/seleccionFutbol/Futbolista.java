package seleccionFutbol;

public class Futbolista extends SeleccionFutbol{
private int dorsal;
private String demarcacion;

//CONSTRUCTOR
public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
	super(id, nombre, apellidos, edad);
	this.dorsal = dorsal;
	this.demarcacion = demarcacion;
}

//GETTERS Y SETTERS
public int getDorsal() {
	return dorsal;
}

public void setDorsal(int dorsal) {
	this.dorsal = dorsal;
}

public String getDemarcacion() {
	return demarcacion;
}

public void setDemarcacion(String demarcacion) {
	this.demarcacion = demarcacion;
}

//METODO
public void entrenar(){
	System.out.println("realiza un entrenamiento (Clase Futbolista)");
}
public void jugarPartido(){
	System.out.println("juega un partido (Clase Futbolista)");
}
public void entrevista(){
	System.out.println("da una entrevista");
}

}
