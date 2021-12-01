package ejercicio8;

public class Agenda {
	Contacto[] agenda;
	
	private static final int TAMANIO_DEF = 10;
	
	public Agenda(){
		this.agenda = new Contacto[TAMANIO_DEF] ;
	}
	public Agenda(int tamanio){
		this.agenda = new Contacto[tamanio]; 
	}
	
	public void eliminarContacto(Contacto c){
		
		boolean existe = false;
		for(int i=0;i<agenda.length && !existe;i++){
			if (agenda[i] != null && c.getNombre().equals(agenda[i].getNombre())){
				agenda[i] = null;
				existe = true;
			}
		}
		if(existe){
			System.out.println("el telefono ha sido eliminado");
		}else{
			System.out.println("el telefono no se pudo eliminar");
		}
	}
	
	public void aniadirContacto(Contacto c){
		if(existeContacto(c)){
			System.out.println("el contacto ya esta en la agenda");
		}
		else if(agendaLlena()){
			System.out.println("no hay espacio en la agenda");
		}else{
			boolean encontradoHueco = false;
			
			for(int i=0;i< agenda.length && !encontradoHueco;i++){
				if(agenda[i] == null){
					agenda[i] = c;
					encontradoHueco = true;
				}
			}
			if (encontradoHueco){
				System.out.println("contacto guardado con exito");			
			}else{
				System.out.println("el contacto no se pudo guardar");	
			}
		}
	}
	
	public void buscaContacto(String nombre){
		
		boolean existe = false;
		
		for(int i=0;i<agenda.length && !existe;i++){
			if (agenda[i] != null && nombre.equals(agenda[i].getNombre())){
				System.out.println("el telefono es: "+agenda[i].getTelefono());
				existe = true;
			}
		}
		if(!existe){
			System.out.println("el telefono que busca no existe");
		}
	}
	
	public boolean agendaLlena(){
		
		boolean llena = true;
		
		if(huecosLibres()>0){
			llena = false;
		}
		return llena;
	}
	
	public boolean existeContacto(Contacto c){
		
		boolean existe = false;
		
		for(int i=0;i<agenda.length && !existe;i++){
			if (agenda[i] != null && c.getNombre().equals(agenda[i].getNombre())){
				existe = true;
			}
		}
		
		return existe;
	}
	
	public void listarContactos(){
		if (huecosLibres() == agenda.length){
			System.out.println("No hay contactos en la agenda");
		}else{
			for(int i=0;i<agenda.length;i++){
				if(agenda[i]!=null){
				System.out.println("nº "+ i +" "+ agenda[i].toString());
				}
			}
		}
	}
	
	public int huecosLibres(){
		int contadorLibres = 0;
		
		for(int i=0;i<agenda.length;i++){
			if(agenda[i]==null){
				contadorLibres++;
			}
		}
		return contadorLibres;
	}
}
