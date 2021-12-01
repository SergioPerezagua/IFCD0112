package ejercicioParaCasa;

public class Television extends Electrodomestico{

	private static final int RESOLUCION_DEF = 20;
	private static final boolean TDT_DEF = false;
	
	private int resolucion;
	private boolean sintonizadorTDT;
	
	public Television() {
		super();
		this.resolucion = RESOLUCION_DEF;
		this.sintonizadorTDT = TDT_DEF;
	}
	public Television(double precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION_DEF;
		this.sintonizadorTDT = TDT_DEF;
	}
	public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public int getResolucion() {
		return resolucion;
	}
	
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	
	@Override
	public String toString() {
		return "Television resolucion| " + resolucion + " |sintonizadorTDT| " + isSintonizadorTDT() + " |Precio base| " + getPrecioBase() + "€ |Color| " + getColor()
				+ " |ConsumoEnergetico| " + getConsumoEnergetico() + " |Peso| " + getPeso() + "|";
	}
	
	public double preciofinal(){
		
		double precioFinalTele = super.precioFinal();
		
		if (isSintonizadorTDT()==true){
			precioFinalTele +=  50;
		}
		if (resolucion >= 40){
			precioFinalTele += ((getPrecioBase()/100) * 30);
		}
		return precioFinalTele;
	}
}
