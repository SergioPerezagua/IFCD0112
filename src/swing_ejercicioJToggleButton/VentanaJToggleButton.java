package swing_ejercicioJToggleButton;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class VentanaJToggleButton extends JFrame {
	
	private JToggleButton tbotonA;
    private JToggleButton tbotonB;
    private JToggleButton tbotonC;

    private ButtonGroup grupo;
    private JToggleButton tbotonD;
    private JToggleButton tbotonE;
    private JToggleButton tbotonF;
    
    public VentanaJToggleButton() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("Ventana con JToggleButton");                   // colocamos titulo a la ventana
        this.setSize(310, 210);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes.
        
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso.
    }
    
    private void inicializarComponentes() {
        // creamos los componentes
        tbotonA = new JToggleButton();
        tbotonB = new JToggleButton();
        tbotonC = new JToggleButton();
        grupo = new ButtonGroup();
        tbotonD = new JToggleButton();
        tbotonE = new JToggleButton();
        tbotonF = new JToggleButton();

        // configuramos los componentes
        tbotonA.setText("A");
        tbotonA.setBounds(50, 20, 50, 30);
        tbotonB.setText("B");
        tbotonB.setBounds(100, 20, 50, 30);
        tbotonC.setText("C");
        tbotonC.setBounds(150, 20, 50, 30);
        
        tbotonD.setText("D");
        tbotonD.setBounds(50, 80, 50, 30);
        tbotonE.setText("E");
        tbotonE.setBounds(100, 80, 50, 30);
        tbotonF.setText("F");
        tbotonF.setBounds(150, 80, 50, 30);
        //Botones que se quedan marcados independientes
        getContentPane().add(tbotonA);
        getContentPane().add(tbotonB);
        getContentPane().add(tbotonC);

        //Botones que se quedan marcados desmarcando el anterior
        grupo.add(tbotonD);
        grupo.add(tbotonE);
        grupo.add(tbotonF);
        getContentPane().add(tbotonD);
        getContentPane().add(tbotonE);
        getContentPane().add(tbotonF);
   }
    public static void main(String[] args) {
    VentanaJToggleButton V = new VentanaJToggleButton();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }

 

}
