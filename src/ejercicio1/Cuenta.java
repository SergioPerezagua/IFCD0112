package ejercicio1;

public class Cuenta {
	
	private String titular;
	private double cantidad;
	
		public Cuenta(String titular){
		this.titular = titular;
		this.cantidad = 0;
	}
	
	 public Cuenta(String titular , double cantidad){
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	 
	 
	 public String getTitular(){
		 return this.titular;
	 }
	 
	 public void setTitular(String titular){
		 this.titular = titular;
	 }
	 
	 public double getCantidad(){
		 return this.cantidad;
	 }
	 
	 public void setCantidad(double cantidad){
		 this.cantidad = cantidad;
	 }
	
	 public String toString(){
		 String frase;
		 frase = "La cuenta de " + getTitular() + " tiene un saldo de " + getCantidad() + " €.";
		 return frase;
	 }
	 
	 
	 void ingresar(double cantidad){
		if (cantidad > 0){
			this.cantidad = this.cantidad + cantidad;
		}
	}
	
	void retirar(double cantidad){
		if (this.cantidad - cantidad <= 0){
			this.cantidad = 0;
		}else{
			this.cantidad = this.cantidad - cantidad;
	}
	}
}
