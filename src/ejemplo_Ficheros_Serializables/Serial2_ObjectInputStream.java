package ejemplo_Ficheros_Serializables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serial2_ObjectInputStream {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Persona p;
        
        try {
            fis = new FileInputStream("C:\\Users\\Sergio\\workspace\\IFCD_0112\\src\\ejemplo_Ficheros_Serializables\\Personas.dat");
            entrada = new ObjectInputStream(fis);

           while (fis.available() > 0){ // Chequea si el fichero (FileInputStream) tiene datos para ser leidos
            
           p = (Persona) entrada.readObject(); //es necesario el casting
         System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());

           } 
           
        } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            
        } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            
        } catch (IOException e) {
                System.out.println(e.getMessage());
            
        } finally {
                
        	try {
               	 
        		if (entrada != null) {
                   entrada.close();
                 }
                   if (fis != null) {
                       fis.close();
                   }
               	
        	} catch (IOException e) {
                               
        		System.out.println(e.getMessage());
               }
           }

   }               
}	
