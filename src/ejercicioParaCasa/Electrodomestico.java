package ejercicioParaCasa;

public class Electrodomestico {
	
	private static final double PB_DEF = 100.0;
	private static final String COLOR_DEF = "blanco";
	private static final char CE_DEF = 'F';
	private static final int PESO_DEF = 5;
	private static final char[] LETRAS_CE = new char[]{'A','B','C','D','E','F'};
	private static final String[] COLORES = new String[]{"blanco","negro","rojo","azul","gris"};
	
	private double precioBase;
	private String color;
	private char consumoEnergetico; 
	private int peso;
	
	public Electrodomestico(){
		this.precioBase = PB_DEF;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CE_DEF;
		this.peso = PESO_DEF;
	}
	
	public Electrodomestico(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CE_DEF;
		this.peso = peso;
	}


	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico precioBase|" + precioBase + " |color| " + color + " |consumoEnergetico| "
				+ consumoEnergetico + " |peso| " + peso + " |";
	}

	private char comprobarConsumoEnergetico(char letra){
		
		char letraMayus = Character.toUpperCase(letra);
		
			/*if((letraMayus != LETRAS_CE[0])&&(letraMayus != LETRAS_CE[1])&&(letraMayus != LETRAS_CE[2])
					&&(letraMayus != LETRAS_CE[3])&&(letraMayus != LETRAS_CE[4])&&(letraMayus != LETRAS_CE[5])){
				letraMayus = CE_DEF;
				
			}*/	
		
			for(int i = 0; i < LETRAS_CE.length;i++){
				if(LETRAS_CE[i]!=letraMayus){
					letraMayus=CE_DEF;
				}
			}
			return letraMayus;
		//return letraMayus;
	}
	
	private String comprobarColor(String color){
		
		String colorMinus = color.toLowerCase();
		
			/*if((!colorMinus.equals(COLORES[0]))&&(!colorMinus.equals(COLORES[1]))&&(!colorMinus.equals(COLORES[2]))
					&&(!colorMinus.equals(COLORES[3]))&&(!colorMinus.equals(COLORES[4]))){
				colorMinus = COLOR_DEF;
			}*/
			for(int i = 0;i<COLORES.length;i++){
				if(!COLORES[i].equals(colorMinus)){
					colorMinus=COLOR_DEF;
				}
			}
			return colorMinus;
	}
	
	protected double precioFinal(){
		
		double precioFinal=0;
		double precioBase = getPrecioBase(); 
		
		switch (getConsumoEnergetico()){
		case 'A':
			precioFinal = precioBase + 100;
			break;
		case 'B':
			precioFinal = precioBase + 80;
			break;
		case 'C':
			precioFinal = precioBase + 60;
			break;
		case 'D':
			precioFinal = precioBase + 50;
			break;
		case 'E':
			precioFinal = precioBase + 30;
			break;
		case 'F':
			precioFinal = precioBase + 10;
		}
		
		if (getPeso()<20){
			precioFinal = (precioFinal + 10);
		}
		else if ((getPeso()>=20) && (getPeso()<50)){
			precioFinal = (precioFinal + 50);
		}
		else if ((getPeso()>=50) && (getPeso()<80)){
			precioFinal = (precioFinal + 80);
		}else{
			precioFinal = (precioFinal + 100);
		}
		return precioFinal;
	}
}
