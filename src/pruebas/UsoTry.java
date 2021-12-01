package pruebas;

public class UsoTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int c=0;
	try{
		
		c=a/b;
		System.out.println("HOLAAAA!!");
		
	}catch(ArithmeticException ae){
		System.out.println("ADIOOOS!!");
		System.out.println("YA LA HEMOS LIAO... --> " + ae.getMessage());
		System.out.println("YA LA HEMOS LIAO... --> " + ae.getCause());
		return;
	}finally{
		System.out.println("Mensaje del FINALLY");
	}
		
		System.out.println("resultado de a/b= " + c);
	}

}
