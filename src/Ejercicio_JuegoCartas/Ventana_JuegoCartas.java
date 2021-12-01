package Ejercicio_JuegoCartas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

import utilidades.Utilidades;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;

public class Ventana_JuegoCartas extends JFrame{
	
	private JPanel panelPrincipal;
	private int cantidadYellow = 0;
	private int cantidadRed = 0;
	private int cantidadBlue = 0;
	private int cantidadGreen = 0;
	private JToggleButton tglbtnNewToggleButton_1;
	private JToggleButton tglbtnNewToggleButton_2;
	private JToggleButton tglbtnNewToggleButton_3;
	private JToggleButton tglbtnNewToggleButton_4;
	private JToggleButton tglbtnNewToggleButton_5;
	private JToggleButton tglbtnNewToggleButton_6;
	private JToggleButton tglbtnNewToggleButton_7;
	private JToggleButton tglbtnNewToggleButton_8;
	
	public Ventana_JuegoCartas() {
		
		setTitle("Juego Cartas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 468);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblJuegoDeMemoria = new JLabel("Juego de memoria");
		lblJuegoDeMemoria.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblJuegoDeMemoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuegoDeMemoria.setBounds(0, 0, 679, 44);
		getContentPane().add(lblJuegoDeMemoria);
		
		tglbtnNewToggleButton_1 = new JToggleButton("");
		tglbtnNewToggleButton_1.setBounds(82, 119, 121, 121);
		getContentPane().add(tglbtnNewToggleButton_1);
		asignarColores(tglbtnNewToggleButton_1);
		
		tglbtnNewToggleButton_2 = new JToggleButton("");
		tglbtnNewToggleButton_2.setBounds(213, 119, 121, 121);
		getContentPane().add(tglbtnNewToggleButton_2);
		asignarColores(tglbtnNewToggleButton_2);
		
		tglbtnNewToggleButton_3 = new JToggleButton("");
		tglbtnNewToggleButton_3.setBounds(82, 251, 121, 121);
		getContentPane().add(tglbtnNewToggleButton_3);
		asignarColores(tglbtnNewToggleButton_3);
		
		tglbtnNewToggleButton_4 = new JToggleButton("");
		tglbtnNewToggleButton_4.setBounds(213, 251, 121, 121);
		getContentPane().add(tglbtnNewToggleButton_4);
		asignarColores(tglbtnNewToggleButton_4);
		
		tglbtnNewToggleButton_5 = new JToggleButton("");
		tglbtnNewToggleButton_5.setBounds(344, 119, 121, 121);
		getContentPane().add(tglbtnNewToggleButton_5);
		asignarColores(tglbtnNewToggleButton_5);
		
		tglbtnNewToggleButton_6 = new JToggleButton("");
		tglbtnNewToggleButton_6.setBounds(344, 251, 121, 121);
		getContentPane().add(tglbtnNewToggleButton_6);
		asignarColores(tglbtnNewToggleButton_6);
		
		tglbtnNewToggleButton_7 = new JToggleButton("");
		tglbtnNewToggleButton_7.setBounds(475, 119, 121, 121);
		getContentPane().add(tglbtnNewToggleButton_7);
		asignarColores(tglbtnNewToggleButton_7);
		
		tglbtnNewToggleButton_8 = new JToggleButton("");
		tglbtnNewToggleButton_8.setBounds(475, 251, 121, 121);
		getContentPane().add(tglbtnNewToggleButton_8);
		asignarColores(tglbtnNewToggleButton_8);
		
		voltearColores();
	}
	public void asignarColores(JToggleButton tb){
		
		int ale = Utilidades.generarNumeroAleatorio(1, 4);
		boolean asignarColor = false;
		
		do{
		switch(ale){
		case 1: if(cantidadBlue<2){
			tb.setBackground(Color.BLUE);
			cantidadBlue++;
			asignarColor = true;
		}
		break;
		case 2:if(cantidadGreen<2){
			tb.setBackground(Color.GREEN);
			cantidadGreen++;
			asignarColor = true;
		}
		break;
		case 3:if(cantidadRed<2){
			tb.setBackground(Color.RED);
			cantidadRed++;
			asignarColor = true;
		}
		break;
		case 4:if(cantidadYellow<2){
			tb.setBackground(Color.YELLOW);
			cantidadYellow++;
			asignarColor = true;
		}
		break;	
		}
		
		}while(!asignarColor);
	}
	
	public void voltearColores(){
		tglbtnNewToggleButton_1.setSelected(true);
		tglbtnNewToggleButton_2.setSelected(true);
		tglbtnNewToggleButton_3.setSelected(true);
		tglbtnNewToggleButton_4.setSelected(true);
		tglbtnNewToggleButton_5.setSelected(true);
		tglbtnNewToggleButton_6.setSelected(true);
		tglbtnNewToggleButton_7.setSelected(true);
		tglbtnNewToggleButton_8.setSelected(true);
	}
	public static void main (String[] args){
		Ventana_JuegoCartas v = new Ventana_JuegoCartas();
		v.setVisible(true);
	}
}
