package ejercicioPilas;

import java.util.LinkedList;

public class PilaCDrom extends LinkedList {
	
	public void push (Object cdrom){
			this.addFirst(cdrom);
	}

public Object pop(){
	return this.removeFirst();
}
}
