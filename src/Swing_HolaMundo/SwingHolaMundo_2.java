package Swing_HolaMundo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class SwingHolaMundo_2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingHolaMundo_2 frame = new SwingHolaMundo_2();
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
	public SwingHolaMundo_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbletiqueta1 = new JLabel("Esta es mi nueva etiqueta");
		lbletiqueta1.setBounds(5, 5, 424, 22);
		lbletiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
		lbletiqueta1.setForeground(Color.RED);
		lbletiqueta1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		contentPane.add(lbletiqueta1);
		
		JLabel lblEtiqueta2 = new JLabel("otra etiqueta");
		lblEtiqueta2.setBounds(167, 38, 95, 28);
		lblEtiqueta2.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		lblEtiqueta2.setBackground(Color.WHITE);
		contentPane.add(lblEtiqueta2);
	}

}
