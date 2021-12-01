package ejercicio9;

public class BebidasAzucaradas extends Bebidas{

	private double azucar;
	private boolean promocion;
	public BebidasAzucaradas(double cantidadLitros, double precio, String marca,double azucar,boolean promocion) {
		super(cantidadLitros, precio, marca);
		this.azucar = azucar;
		this.promocion = promocion;
	}
	public double getAzucar() {
		return azucar;
	}
	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}
	public boolean isPromocion() {
		return promocion;
	}
	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	@Override
	public String toString() {
		return "BebidasAzucaradas [azucar=" + azucar + ", promocion=" + promocion + ", toString()=" + super.toString()
				+ "]";
	}
	
	public double getPrecio(){
		double p = super.getPrecio();
		
		if(isPromocion()){
			p = p - (p/100)*10;
		}
		return p;
	}	
}
