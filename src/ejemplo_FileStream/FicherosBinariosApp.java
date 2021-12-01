package ejemplo_FileStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FicherosBinariosApp {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\Sergio\\workspace\\IFCD_0112\\src\\ejemplo_FileStream\\fichero_bin")){
			
			String texto="Esto es una prueba para ficheros binarios";
			byte codigos[]=texto.getBytes();
			 
            fos.write(codigos);
 
        }catch(IOException e){
        	System.out.println("ERROR --> "+ e.getMessage());
		}
				

	}

}
