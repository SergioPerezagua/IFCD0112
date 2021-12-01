package ejercicio9;

public class Bebidas {

	private static int idActual = 1;
	
	private int id;
	private double cantidadLitros;
	private double precio;
	private String marca;
	
	public Bebidas( double cantidadLitros, double precio, String marca) {
		this.id = idActual++;
		this.cantidadLitros = cantidadLitros;
		this.precio = precio;
		this.marca = marca;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public double getCantidadLitros() {
		return cantidadLitros;
	}
	public void setCantidadLitros(double cantidadLitros) {
		this.cantidadLitros = cantidadLitros;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public static int getIdActual() {
		return idActual;
	}
	public static void setIdActual(int idActual) {
		Bebidas.idActual = idActual;
	}
	@Override
	public String toString() {
		return "Bebidas [id=" + id + ", cantidadLitros=" + cantidadLitros + ", precio=" + precio + ", marca=" + marca
				+ "]";
	}
	
	
}
