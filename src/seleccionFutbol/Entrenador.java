package seleccionFutbol;

public class Entrenador extends SeleccionFutbol{

	private int idFederacion;
	
	public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion=idFederacion;
	}
	public int getIdFederacion() {
		return idFederacion;
	}
	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	@Override
	public void jugarPartido() {
	System.out.println("dirige un partido (Clase Entrenador)");	
	}
	@Override
	public void entrenar() {
		 System.out.println("dirige un entrenamiento (Clase Entrenador)");
	}
	public void planificarEntrenamiento(){
		System.out.println("Planificar un Entrenamiento");
	}
}
