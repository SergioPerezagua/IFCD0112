package ejercicio10;

public interface Entregable {
	public String titulo = "desconocido";
	public String genero = "desconocido";
	static final boolean ENTREGADO_DEF = false;
	
	static final int MAYOR = 1;
	static final int IGUAL = 0;
	static final int MENOR = -1;
	
	public void entregar();
	
	public void devolver();
	
	public boolean isEntregado();
	
	public int compareTo(Object a);
}