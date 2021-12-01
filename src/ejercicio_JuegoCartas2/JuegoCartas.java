package ejercicio_JuegoCartas2;

import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

import utilidades.Utilidades;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JuegoCartas extends JFrame{
	
	private static int cantidadYellow = 0;
	private static int cantidadRed = 0;
	private static int cantidadGreen = 0;
	private static int cantidadBlue = 0;
	
	private static int cantidadPulsados = 0;
	private static int conseguidos = 0;
	
	private JPanel contentPane;
	
	JToggleButton tglbtn1;
	JToggleButton tglbtn2;
	JToggleButton tglbtn3;
	JToggleButton tglbtn4;
	JToggleButton tglbtn5;
	JToggleButton tglbtn6;
	JToggleButton tglbtn7;
	JToggleButton tglbtn8;
	JToggleButton tglbtnAuxiliar;
	
	JLabel lblTitulo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try {
					JuegoCartas frame = new JuegoCartas();
					frame.setVisible(true);
					} 
				catch (Exception e) 
					{
					e.printStackTrace();
					}
			}
		});
	}
	
	public JuegoCartas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		tglbtn1 = new JToggleButton("");
		tglbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlPulsacion(tglbtn1);
			}
		});
		tglbtn1.setBounds(37, 49, 40, 40);
		getContentPane().add(tglbtn1);
		asignarColor(tglbtn1);
		
		tglbtn2 = new JToggleButton("");
		tglbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlPulsacion(tglbtn2);
			}
		});
		tglbtn2.setBounds(101, 49, 40, 40);
		getContentPane().add(tglbtn2);
		asignarColor(tglbtn2);
		
		tglbtn3 = new JToggleButton("");
		tglbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlPulsacion(tglbtn3);
			}
		});
		tglbtn3.setBounds(168, 49, 40, 40);
		getContentPane().add(tglbtn3);
		asignarColor(tglbtn3);
		
		tglbtn4 = new JToggleButton("");
		tglbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlPulsacion(tglbtn4);
			}
		});
		tglbtn4.setBounds(236, 49, 40, 40);
		getContentPane().add(tglbtn4);
		asignarColor(tglbtn4);
		
		tglbtn5 = new JToggleButton("");
		tglbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlPulsacion(tglbtn5);
			}
		});
		tglbtn5.setBounds(37, 139, 40, 40);
		getContentPane().add(tglbtn5);
		asignarColor(tglbtn5);
		
		tglbtn6 = new JToggleButton("");
		tglbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlPulsacion(tglbtn6);
			}
		});
		tglbtn6.setBounds(101, 139, 40, 40);
		getContentPane().add(tglbtn6);
		asignarColor(tglbtn6);
		
		tglbtn7 = new JToggleButton("");
		tglbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlPulsacion(tglbtn7);
			}
		});
		tglbtn7.setBounds(168, 139, 40, 40);
		getContentPane().add(tglbtn7);
		asignarColor(tglbtn7);
		
		tglbtn8 = new JToggleButton("");
		tglbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlPulsacion(tglbtn8);
			}
		});
		tglbtn8.setBounds(236, 139, 40, 40);
		getContentPane().add(tglbtn8);
		asignarColor(tglbtn8);
		
		lblTitulo = new JLabel("Juego de Memoria");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 11, 286, 27);
		contentPane.add(lblTitulo);

		voltearBotones();
	}
	
	private void asignarColor(JToggleButton tb)
    {
        boolean asignadoColor = false;

        do
        {
            int ale = Utilidades.generarNumeroAleatorio(1, 4);

            switch(ale)
            {
            case 1://Yellow
                if (cantidadYellow < 2)
                {
                    tb.setBackground(Color.YELLOW);
                    cantidadYellow++;
                    asignadoColor = true;
                }
                break;
            case 2://Red
                if (cantidadRed < 2)
                {
                    tb.setBackground(Color.RED);
                    cantidadRed++;
                    asignadoColor = true;
                }
                break;
            case 3://Green
                if (cantidadGreen < 2)
                {
                    tb.setBackground(Color.GREEN);
                    cantidadGreen++;
                    asignadoColor = true;
                }
                break;
            case 4://Blue
                if (cantidadBlue < 2)
                {
                    tb.setBackground(Color.BLUE);
                    cantidadBlue++;
                    asignadoColor = true;
                }
                break;
            }
        }while(!asignadoColor);

    }
	
	private void voltearBotones()
	{
		tglbtn1.setSelected(true);
		tglbtn2.setSelected(true);
		tglbtn3.setSelected(true);
		tglbtn4.setSelected(true);
		tglbtn5.setSelected(true);
		tglbtn6.setSelected(true);
		tglbtn7.setSelected(true);
		tglbtn8.setSelected(true);
	}

	private void controlPulsacion(JToggleButton tb) 
	{
		if (cantidadPulsados == 0) 
		{
			tglbtnAuxiliar = tb;
			cantidadPulsados++;
		}
		else
		{
			if(tb.getBackground() == tglbtnAuxiliar.getBackground() && (tglbtnAuxiliar!= tb)) 
			{
				tb.setVisible(false);
				tglbtnAuxiliar.setVisible(false);
				cantidadPulsados=0;
				conseguidos++;
			}
			else
			{
				voltearBotones();
				cantidadPulsados=0;
			}	
		}
		if (conseguidos == 4) 
		{
			JOptionPane.showMessageDialog(null, "Felicidades por completarlo","Enorabuena", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
}
