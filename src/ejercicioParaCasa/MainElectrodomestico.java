package ejercicioParaCasa;

public class MainElectrodomestico {

	public static void main(String[] args) {
		
		double precioFinal = 0;
		double precioFinalTele = 0;
		double precioFinalLavadora = 0;
		double precioFinalElectrodomesticos = 0;
		
		Lavadora lavadora1 = new Lavadora();
		Lavadora lavadora2 = new Lavadora(300,20);
		Lavadora lavadora3 = new Lavadora(400,"azul",'a',80,30);
		Television television1 = new Television(100,"negro",'a',10,40,false);
		Television television2 = new Television(80,"blanco",'b',10,40,true);
		Electrodomestico electrodomestico1 = new Electrodomestico();
		
		Electrodomestico electrodomesticos[];
		electrodomesticos = new Electrodomestico[]{lavadora1,lavadora2,lavadora3,television1,television2,electrodomestico1};
		
		
		for (int i = 0 ; i <= electrodomesticos.length-1 ; i++ ){
			
			if (electrodomesticos[i] instanceof Television){
			System.out.println("nº " + (i+1) + " " + electrodomesticos[i].toString() + " PrecioFinal| " + electrodomesticos[i].precioFinal() + "€.");
			precioFinal += electrodomesticos[i].precioFinal();
			precioFinalTele += electrodomesticos[i].precioFinal();
			
			}
			else if(electrodomesticos[i] instanceof Lavadora){
				System.out.println("nº " + (i+1) + " " + electrodomesticos[i].toString() + " PrecioFinal| " + electrodomesticos[i].precioFinal() + "€.");
				precioFinal += electrodomesticos[i].precioFinal();
				precioFinalLavadora += electrodomesticos[i].precioFinal();
			}else{
				System.out.println("nº " + (i+1) + " " + electrodomesticos[i].toString() + " PrecioFinal| " + electrodomesticos[i].precioFinal() + "€.");
				precioFinal += electrodomesticos[i].precioFinal();
				precioFinalElectrodomesticos += electrodomesticos[i].precioFinal();
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("El precio total de todas las televisiones es " + precioFinalTele + "€.");
		System.out.println("El precio total de todas las lavadoras es " + precioFinalLavadora + "€.");
		System.out.println("El precio total de todos los electrodomesticos es " + precioFinalElectrodomesticos + "€.");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("El precio total de todos los tipos de electrodomesticos es " + precioFinalTele + " + " + precioFinalLavadora + 
																		" + " + precioFinalElectrodomesticos + " = " + precioFinal + "€.");
		
	}

}
