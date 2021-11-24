package swing_calculadora;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana_Calculadora extends JFrame{
	
	private JPanel contentPane;
	private JTextField operador1;
	private JTextField operador2;
	private ButtonGroup grupo;
	private JLabel lblResultado;
	
	public Ventana_Calculadora() {
		
		
		setTitle("Calcuadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbsuma = new JRadioButton("SUMAR");
		rdbsuma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblResultado.setText(calcularSuma());
			}
		});
		rdbsuma.setBounds(319, 52, 109, 23);
		getContentPane().add(rdbsuma);
		
		JRadioButton rdbresta = new JRadioButton("RESTAR");
		rdbresta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblResultado.setText(calcularResta());
			}
		});
		rdbresta.setBounds(319, 78, 109, 23);
		getContentPane().add(rdbresta);
		
		JRadioButton rdbtmultiplicacion = new JRadioButton("MULTIPLICAR");
		rdbtmultiplicacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblResultado.setText(calcularMultiplicacion());
			}
		});
		rdbtmultiplicacion.setBounds(319, 104, 109, 23);
		getContentPane().add(rdbtmultiplicacion);
		
		JRadioButton rdbdividision = new JRadioButton("DIVIDIR");
		rdbdividision.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(operador2.getText().equals("0")){
					JOptionPane.showMessageDialog(null, "No se puede dividir entre 0"
							,"Error", JOptionPane.ERROR_MESSAGE);
					lblResultado.setText("ERROR");
					lblResultado.setForeground(Color.RED);
				}else{
					lblResultado.setText(calcularDivision());
				}
			}
		});
		rdbdividision.setBounds(319, 130, 109, 23);
		getContentPane().add(rdbdividision);
		
		grupo= new ButtonGroup();
		grupo.add(rdbsuma);
		grupo.add(rdbresta);
		grupo.add(rdbtmultiplicacion);
		grupo.add(rdbdividision);
		
		operador1 = new JTextField();
		operador1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if((caracter < '0')||(caracter > '9')&&(caracter!='\b')){
					e.consume();
				}
			}
		});
		operador1.setHorizontalAlignment(SwingConstants.CENTER);
		operador1.setBounds(23, 79, 86, 20);
		getContentPane().add(operador1);
		operador1.setColumns(10);
		
		operador2 = new JTextField();
		operador2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if((caracter < '0')||(caracter > '9')&&(caracter!='\b')){
					e.consume();
				}
			}
		});
		operador2.setHorizontalAlignment(SwingConstants.CENTER);
		operador2.setBounds(165, 79, 86, 20);
		getContentPane().add(operador2);
		operador2.setColumns(10);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(23, 130, 228, 97);
		getContentPane().add(lblResultado);
		
		JLabel lbltitulo = new JLabel("CALCULADORA");
		lbltitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setBounds(10, 11, 418, 29);
		getContentPane().add(lbltitulo);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				grupo.clearSelection();
				lblResultado.setText("");
				lblResultado.setForeground(Color.BLACK);
				operador1.setText("");
				operador2.setText("");
				
			}
		});
		btnLimpiar.setBounds(303, 160, 109, 67);
		contentPane.add(btnLimpiar);
	}
		public String calcularSuma(){
			String resultado;
			
			int op = Integer.parseInt(operador1.getText()) + Integer.parseInt(operador2.getText());
			if(op>=0){
				lblResultado.setForeground(Color.GREEN);
			}else{
				lblResultado.setForeground(Color.RED);
			}
			resultado = String.valueOf(op);
			return resultado;
		}
		public String calcularResta(){
			String resultado;
			int op = Integer.parseInt(operador1.getText()) - Integer.parseInt(operador2.getText());
			if(op>=0){
				lblResultado.setForeground(Color.GREEN);
			}else{
				lblResultado.setForeground(Color.RED);
			}
			resultado = String.valueOf(op);
			return resultado;
		}
		public String calcularMultiplicacion(){
			String resultado;
			int op = Integer.parseInt(operador1.getText()) * Integer.parseInt(operador2.getText());
			if(op>=0){
				lblResultado.setForeground(Color.GREEN);
			}else{
				lblResultado.setForeground(Color.RED);
			}
			resultado = String.valueOf(op);
			return resultado;
		}
		public String calcularDivision(){
			String resultado;
			double op = Double.parseDouble(operador1.getText()) / Double.parseDouble(operador2.getText());
			if(op>=0){
				lblResultado.setForeground(Color.GREEN);
			}else{
				lblResultado.setForeground(Color.RED);
			}
			resultado = String.valueOf(op);
			return resultado;
		}
	public static void main(String[] args) {
		Ventana_Calculadora v = new Ventana_Calculadora();
		v.setVisible(true);
	}
}
