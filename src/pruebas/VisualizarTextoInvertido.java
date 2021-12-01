package pruebas;

import java.util.Scanner;

public class VisualizarTextoInvertido {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una palabra, por favor :");

        String palabra = sc.nextLine();
        char letra;
        int i;
        String cadena = "";
       
        for(i=palabra.length()-1;i>=0;i--)
        {
            letra=palabra.charAt(i);
           cadena = cadena + letra;
        sc.close();
  
        System.out.print(cadena);
        }
    }
}