package Swing_HolaMundo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class HolaMundoSwing {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Ventana Hola Mundo");
		
		frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Hola Mundo 8===D");
		
		frame.getContentPane().add(label);
		
		frame.pack();
	
		frame.setBounds(10, 10, 200, 80);
			
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}

}
