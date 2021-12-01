package swing_basico_JLabel_JTextField_JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import utilidades.Utilidades;

public class BasicoCon_JLabel_JTextField_Jbutton extends JFrame{
	
	private JLabel texto1;
	private JLabel texto2;
	
	private JTextField caja;
	
	private JButton btnAceptar;
	private JButton btnLimpiar;
	private JButton btnInsultoAleatorio;
	
	public BasicoCon_JLabel_JTextField_Jbutton(){
		super();
		configurarVentana();
		inicializarComponentes();
	}
	
	private void inicializarComponentes() {
		texto1 = new JLabel();
		texto2 = new JLabel();
		
		
		caja = new JTextField();
		
		btnAceptar = new JButton();
		btnAceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				texto2.setText(texto2.getText()+caja.getText());
				
			}
		});
		btnLimpiar = new JButton();
		btnLimpiar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				caja.setText("");
				texto2.setText("Hasta luego ");
				
			}
			
		});
		btnInsultoAleatorio= new JButton();
		btnInsultoAleatorio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				caja.setText(Utilidades.nombreAleatorio());
				
			}
			
		});
		
		texto1.setText("inserte nombre:  ");
		texto1.setBounds(47, 50, 131, 25);
		texto1.setOpaque(true);
		texto1.setBackground(Color.yellow);
		texto1.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		
		texto2.setText("Hasta luego ");
		texto2.setBounds(50, 175, 200, 25);
		texto2.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		
		caja.setBounds(175, 50, 100, 25);
		caja.setBackground(Color.PINK);
		
		btnAceptar.setText("Aceptar");
		btnAceptar.setBounds(287, 100, 100, 30);
		
		btnInsultoAleatorio.setText("Insulto Aleatorio");
		btnInsultoAleatorio.setBounds(276, 51, 140, 23);
		
		btnLimpiar.setText("Limpiar");
		btnLimpiar.setBounds(188, 100, 100, 30);
		
		getContentPane().add(texto1);
		getContentPane().add(texto2);
		getContentPane().add(caja);
		getContentPane().add(btnAceptar);
		getContentPane().add(btnLimpiar);
		
		
		
		getContentPane().add(btnInsultoAleatorio);
		
	}

	private void configurarVentana() {
		this.setTitle("Ventana con Etiquetas, cajas de texto y botones.");
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(255, 255, 153));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		BasicoCon_JLabel_JTextField_Jbutton ventana = new BasicoCon_JLabel_JTextField_Jbutton();
		ventana.setVisible(true);
				

	}
}
