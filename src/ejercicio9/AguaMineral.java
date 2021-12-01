package ejercicio9;

public class AguaMineral extends Bebidas{
	
	private String origen;

	public AguaMineral(double cantidadLitros, double precio, String marca, String origen) {
		super(cantidadLitros, precio, marca);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "AguaMineral [origen=" + origen + ", toString()=" + super.toString() + "]";
	}
	
	
}
