package ejercicioColas;

import java.util.LinkedList;

public class ColaCine extends LinkedList {
	//creamos el m�todo push donde por par�metro
		//insertamos el objeto de la posici�n 1 de la pila
		public void push (Object ticket){
			this.addFirst(ticket);
		}
		//Creamos el m�todo pop el cual elimina el �ltimo objeto 	//agregado a la pila
		public Object pop(){
			return this.removeLast();
		}

}
