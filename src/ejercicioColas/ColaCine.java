package ejercicioColas;

import java.util.LinkedList;

public class ColaCine extends LinkedList {
	//creamos el método push donde por parámetro
		//insertamos el objeto de la posición 1 de la pila
		public void push (Object ticket){
			this.addFirst(ticket);
		}
		//Creamos el método pop el cual elimina el último objeto 	//agregado a la pila
		public Object pop(){
			return this.removeLast();
		}

}
