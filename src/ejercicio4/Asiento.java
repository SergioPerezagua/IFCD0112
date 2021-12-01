package ejercicio4;

public class Asiento {
	private char letra;
	private int numero;
	private Espectador espectador;
	
	public Asiento(char letra, int numero){
		this.letra = letra;
		this.numero = numero;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}

	@Override
	public String toString() {
		
		if (ocupado() == true){
			return "En el asiento " + getLetra() + "-" + getNumero() +  " está sentado " + getEspectador().getNombre();
		}else{
			return "El asiento " + getLetra() + "-" + getNumero() +  " está VACIO";
		}
	}
	
	public boolean ocupado(){
		if (this.espectador != null){
			return true;
		}else{
			return false;
		}
	}
}
