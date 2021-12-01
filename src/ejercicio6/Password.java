package ejercicio6;
import utilidades.*;
public class Password {
	
	private static final int LONGITUD_DEF=8;
	private static final int MINIMO = 0;
	private static final int MAXIMO = 61 ;
	private int longitud;
	private String contrasenia;
	private static char[] caracteres = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M',
			'N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i',
			'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
			'0','1','2','3','4','5','6','7','8','9'};
	
	
	/**
	 * Metodo constructor de objetos Password.
	 * 
	 * Se utiliza la constante LONGITUD_DEF para darle valor a la variable longitud, 
	 * que sirve para indicar el parametro longitud de la contraseña.
	 * 
	 * Se hace la llamada al metodo generarPassword para generar la contraseña en si.
	 */
	public Password(){
		this.longitud=LONGITUD_DEF;
		this.contrasenia=generarPassword(longitud);
	}
	/**
	 * Metodo constructor de objetos Password, pasandole la longitud de la contraseña.
	 * 
	 * @param longitud se usa para pasarle la longitud de las contraseñas.
	 * 
	 *  Se hace la llamada al metodo generarPassword para generar la contraseña en si.
	 */
	public Password(int longitud){
		this.longitud=longitud;
		this.contrasenia=generarPassword(longitud);
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenia(){
		return contrasenia;
	}

	public static String generarPassword(int longitud){
		 int posicion;
		String contrasenia="";
		
		for (int i=1; i<=longitud; i++){
			 posicion = Utilidades.generarNumeroAleatorio(MINIMO, MAXIMO);
			contrasenia = contrasenia + (caracteres [posicion]);
		}
		return contrasenia;
	}
	public boolean esFuerte(){
        
		boolean Fuerte=false;
        String numero =nCaracteres(contrasenia, caracteres);

        int mayusculas = Integer.parseInt(numero.substring(0,1));
        //System.out.println(mayusculas + " esFuerte");
        int minusculas=Integer.parseInt(numero.substring(1,2));
        //System.out.println(minusculas + " esFuerte");
        int numeros=Integer.parseInt(numero.substring(2));
        //System.out.println(numeros + " esFuerte");

        if ((mayusculas>=2) && (minusculas>=2) && (numeros>=5)) 
        {
            Fuerte=true;
        }

        return Fuerte;
    }


    private String nCaracteres (String pass,char[] letras) {

    	int mayusculas=0;
    	int minusculas=0;
    	int numeros=0;
    	String  numCar="";
    	
        for (int x = 0; x <= pass.length()-1; x++){ 
        
            for (int i = 0; i <= letras.length - 36; i++){ 
            
                if (pass.charAt(x) == letras[i]) {
                    mayusculas++;
                }
            }
        }
        
        for (int x = 0; x <= pass.length()-1; x++){ 
            
            for (int i = 26; i <= letras.length - 11; i++){ 
            
                if (pass.charAt(x) == letras[i]) {
                	minusculas++;
                } 
            }
        }
        
		for (int x = 0; x <= pass.length()-1; x++){ 
		            
            for (int i = 52; i <= letras.length-1; i++){ 
            
                if (pass.charAt(x) == letras[i]) {
                	numeros++;
                }
            }
		}
		            
       /* System.out.println(mayusculas + " nCaracteres");
        System.out.println(minusculas + " nCaracteres");
        System.out.println(numeros + " nCaracteres");*/
        numCar = String.valueOf(String.valueOf(mayusculas) + String.valueOf(minusculas)+ String.valueOf(numeros));
        return numCar;

    }
}	

