package swing_ejercicioJToggleButton;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ventana_JRadioButton extends JFrame{
	
	private JRadioButton cbOpcionA;
    private JRadioButton cbOpcionB;
    private JRadioButton cbOpcionC;

    private ButtonGroup grupo;
    private JRadioButton cbOpcionD;
    private JRadioButton cbOpcionE;
    private JRadioButton cbOpcionF;
   
    public Ventana_JRadioButton() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("Ventana con JRadioButton");                   // colocamos titulo a la ventana
        this.setSize(310, 210);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
    
    private void inicializarComponentes() {
        // creamos los componentes
	    cbOpcionA = new JRadioButton();
	    cbOpcionB = new JRadioButton();
	    cbOpcionC = new JRadioButton();
        grupo = new ButtonGroup();
        cbOpcionD = new JRadioButton();
        cbOpcionE = new JRadioButton();
        cbOpcionF = new JRadioButton();

        // configuramos los componentes
        cbOpcionA.setText("A");
        cbOpcionA.setBounds(50, 50, 50, 30);
        cbOpcionB.setText("B");
        cbOpcionB.setBounds(100, 50, 50, 30);
        cbOpcionC.setText("C");
        cbOpcionC.setBounds(150, 50, 50, 30);
        
        cbOpcionD.setText("D");
        cbOpcionD.setBounds(50, 100, 50, 30);
        cbOpcionE.setText("E");
        cbOpcionE.setBounds(100, 100, 50, 30);
        cbOpcionF.setText("F");
        cbOpcionF.setBounds(150, 100, 50, 30);
     // adicionamos los componentes a la ventana
        //Botones que se quedan marcados independientes
        getContentPane().add(cbOpcionA);
        getContentPane().add(cbOpcionB);
        getContentPane().add(cbOpcionC);
        //Botones que se quedan marcados desmarcando el anterior
        grupo.add(cbOpcionD);
        grupo.add(cbOpcionE);
        grupo.add(cbOpcionF);
        getContentPane().add(cbOpcionD);
        getContentPane().add(cbOpcionE);
        getContentPane().add(cbOpcionF);
   }


public static void main(String[] args) {
	Ventana_JRadioButton V = new Ventana_JRadioButton();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada

}
}
