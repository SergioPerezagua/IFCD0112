package seleccionFutbol;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
protected int id;
protected String nombre;
protected String apellidos;
protected int edad;


//CONSTRUCTORES
public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
}

//GETTER Y SETTER
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}
@Override
public String toString() {
	return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
			+ ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos()
			+ ", getEdad()=" + getEdad() + "]";
}
public void concentrarse(){
	System.out.println("concentrarse (Clase Padre)");
}
public void viajar(){
	System.out.println("viajar(Clase Padre)");
}
public abstract void entrenar();

public void jugarPartido(){
	System.out.println("asistir al partido");
}
}
