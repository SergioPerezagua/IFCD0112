package ahorcado;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Panel_LetrasProbadas extends JPanel {
	
	public JTextField tf1;
	public JTextField tf2;
	public JTextField tf3;
	public JTextField tf4;
	public JTextField tf5;
	public JTextField tf6;
	public JTextField tf7;
	public JTextField tf8;
	/**
	 * Create the panel.
	 */
	public Panel_LetrasProbadas() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		tf1 = new JTextField();
		tf1.setHorizontalAlignment(SwingConstants.CENTER);
		tf1.setFont(new Font("Tahoma", Font.PLAIN, 70));
		tf1.setBounds(10, 11, 70, 78);
		add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setHorizontalAlignment(SwingConstants.CENTER);
		tf2.setFont(new Font("Tahoma", Font.PLAIN, 70));
		tf2.setEditable(false);
		tf2.setBounds(90, 11, 70, 78);
		add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setHorizontalAlignment(SwingConstants.CENTER);
		tf3.setFont(new Font("Tahoma", Font.PLAIN, 70));
		tf3.setEditable(false);
		tf3.setColumns(10);
		tf3.setBounds(170, 11, 70, 78);
		add(tf3);
		
		tf4 = new JTextField();
		tf4.setHorizontalAlignment(SwingConstants.CENTER);
		tf4.setFont(new Font("Tahoma", Font.PLAIN, 70));
		tf4.setEditable(false);
		tf4.setColumns(10);
		tf4.setBounds(250, 11, 70, 78);
		add(tf4);
		
		tf5 = new JTextField();
		tf5.setHorizontalAlignment(SwingConstants.CENTER);
		tf5.setFont(new Font("Tahoma", Font.PLAIN, 70));
		tf5.setEditable(false);
		tf5.setColumns(10);
		tf5.setBounds(330, 11, 70, 78);
		add(tf5);
		
		tf6 = new JTextField();
		tf6.setHorizontalAlignment(SwingConstants.CENTER);
		tf6.setFont(new Font("Tahoma", Font.PLAIN, 70));
		tf6.setEditable(false);
		tf6.setColumns(10);
		tf6.setBounds(410, 11, 70, 78);
		add(tf6);
		
		tf7 = new JTextField();
		tf7.setHorizontalAlignment(SwingConstants.CENTER);
		tf7.setFont(new Font("Tahoma", Font.PLAIN, 70));
		tf7.setEditable(false);
		tf7.setColumns(10);
		tf7.setBounds(490, 11, 70, 78);
		add(tf7);
		
		tf8 = new JTextField();
		tf8.setHorizontalAlignment(SwingConstants.CENTER);
		tf8.setFont(new Font("Tahoma", Font.PLAIN, 70));
		tf8.setEditable(false);
		tf8.setColumns(10);
		tf8.setBounds(570, 11, 70, 78);
		add(tf8);

	}

}
