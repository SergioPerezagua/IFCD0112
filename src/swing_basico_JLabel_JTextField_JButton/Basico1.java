package swing_basico_JLabel_JTextField_JButton;

import java.awt.Color;

import javax.swing.JFrame;

public class Basico1 extends JFrame {


    public Basico1() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }
    
    private void configurarVentana() {
        this.setTitle("Esta Es Una Ventana");                   // colocamos titulo a la ventana
        this.setSize(500, 250);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);// centramos la ventana en la pantalla
        this.getContentPane().setBackground(Color.orange);      // asignar color al fondo de ventana
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(true);                               // hacemos que la ventana sea redimensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
 
    }	

	private void inicializarComponentes() {

    }

    public static void main(String[] args) {
    	
    	Basico V = new Basico();      // creamos una ventana
        V.setVisible(true);           // hacemos visible la ventana creadaate void configurarVentana() {
    	}
    }


