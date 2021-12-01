package swing_JTextArea;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ventana_JComboBox extends JFrame {

	private final static String RUTA = "\\C:\\Users\\Sergio\\Desktop\\fotos\\";
	private JPanel contentPane;
	private JTextField caja;
	private JLabel etiqueta1;
	private JLabel imagen;
	private JComboBox combo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Ventana_JComboBox frame = new Ventana_JComboBox();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		});
	
	}
	public Ventana_JComboBox() {
		setTitle("Ventana_JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		etiqueta1 = new JLabel("Seleccione una opcion");
		etiqueta1.setBounds(34, 9, 189, 14);
		contentPane.add(etiqueta1);

		caja = new JTextField();
		caja.setBounds(275, 34, 149, 20);
		contentPane.add(caja);
		caja.setColumns(10);
		imagen = new JLabel();
		imagen.setBounds(10, 78, 823, 344);
		contentPane.add(imagen);

		combo = new JComboBox();
		combo.setBounds(34, 34, 189, 20);
		combo.addItem("Desierto");
		combo.addItem("Koala");
		combo.addItem("Faro");
		contentPane.add(combo);
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String opcion = (String)combo.getSelectedItem();
				caja.setText("Esto es un "+opcion);
				imagen.setIcon(new ImageIcon(RUTA+opcion+".jpg"));
			}
		});

	}
}
	