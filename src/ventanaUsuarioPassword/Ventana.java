package ventanaUsuarioPassword;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

public class Ventana extends JFrame{
	
	private JLabel texto1;
	private JLabel texto2;
	private JLabel texto3;

	
	private JTextField caja;
	private JPasswordField caja2;

	private JButton btnAceptar;
	private JButton btnLimpiar;
	
		public Ventana(){
			super();
			getContentPane().setForeground(new Color(0, 51, 51));
			configurarVentana();
			inicializarComponentes();
		}
		
		private void inicializarComponentes() {
			texto1 = new JLabel();
			texto1.setForeground(new Color(0, 51, 0));
			texto1.setBounds(109, 48, 68, 25);
			texto2 = new JLabel();
			texto2.setForeground(new Color(0, 51, 0));
			texto2.setBounds(104, 73, 73, 25);
			texto3 = new JLabel();
			texto3.setBounds(46, 174, 415, 25);
			
			caja = new JTextField();
			caja.setForeground(new Color(0, 51, 51));
			caja.setBounds(175, 50, 230, 25);
			caja2 = new JPasswordField();
			caja2.setEchoChar('•');
			caja2.setForeground(new Color(0, 51, 0));
			caja2.setBounds(175, 75, 230, 25);
			
			btnAceptar = new JButton();
			btnAceptar.setBounds(271, 141, 90, 30);
			btnAceptar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					texto3.setText("El usuario " + caja.getText() + " tiene la siguiente contraseña: " + caja2.getText());
					
				}
			});
			btnLimpiar = new JButton();
			btnLimpiar.setBounds(125, 141, 90, 30);
			btnLimpiar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					caja.setText("");
					caja2.setText("");
					texto3.setText("");
					
				}
				
			});
		
			texto1.setText("Usuario: ");
			texto1.setBackground(Color.WHITE);
			texto1.setFont(UIManager.getFont("Label.font"));
			
			texto2.setText("Password: ");
			texto2.setBackground(Color.WHITE);
			texto2.setFont(UIManager.getFont("Label.font"));
			
			texto3.setText("");
			texto3.setFont(new Font("Comic Sans MS",Font.BOLD,14));
			caja.setBackground(SystemColor.text);
			caja2.setBackground(SystemColor.text);
			
			btnAceptar.setText("Aceptar");
			
			btnLimpiar.setText("Limpiar");
			getContentPane().setLayout(null);
			
			getContentPane().add(texto1);
			getContentPane().add(texto2);
			getContentPane().add(texto3);
			getContentPane().add(caja);
			getContentPane().add(caja2);
			getContentPane().add(btnAceptar);
			getContentPane().add(btnLimpiar);
			
			
			
		}

		private void configurarVentana() {
			this.setTitle("Ventana con usuario y password.");
	        this.setSize(500, 250);
	        this.setLocationRelativeTo(null);
	        getContentPane().setBackground(SystemColor.menu);
	        this.setResizable(false);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
public static void main(String[] args) {
	Ventana ventana = new Ventana();
	ventana.setVisible(true);
	}
}
