package ejercicio1;

public class CuentaMain {

	public static void main(String[] args) {
	
		Cuenta  cuenta_1 = new Cuenta("Antonio");
		Cuenta cuenta_2= new Cuenta("Fernando", 100);

		System.out.println(cuenta_1);
		System.out.println(cuenta_2);
		
		cuenta_1.ingresar(35);
		cuenta_2.retirar(35);
		
		System.out.println(cuenta_1);
		System.out.println(cuenta_2);
	}

}
