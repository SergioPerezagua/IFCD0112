package ejercicio2;

public class Persona {
	
	private final static char DEF_SEXO = 'H';
	private final static int MINIMO = 10000000;
	private final static int MAXIMO = 99999999;
	private final static int DIVISOR = 23;
	private final static int DELGADEZ = -1;
	private final static int NORMAL = 0;
	private final static int SOBREPESO = 1;
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;


	 public Persona(){
		this.nombre = "";
		this.edad = 0;
		this.dni = generaDNI();
		this.sexo = DEF_SEXO;
		this.peso = 0;
		this.altura = 0;
	}
	 public Persona(String nombre, int edad, char sexo){
		 this.nombre = nombre;
			this.edad = edad;
			this.dni = generaDNI();
			this.sexo = comprobarSexo(sexo);
			this.peso = 0;
			this.altura = 0;
	 }
	 
	 public Persona(String nombre, int edad, char sexo, double peso, double altura){
		 	this.nombre = nombre;
			this.edad = edad;
			this.dni = generaDNI();
			this.sexo = comprobarSexo(sexo);
			this.peso = peso;
			this.altura = altura;
	 }
	 
	 public String getNombre() {return this.nombre;}
	    public void setNombre(String nombre) {this.nombre = nombre;}

	    public int getEdad() {return this.edad;}
	    public void setEdad(byte edad) {this.edad = edad;}

	    public String getDni() {return this.dni;}

	    public char getSexo() {return this.sexo;}
	    public void setSexo(char sexo) {this.sexo = sexo;}

	    public double getPeso() {return this.peso;}
	    public void setPeso(double peso) {this.peso = peso;}

	    public double getAltura() {return this.altura;}
	    public void setAltura(double altura) {this.altura = altura;}
	 
	    
	    
	    public String generaDNI(){
		 int parteNumericaDNI;
		 char parteLetraDNI;
		 int restoDivision;
		
		 
		 parteNumericaDNI = (int) Math.round(MINIMO + Math.random() * (MAXIMO - MINIMO));
		 restoDivision = parteNumericaDNI % DIVISOR;
		 parteLetraDNI = obtenerLetraDNI(restoDivision); 
		 
		 String dniCompleto= String.valueOf(parteNumericaDNI) + parteLetraDNI ;
		 
		 return dniCompleto;
	 }
	private char obtenerLetraDNI(int numero){
		char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X',
						'B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		return letras[numero];
	}
	public int calcularIMC(double peso, double altura){
		
		int resultado;
		int imc = (int) (peso / Math.pow(altura, 2));
		
		if ((peso == 0) || (altura == 0)){
			resultado = 2;
		}else{
			if (imc < 20){
				 resultado = DELGADEZ;
			}
			else if (imc >= 20 && imc <= 25){
				resultado = NORMAL;
			
			}else{
				resultado = SOBREPESO;
			}
		}
	return resultado;
	}
	public boolean esMayorDeEdad(int edad){
		
		boolean mayorDeEdad;
		
		if (edad <18){
		mayorDeEdad = false;
		}else{
		mayorDeEdad = true;
		}
		
		return mayorDeEdad;			
	}
	private char comprobarSexo(char sexo){
		if ((sexo != 'H')&&(sexo != 'h')&&(sexo != 'M')&&(sexo != 'm')){
			sexo = DEF_SEXO;
		}
		return sexo;
	}
	public String toString(){
		 String frase;
		frase="La persona con dni: "+getDni()+".".concat("\r\n");
		frase+="Con nombre:"+getNombre()+".".concat("\r\n");
		frase+="Con edad:"+getEdad()+".".concat("\r\n");
    	frase+="Con sexo:"+getSexo()+".".concat("\r\n");
        frase+="Con peso:"+getPeso()+" kg.".concat("\r\n");
        frase+="Con altura:"+getAltura()+" m.".concat("\r\n");
		 return frase;
 }
}