package bingo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import utilidades.Utilidades;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_Bingo extends JFrame {
	private JTextField numerosBingo;
	private JButton btnSiguiente;
	private JPanel panelNumeros;
	private JPanel panelTablaNumeros;
	private JLabel lbl;
	
	public Ventana_Bingo(){
		super();
		setResizable(false);
		configurarVentana();
		inicializarComponentes();	
	}
	public void configurarVentana(){
		setTitle("Bingo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 400);
	}
	public void inicializarComponentes(){
		
		getContentPane().setLayout(null);
		
		panelNumeros = new JPanel();
		panelNumeros.setBounds(10, 111, 181, 250);
		getContentPane().add(panelNumeros);
		panelNumeros.setLayout(null);
		
		numerosBingo = new JTextField();
		numerosBingo.setHorizontalAlignment(SwingConstants.CENTER);
		numerosBingo.setFont(new Font("Tahoma", Font.PLAIN, 80));
		numerosBingo.setBounds(10, 11, 161, 131);
		panelNumeros.add(numerosBingo);
		numerosBingo.setColumns(10);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numero = Utilidades.generarNumeroAleatorio(1, 90);
				numerosBingo.setText(String.valueOf(numero));
				mostrarNumero(numero);
			}
		});
		btnSiguiente.setBounds(43, 200, 89, 23);
		panelNumeros.add(btnSiguiente);
		
		panelTablaNumeros = new JPanel();
		panelTablaNumeros.setBounds(201, 11, 500, 350);
		getContentPane().add(panelTablaNumeros);
		panelTablaNumeros.setLayout(null);
		
		int numero= 1;
		
		for (int x = 10; x <=250 ; x=x+30) 
        {
            for (int y = 10; y <=460 ; y=y+50) 
            {
                lbl = new JLabel("");
                lbl.setFont(new Font("Tahoma",Font.PLAIN,11));
                lbl.setHorizontalAlignment(SwingConstants.CENTER);
                lbl.setText(String.valueOf(numero));
                lbl.setBounds(y, x, 40, 20);
                lbl.setBackground(Color.PINK);
                lbl.setOpaque(true);
                panelTablaNumeros.add(lbl);
                numero++;
            }
        }
		
		JLabel lblBingo = new JLabel("BINGO");
		lblBingo.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblBingo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBingo.setBounds(10, 11, 181, 89);
		getContentPane().add(lblBingo);
	}
	public void mostrarNumero(int numeroObtenido){
		int numero= 1;
		for (int x = 10; x <=250 ; x=x+30) 
        {
            for (int y = 10; y <=460 ; y=y+50) 
            {
                lbl = new JLabel("");
                lbl.setFont(new Font("Tahoma",Font.PLAIN,11));
                lbl.setHorizontalAlignment(SwingConstants.CENTER);
                lbl.setText(String.valueOf(numero));
                lbl.setBounds(y, x, 40, 20);
                lbl.setBackground(Color.PINK);
                lbl.setOpaque(true);
                panelTablaNumeros.add(lbl);
                numero++;
            }
        }
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana_Bingo frame = new Ventana_Bingo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
	}
}
