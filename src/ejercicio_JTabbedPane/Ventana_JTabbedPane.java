package ejercicio_JTabbedPane;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class Ventana_JTabbedPane extends JFrame {

	private static final Color red = Color.RED;
	private static final Color yellow = Color.YELLOW;
	private static final Color green = Color.GREEN;
	private static final Color blue = Color.BLUE;
	private static final Color orange = Color.ORANGE;
	private static final Color white = Color.WHITE;
	
	private Color[] colores = {red, yellow, green, blue, orange, white};
	private Color color;
	private String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
	
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	
	private JLabel et_p1;
	private JLabel et_p2;
	private JLabel et_p3;
	private JLabel et_p4;
	
	private JButton btnPosicionAleatoria;
	private JButton btnColorAleatorio;
	
	private JList list;
	private JScrollPane scroll;
	
	private JComboBox comboBox;
	
	private JTabbedPane pestanas;
	
	public Ventana_JTabbedPane() {
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		//Parametros asociados a la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		//setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
		setTitle("Ejemplo JTabbedPane - Pestanas");
	
		//Creamos el conjunto de pestanas
		pestanas=new JTabbedPane();
		pestanas.setBackground(Color.WHITE);
		//Creamos el panel y lo anadimos a las pestanas
		panel1=new JPanel();
		panel1.setLayout(null);

		//Componentes del panel1
		et_p1=new JLabel("Estas en el panel 1");
		et_p1.setBounds(99, 52, 200, 14);
		panel1.add(et_p1);

		//Anadimos un nombre de la pestana y el panel
		pestanas.addTab("Panel 1", panel1);

		btnPosicionAleatoria = new JButton("Posicion Aleatoria");
		btnPosicionAleatoria.setBounds(120, 102, 175, 23);
		btnPosicionAleatoria.addMouseListener(new MouseAdapter() {
		@Override
	public void mouseClicked(MouseEvent e) {
		et_p1.setBounds((int)(Math.random()*100), (int)(Math.random()*100), 200, 14);
		btnPosicionAleatoria.setBounds((int)(Math.random()*100), (int)(Math.random()*100), 175, 23);
		}
	});
		//btnPosicionAleatoria.setBounds(120, 102, 125, 23);
		panel1.add(btnPosicionAleatoria);
		//Realizamos lo mismo con el resto
		panel2=new JPanel();
		pestanas.addTab("Panel 2", panel2);
		panel2.setLayout(null);

		//Componentes del panel2
		et_p2=new JLabel("Estas en el panel 2");
		et_p2.setBounds(169, 5, 200, 14);
		panel2.add(et_p2);

		btnColorAleatorio = new JButton("Color Aleatorio");
		btnColorAleatorio.addMouseListener(new MouseAdapter() {
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int numero = (int)(Math.random()*6);
		color = colores[numero];
		panel2.setBackground(color);
		et_p2.setText("");
		et_p2.setText("Estas en el panel 2" + " - Color" + numero);
		}
	});
		btnColorAleatorio.setBounds(141, 94, 118, 23);
		panel2.add(btnColorAleatorio);
		panel3=new JPanel();
		panel3.setLayout(null);

		//Componentes del panel3
		et_p3=new JLabel("Estas en el panel 3");
		et_p3.setBounds(169, 5, 200, 14);
		panel3.add(et_p3);

		pestanas.addTab("Panel 3", panel3);

		list = new JList(diasSemana);

		scroll = new JScrollPane();
		scroll.setBounds(65, 81, 123, 91);
		scroll.setViewportView(list);
		panel3.add(scroll);
		panel4=new JPanel();
		panel4.setLayout(null);

		//Componentes del panel4
		et_p4=new JLabel("Estas en el panel 4");
		et_p4.setBounds(169, 5, 200, 14);
		panel4.add(et_p4);

		pestanas.addTab("Panel 4", panel4);

		comboBox = new JComboBox(diasSemana);
		comboBox.setBounds(148, 77, 127, 20);
		panel4.add(comboBox);

		getContentPane().add(pestanas);
		}
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_JTabbedPane frame = new Ventana_JTabbedPane();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
