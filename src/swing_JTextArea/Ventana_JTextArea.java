package swing_JTextArea;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.ScrollPane;
import java.awt.FlowLayout;

public class Ventana_JTextArea extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_JTextArea frame = new Ventana_JTextArea();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_JTextArea() {
		setTitle("Ventana_JTextArea");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("");
		textArea.setBounds(64, 71, 4, 22);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(33, 35, 162, 185);
		contentPane.add(textArea_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(248, 35, 153, 185);
		contentPane.add(scrollPane);
		
		JTextArea textArea_2 = new JTextArea();
		scrollPane.setViewportView(textArea_2);
		
	}
}
