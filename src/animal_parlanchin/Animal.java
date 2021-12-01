package animal_parlanchin;

public abstract class Animal implements Parlanchin{
	public abstract void habla();
}

class Perro extends Animal{
	public void habla(){
			System.out.println("¡GUAU!");
	}
}

class Gato extends Animal{
	public void habla(){
		System.out.println("¡MIAU!");
	}
}