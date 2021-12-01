package pruebas;

public class ContarNumeros {

	 static int minimo=1;
	    static int maximo=100;
	    private static int aleatorio;


	    public static void main (String[] args) 
	    {
	        aleatorio = (int) Math.round(minimo + Math.random() * (maximo-minimo));

	        for (int i=aleatorio;i>=0;i--) 
	        {
	            System.out.print(i+" ");
	        }
	    }
	}