package ejercicioPilas;

public class MainPila {

	public static void main(String[] args) {
		PilaCDrom pilacdrom = new PilaCDrom();
		
		pilacdrom.push(1);
		pilacdrom.push(2);
		pilacdrom.push(3);
		pilacdrom.push(4);
		pilacdrom.push(5);
		System.out.println(pilacdrom);
		pilacdrom.pop();
		System.out.println(pilacdrom);
	}
}

	


