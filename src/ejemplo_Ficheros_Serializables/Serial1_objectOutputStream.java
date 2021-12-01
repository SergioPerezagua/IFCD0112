package ejemplo_Ficheros_Serializables;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial1_objectOutputStream {

	public static void main(String[] args) {
		FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Persona p;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("C:\\Users\\Sergio\\workspace\\IFCD_0112\\src\\ejemplo_Ficheros_Serializables\\Personas.dat");
            salida = new ObjectOutputStream(fos);
            //Se crea el primer objeto Persona
            p = new Persona("12345678A","Lucas González", 30);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
            //Se crea el segundo objeto Persona
            p = new Persona("98765432B","Anacleto Jiménez", 28);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
            //Se crea el tercer objeto Persona
            p = new Persona("78234212Z","María Zapata", 35);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);

	    } catch (FileNotFoundException e) {
        System.out.println("1"+e.getMessage());
    } catch (IOException e) {
        System.out.println("2"+e.getMessage());
    } finally {
        try {
    	if(salida!=null) salida.close();
        if(fos!=null) fos.close();
        } catch (IOException e) {
            System.out.println("3"+e.getMessage());
        	}
    	}
	}
}
