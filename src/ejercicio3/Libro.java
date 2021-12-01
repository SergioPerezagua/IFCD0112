package ejercicio3;

public class Libro {
	
	private static final int MINIMO = 1;
	private static final int MAXIMO = 9;
	private static final int MINIMO_ISBN = 10;
	private static final int MAXIMO_ISBN = 13;
	private static final int MINIMO_PAGINAS = 1;
	private static final int MAXIMO_PAGINAS = 9999;
	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
 
public Libro(String titulo,String autor){
	this.isbn=generaISBN();
	this.titulo=titulo;
	this.autor=autor;
	this.numeroPaginas=generarNumPag();
}

public String getISBN(){return this.isbn;}


public String getTitulo(){return this.titulo;}
public void setTitulo(String titulo){this.titulo = titulo;}

public String getAutor(){return this.autor;}
public void setAutor(String autor){this.autor = autor;}

public int getNumeroPaginas(){return this.numeroPaginas;}


private  String generaISBN(){
	String isbn="";
	int numero;
	int ale = generarNumeroAletorio(MINIMO_ISBN,MAXIMO_ISBN);	
	
	for (int i=1;i<=ale;i++){
		numero = generarNumeroAletorio(MINIMO,MAXIMO);
		isbn = isbn.concat(String.valueOf(numero));
	}	
		return isbn;
	}
private int generarNumPag(){
	int numeroPaginas;
	numeroPaginas = generarNumeroAletorio(MINIMO_PAGINAS, MAXIMO_PAGINAS);
	return numeroPaginas;
}

private int generarNumeroAletorio(int minimo, int maximo){
	int numero;
	numero = (int)Math.round(minimo + Math.random()*(maximo - minimo));
	return numero;
}

public String tostring(){
	String frase;
	frase="El libro "+getTitulo()+" con ISBN "+getISBN()+" creado por el autor "+getAutor()+" tiene "+ getNumeroPaginas()+" paginas.";
	return frase;
	}
}