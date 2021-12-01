package ahorcado;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel_intermedio extends JPanel {
	
	public static int numErrores =0;
	private int numAciertos = 0;
	public JTextField tf1;
	public JTextField tf2;
	public JTextField tf3;
	public JTextField tf4;
	public JTextField tf5;
	public JTextField tf6;
	public JTextField tf7;
	public JTextField tf8;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf11;
	
	public Panel_intermedio(){
		setBackground(Color.WHITE);
		setLayout(null);
		
		tf1 = new JTextField();
		tf1.setHorizontalAlignment(SwingConstants.CENTER);
		tf1.setEditable(false);
		tf1.setBackground(Color.WHITE);
		tf1.setForeground(Color.WHITE);
		tf1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		tf1.setBounds(10, 11, 48, 80);
		add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setHorizontalAlignment(SwingConstants.CENTER);
		tf2.setEditable(false);
		tf2.setBackground(Color.WHITE);
		tf2.setForeground(Color.WHITE);
		tf2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		tf2.setBounds(68, 11, 48, 80);
		add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setHorizontalAlignment(SwingConstants.CENTER);
		tf3.setEditable(false);
		tf3.setBackground(Color.WHITE);
		tf3.setForeground(Color.WHITE);
		tf3.setFont(new Font("Tahoma", Font.PLAIN, 48));
		tf3.setColumns(10);
		tf3.setBounds(126, 11, 48, 80);
		add(tf3);
		
		tf4 = new JTextField();
		tf4.setHorizontalAlignment(SwingConstants.CENTER);
		tf4.setEditable(false);
		tf4.setBackground(Color.WHITE);
		tf4.setForeground(Color.WHITE);
		tf4.setFont(new Font("Tahoma", Font.PLAIN, 48));
		tf4.setColumns(10);
		tf4.setBounds(184, 11, 48, 80);
		add(tf4);
		
		tf5 = new JTextField();
		tf5.setHorizontalAlignment(SwingConstants.CENTER);
		tf5.setEditable(false);
		tf5.setBackground(Color.WHITE);
		tf5.setForeground(Color.WHITE);
		tf5.setFont(new Font("Tahoma", Font.PLAIN, 48));
		tf5.setColumns(10);
		tf5.setBounds(242, 11, 48, 80);
		add(tf5);
		
		tf6 = new JTextField();
		tf6.setHorizontalAlignment(SwingConstants.CENTER);
		tf6.setEditable(false);
		tf6.setBackground(Color.WHITE);
		tf6.setForeground(Color.WHITE);
		tf6.setFont(new Font("Tahoma", Font.PLAIN, 48));
		tf6.setColumns(10);
		tf6.setBounds(300, 11, 48, 80);
		add(tf6);
		
		tf7 = new JTextField();
		tf7.setHorizontalAlignment(SwingConstants.CENTER);
		tf7.setEditable(false);
		tf7.setBackground(Color.WHITE);
		tf7.setForeground(Color.WHITE);
		tf7.setFont(new Font("Tahoma", Font.PLAIN, 48));
		tf7.setColumns(10);
		tf7.setBounds(358, 11, 48, 80);
		add(tf7);
		
		tf8 = new JTextField();
		tf8.setHorizontalAlignment(SwingConstants.CENTER);
		tf8.setEditable(false);
		tf8.setBackground(Color.WHITE);
		tf8.setForeground(Color.WHITE);
		tf8.setFont(new Font("Tahoma", Font.PLAIN, 48));
		tf8.setColumns(10);
		tf8.setBounds(416, 11, 48, 80);
		add(tf8);
		
		tf9 = new JTextField();
		tf9.setHorizontalAlignment(SwingConstants.CENTER);
		tf9.setEditable(false);
		tf9.setBackground(Color.WHITE);
		tf9.setForeground(Color.WHITE);
		tf9.setFont(new Font("Tahoma", Font.PLAIN, 48));
		tf9.setColumns(10);
		tf9.setBounds(474, 11, 48, 80);
		add(tf9);
		
		
		tf10 = new JTextField();
		tf10.setHorizontalAlignment(SwingConstants.CENTER);
		tf10.setForeground(Color.WHITE);
		tf10.setBackground(Color.WHITE);
		tf10.setEditable(false);
		tf10.setFont(new Font("Tahoma", Font.PLAIN, 48));
		tf10.setColumns(10);
		tf10.setBounds(532, 11, 48, 80);
		add(tf10);
		
		tf11 = new JTextField();
		tf11.setHorizontalAlignment(SwingConstants.CENTER);
		tf11.setForeground(Color.WHITE);
		tf11.setBackground(Color.WHITE);
		tf11.setEditable(false);
		tf11.setFont(new Font("Tahoma", Font.PLAIN, 48));
		tf11.setColumns(10);
		tf11.setBounds(590, 11, 48, 80);
		add(tf11);
	}
	
	public void ponerPalabra(String palabra){
		
		for(int i=0;i<palabra.length();i++){
			switch(i){
			case 0:
				tf1.setText(String.valueOf(palabra.charAt(i)));
				visibilizarLetra(tf1);
				
				break;
			case 1:
				tf2.setText(String.valueOf(palabra.charAt(i)));
				visibilizarLetra(tf2);
				
				break;
			case 2:
				tf3.setText(String.valueOf(palabra.charAt(i)));
				visibilizarLetra(tf3);
				
				break;
			case 3:
				tf4.setText(String.valueOf(palabra.charAt(i)));
				visibilizarLetra(tf4);
				
				break;
			case 4:
				tf5.setText(String.valueOf(palabra.charAt(i)));
				visibilizarLetra(tf5);
				
				break;
			case 5:
				tf6.setText(String.valueOf(palabra.charAt(i)));
				visibilizarLetra(tf6);
				
				break;
			case 6:
				tf7.setText(String.valueOf(palabra.charAt(i)));
				visibilizarLetra(tf7);
				
				break;
			case 7:
				tf8.setText(String.valueOf(palabra.charAt(i)));
				visibilizarLetra(tf8);
				
				break;
			case 8:
				tf9.setText(String.valueOf(palabra.charAt(i)));
				visibilizarLetra(tf9);
				
				break;
			case 9:
				tf10.setText(String.valueOf(palabra.charAt(i)));
				visibilizarLetra(tf10);
				
				break;
			case 10:
				tf11.setText(String.valueOf(palabra.charAt(i)));
				visibilizarLetra(tf11);
				
				break;
			}
		}
	}
	
	public void visibilizarLetra(JTextField tf){
	    tf.setVisible(true);
	}
	
	public void limpiarLetras(){
		tf1.setText("");
		tf1.setVisible(false);
		tf1.setForeground(Color.WHITE);
		tf2.setText("");
		tf2.setVisible(false);
		tf2.setForeground(Color.WHITE);
		tf3.setText("");
		tf3.setVisible(false);
		tf3.setForeground(Color.WHITE);
		tf4.setText("");
		tf4.setVisible(false);
		tf4.setForeground(Color.WHITE);
		tf5.setText("");
		tf5.setVisible(false);
		tf5.setForeground(Color.WHITE);
		tf6.setText("");
		tf6.setVisible(false);
		tf6.setForeground(Color.WHITE);
		tf7.setText("");
		tf7.setVisible(false);
		tf7.setForeground(Color.WHITE);
		tf8.setText("");
		tf8.setVisible(false);
		tf8.setForeground(Color.WHITE);
		tf9.setText("");
		tf9.setVisible(false);
		tf9.setForeground(Color.WHITE);
		tf10.setText("");
		tf10.setVisible(false);
		tf10.setForeground(Color.WHITE);
		tf11.setText("");
		tf11.setVisible(false);
		tf11.setForeground(Color.WHITE);
		
	}
	
	public void comprobarLetras(int length, Panel_LetrasProbadas plp){
		
		boolean encontrada = false;
		
		String letra = plp.tf1.getText();
		
		for (int i=0; i < length; i++){
			switch(i){
			case 0: 
				if(tf1.getText().equalsIgnoreCase(letra)){
				tf1.setForeground(Color.BLACK);
				encontrada = true;
				numAciertos++;
			}
				break;
			case 1:
				if(tf2.getText().equals(letra)){
					tf2.setForeground(Color.BLACK);
					encontrada = true;
					numAciertos++;
				}
				break;
			case 2:
				if(tf3.getText().equals(letra)){
					tf3.setForeground(Color.BLACK);
					encontrada = true;
					numAciertos++;
				}
				break;
			case 3:
				if(tf4.getText().equals(letra)){
					tf4.setForeground(Color.BLACK);
					encontrada = true;
					numAciertos++;
				}
				break;
			case 4:
				if(tf5.getText().equals(letra)){
					tf5.setForeground(Color.BLACK);
					encontrada = true;
					numAciertos++;
				}
				break;
			case 5:
				if(tf6.getText().equals(letra)){
					tf6.setForeground(Color.BLACK);
					encontrada = true;
					numAciertos++;
				}
				break;
			case 6:
				if(tf7.getText().equals(letra)){
					tf7.setForeground(Color.BLACK);
					encontrada = true;
					numAciertos++;
				}
				break;
			case 7:
				if(tf8.getText().equals(letra)){
					tf8.setForeground(Color.BLACK);
					encontrada = true;
					numAciertos++;
				}
				break;
			case 8:
				if(tf9.getText().equals(letra)){
					tf9.setForeground(Color.BLACK);
					encontrada = true;
					numAciertos++;
				}
				break;
			case 9:
				if(tf10.getText().equals(letra)){
					tf10.setForeground(Color.BLACK);
					encontrada = true;
					numAciertos++;
				}
				break;
			case 10:
				if(tf11.getText().equals(letra)){
					tf11.setForeground(Color.BLACK);
					encontrada = true;
					numAciertos++;
				}
				break;
				
			}
			plp.tf1.setText("");
			
		}
		
		if(!encontrada){
			switch(numErrores){
			case 0:
				plp.tf8.setText(letra);
				plp.tf8.setForeground(Color.RED);
				numErrores++;
				break;
			case 1:
				plp.tf7.setText(letra);
				plp.tf7.setForeground(Color.RED);
				numErrores++;
				break;
			case 2:
				plp.tf6.setText(letra);
				plp.tf6.setForeground(Color.RED);
				numErrores++;
				break;
			case 3:
				plp.tf5.setText(letra);
				plp.tf5.setForeground(Color.RED);
				numErrores++;
				break;
			case 4:
				plp.tf4.setText(letra);
				plp.tf4.setForeground(Color.RED);
				numErrores++;
				break;
			case 5:
				plp.tf3.setText(letra);
				plp.tf3.setForeground(Color.RED);
				numErrores++;
				break;
			case 6:
				plp.tf2.setText(letra);
				plp.tf2.setForeground(Color.RED);
				numErrores++;
				break;
			case 7:
				plp.tf1.setText(letra);
				plp.tf1.setForeground(Color.RED);
				numErrores++;
				perder();
				break;
				
			}
			
		}
		
		if (numAciertos==length){
			ganar();
		}
	}
	
	public void perder(){
		int resp = JOptionPane.showConfirmDialog(null,"Has sido ahorcado =( , quieres volver a jugar?", 
				"QUESTION_MESSAGE", JOptionPane.YES_NO_OPTION);
		if (JOptionPane.YES_OPTION == resp){
			Ventana_Ahorcado.main(null);
		}else{
			System.exit(0);
		}
	}
	
	public void ganar(){
		int resp = JOptionPane.showConfirmDialog(null,"Enhorabuena, te has salvado!! =) , quieres volver a jugar?", 
				"QUESTION_MESSAGE", JOptionPane.YES_NO_OPTION);
		if (JOptionPane.YES_OPTION == resp){
			Ventana_Ahorcado.main(null);
		}else{
			System.exit(0);
		}
	}
	
	public static int nErrores(){
		return numErrores;
	}
	
	public void reset() 
	{
		numErrores=0;
		numAciertos=0;
	
	}
}
