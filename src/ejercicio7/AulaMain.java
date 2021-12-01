package ejercicio7;

public class AulaMain {

	public static void visualizarNota(Aula aula){
		Alumno[] alumnos = new Alumno[Aula.MAXIMO_ALUMNOS];
		alumnos = aula.getAlumnos();
		
		int cantidadChicos = 0;
		int cantidadChicas = 0;
		
		
		for(int i = 0 ; i < alumnos.length ; i++){
			if(alumnos[i].getNota()>=5){
				if(alumnos[i].getSexo() == 'H'){
					cantidadChicos++;
				}else{
					cantidadChicas++;
				}
				System.out.println(alumnos[i].toString());
			}
		}
		System.out.println("Hay "+cantidadChicos+" chicos y "+cantidadChicas+" chicas aprobados");
	}
	
	public static void main(String[] args) {
	
		Aula aula = new Aula();
		
		if (aula.darClase()){
			visualizarNota(aula);
		}

	}

}
