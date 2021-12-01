package ejercicioParaCasa;

public class Lavadora extends Electrodomestico{
		
	private static final int CARGA_DEF = 5;
	
	private int carga;

	
	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}


	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEF;
	}


	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso,int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}


	public int getCarga() {
		return carga;
	}


	public void setCarga(int carga) {
		this.carga = carga;
	}


	@Override
	public String toString() {
		return "Lavadora carga| " + carga + " |Precio base| " + getPrecioBase() + " |Color| " + getColor()
				+ " |ConsumoEnergetico| " + getConsumoEnergetico() + " |Peso| " + getPeso() + "|";
	}
	
	public double precioFinal(){
		
		double precioFinalLavadora = super.precioFinal();
		
		if(this.carga >= 30){
			precioFinalLavadora += 50;
		}
		
		return precioFinalLavadora;
	}
}
