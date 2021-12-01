package ejercicio_JSlider;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.SwingConstants;

public class Ventana_JSlider extends JFrame{

		JLabel lrojo;
		JLabel lverde;
		JLabel lazul;
		JLabel lrojo2;
		JLabel lverde2;
		JLabel lazul2;
		JTextArea area;
		JSlider srojo;
		JSlider sverde;
		JSlider sazul;
		JTextField trojo;
		JTextField tverde;
		JTextField tazul;

		int r=0, g=0, b=0;


	    public Ventana_JSlider() {
	        super();                    // usamos el contructor de la clase padre JFrame
	        configurarVentana();        // configuramos la ventana
	        inicializarComponentes();   // inicializamos los atributos o componentes
	    }
	    private void configurarVentana() {
	        this.setTitle("Ventana con JSlider");                   // colocamos titulo a la ventana
	        this.setSize(1200, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
	        this.setLocationRelativeTo(null);// centramos la ventana en la pantalla
	        this.getContentPane().setBackground(Color.gray);      // asignar color al fondo de ventana
	        getContentPane().setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
	        this.setResizable(true);                               // hacemos que la ventana no sea redimiensionable
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
	    }

	    private void inicializarComponentes() {

	    lrojo = new JLabel("ROJO");
	    lrojo.setHorizontalAlignment(SwingConstants.CENTER);
	    lverde = new JLabel("VERDE");
	    lverde.setHorizontalAlignment(SwingConstants.CENTER);
	    lazul = new JLabel("AZUL");
	    
	    area = new JTextArea();
	    
	    srojo = new JSlider(JSlider.VERTICAL, 0, 255, 0);
	    sverde = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	    sazul = new JSlider(JSlider.VERTICAL, 0, 255, 0);

	    
	    area.setBounds(200, 200, 800, 200);
	    area.setBackground(new Color(r, g, b));
	    area.setEditable(false);
	    getContentPane().add(area);
	    
	    lrojo.setBounds(55, 100, 80, 30);
	    lrojo.setForeground(Color.white);
	    getContentPane().add(lrojo);
	    srojo.setBounds(145, 20, 50, 400);
	    srojo.setPaintTicks(true); //las rayitas que marcan los números
	    srojo.setMajorTickSpacing(25); // de cuanto en cuanto los números en el slider
	    srojo.setMinorTickSpacing(5); //las rayitas de cuanto en cuanto
	    srojo.setPaintLabels(true); //si se ve los números del slider
//		    srojo.setAlignmentY(CENTER_ALIGNMENT);
	    srojo.addChangeListener(new SliderListener());
	    getContentPane().add(srojo);

	    lverde.setBounds(244, 100, 700, 30);
	    lverde.setForeground(Color.white);
	    getContentPane().add(lverde);

	    sverde.setBounds(244, 139, 700, 50);
	    sverde.setPaintTicks(true); //las rayitas que marcan los números
	    sverde.setMajorTickSpacing(25); // de cuanto en cuanto los números en el slider
	    sverde.setMinorTickSpacing(5); //las rayitas de cuanto en cuanto
	    sverde.setPaintLabels(true); //si se ve los números del slider
//		    sverde.setAlignmentX(CENTER_ALIGNMENT);
	    sverde.addChangeListener(new SliderListener());
	    getContentPane().add(sverde);

	    lazul.setBounds(1070, 100, 80, 30);
	    lazul.setForeground(Color.white);
	    getContentPane().add(lazul);
	    sazul.setBounds(1010, 20, 50, 400);
	    sazul.setPaintTicks(true); //las rayitas que marcan los números
	    sazul.setMajorTickSpacing(25); // de cuanto en cuanto los números en el slider
	    sazul.setMinorTickSpacing(5); //las rayitas de cuanto en cuanto
	    sazul.setPaintLabels(true); //si se ve los números del slider
//		    sazul.setAlignmentY(CENTER_ALIGNMENT);
	    sazul.addChangeListener(new SliderListener());
	    getContentPane().add(sazul);
	    
	    lrojo2 = new JLabel("ROJO : ");
	    lrojo2.setBounds(350,450,100,30);
	    lrojo2.setForeground(Color.white);
	    getContentPane().add(lrojo2);

	    trojo = new JTextField();
	    trojo.setBounds(400, 450, 50, 30);
	    trojo.setEditable(false);
	    getContentPane().add(trojo);
	    
	    lverde2 = new JLabel("VERDE : ");
	    lverde2.setBounds(350,480,100,30);
	    lverde2.setForeground(Color.white);
	    getContentPane().add(lverde2);

	    tverde = new JTextField();
	    tverde.setBounds(400, 480, 50, 30);
	    tverde.setEditable(false);
	    getContentPane().add(tverde);

	    lazul2 = new JLabel("AZUL : ");
	    lazul2.setBounds(350,510,100,30);
	    lazul2.setForeground(Color.white);
	    getContentPane().add(lazul2);
	    tazul = new JTextField();
	    tazul.setBounds(400, 510, 50, 30);
	    tazul.setEditable(false);
	    getContentPane().add(tazul);

	    }

	    class SliderListener implements ChangeListener {

	        public void stateChanged(ChangeEvent e){
	        r = srojo.getValue();
	        g = sverde.getValue();
	        b = sazul.getValue();
	        
	        area.setBackground(new Color(r, g, b));
	        
	        trojo.setText(String.valueOf(r));

	        tverde.setText(String.valueOf(g));

	        tazul.setText(String.valueOf(b));
	        }

	    }
		    
		    public static void main(String[] args) {
		    Ventana_JSlider V = new Ventana_JSlider();      // creamos una ventana
		        V.setVisible(true);             // hacemos visible la ventana creada
		    }
}


