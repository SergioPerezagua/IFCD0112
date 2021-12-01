package ejemplo_FileStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Leer_de_FicherosBinstiosApp {

	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("C:\\Users\\Sergio\\workspace\\IFCD_0112\\src\\ejemplo_FileStream\\fichero_bin")){
			
		
			int valor = fis.read();
	        while(valor!=-1){
	            System.out.print((char)valor);
	            valor = fis.read();
        }

    	}catch (IOException e){
    		System.out.println("ERROR --> " + e.getMessage());
    	}
	}
}
