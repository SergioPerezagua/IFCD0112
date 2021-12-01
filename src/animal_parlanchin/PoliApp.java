package animal_parlanchin;

public class PoliApp {

	public static void main(String[] args) 
	{
		
		Gato gato = new Gato();
		Perro perro = new Perro();
		Cucu cucu = new Cucu();
		
		hazleHablar(gato);
		hazleHablar(perro);
		hazleHablar(cucu);

	}

static void hazleHablar(Parlanchin sujeto)
{
	sujeto.habla();
}

}
