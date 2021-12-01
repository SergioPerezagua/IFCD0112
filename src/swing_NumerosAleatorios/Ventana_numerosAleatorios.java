package swing_NumerosAleatorios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import utilidades.Utilidades;
import java.awt.Font;
import java.awt.Color;

public class Ventana_numerosAleatorios extends JFrame {

	private JTextField caja;
	
	private ButtonGroup grupo;
	private JRadioButton cbOpcionA;
    private JRadioButton cbOpcionB;
    private JButton limpiar;
    private JTextField textField;
    
	public Ventana_numerosAleatorios(){
	    
	     super();                    // usamos el contructor de la clase padre JFrame
	        configurarVentana();        // configuramos la ventana
	        inicializarComponentes();   // inicializamos los atributos o componentes
	    }

	 private void configurarVentana() {
		 
		 	this.setTitle("Ventana con JRadioButton");                   // colocamos titulo a la ventana
	        this.setSize(310, 210);                                 // colocamos tamanio a la ventana (ancho, alto)
	        this.setLocationRelativeTo(null);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
	    }
	 private void inicializarComponentes() {
		 	
		 	cbOpcionA = new JRadioButton();
		 	cbOpcionA.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 11));
		 	cbOpcionA.setBounds(173, 40, 94, 30);
	 		cbOpcionB = new JRadioButton();
	 		cbOpcionB.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 11));
	 		cbOpcionB.setBounds(174, 73, 124, 30);
		 	grupo = new ButtonGroup();
		 	caja = new JTextField();
		 	caja.setBackground(Color.WHITE);
		 	caja.setForeground(Color.RED);
		 	caja.setEditable(false);
		 	caja.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		 	caja.setHorizontalAlignment(SwingConstants.CENTER);
		 	caja.setBounds(63, 58, 86, 30);
		 	caja.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
		 	limpiar = new JButton();
		 	limpiar.setToolTipText("Eliminar texto y seleccion");
		 	limpiar.setBackground(Color.WHITE);
		 	limpiar.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 11));
		 	limpiar.setBounds(32, 110, 236, 30);
		 	
		 	cbOpcionA.setText("del 0 al 99");
	        
	        cbOpcionB.setText("del 100 al 999");
	        
	        caja.setText("");
	        
	        limpiar.setText("Limpiar");
	        
	        grupo.add(cbOpcionA);
	        grupo.add(cbOpcionB);
	        
	        cbOpcionA.addActionListener(new ActionListener(){
	        	public void actionPerformed(ActionEvent arg0){
	        		caja.setText(String.valueOf(Utilidades.generarNumeroAleatorio(0, 99)));
	        	}
	        });
	        
	        cbOpcionB.addActionListener(new ActionListener(){
	        	public void actionPerformed(ActionEvent arg0){
	        		caja.setText(String.valueOf(Utilidades.generarNumeroAleatorio(100, 999)));
	        	}
	        });
	        
	        limpiar.addActionListener(new ActionListener(){
	        	public void actionPerformed(ActionEvent arg0){
	        		caja.setText("");
	        		grupo.clearSelection();
	        	}
	        });
	        getContentPane().setLayout(null);
	        getContentPane().add(cbOpcionA);
	        getContentPane().add(cbOpcionB);
	        getContentPane().add(caja);
	        getContentPane().add(limpiar);
	        
	        JLabel lblEtiqueta = new JLabel("GENERADOR DE NUMEROS ALEATORIOS");
	        lblEtiqueta.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 11));
	        lblEtiqueta.setHorizontalAlignment(SwingConstants.CENTER);
	        lblEtiqueta.setBounds(32, 11, 235, 14);
	        getContentPane().add(lblEtiqueta);
  
	 }
	 public static void main(String[] args){
		 Ventana_numerosAleatorios v = new Ventana_numerosAleatorios();
		 v.setVisible(true);
	 }
}
