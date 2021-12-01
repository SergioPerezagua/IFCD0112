package ejercicio_JOptionPane;
	
	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JButton;
	import java.awt.Font;
	import java.awt.Color;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class Ventana_JOptionPane extends JFrame {

	private JPanel contentPane;
	private JButton btnQuestion;
	private JButton btnInformation;
	private JButton btnWarning;
	private JButton btnError;
	private JButton btnTerminar;


    public Ventana_JOptionPane() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }
    public void configurarVentana() {
        this.setTitle("Ventana con JMenus");      				// colocamos titulo a la ventana
        this.setSize(300, 310);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

	    /**
	     * Create the frame.
	     */
	    public void inicializarComponentes() {
		    contentPane = new JPanel();
		    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		    setContentPane(contentPane);
		    contentPane.setLayout(null);
	
		    btnQuestion = new JButton("JOptionPane Question");
		    btnQuestion.addActionListener(new ActionListener() {
	     
		    	public void actionPerformed(ActionEvent e) {
		    		int resp = JOptionPane.showConfirmDialog(null,"Llevas bien el SWING?", 
		    				"QUESTION_MESSAGE", JOptionPane.YES_NO_OPTION);

		    			if (JOptionPane.YES_OPTION == resp){
		    				JOptionPane.showMessageDialog(null, "ENHORABUENA",
		    						"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		    			}else{
		    				JOptionPane.showMessageDialog(null, "No te preocupes sigue estudiando",
		    						"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		    			}
		    		}
			    });
	    
	    btnQuestion.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnQuestion.setBounds(50, 25, 200, 25);
	    contentPane.add(btnQuestion);

	    btnInformation = new JButton("JOptionPane Information");
	    btnInformation.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    JOptionPane.showMessageDialog(null, "Este es un mensaje de Información",
	      "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	    }
	    });
	    
	    btnInformation.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnInformation.setBounds(50, 75, 200, 25);
	    contentPane.add(btnInformation);

	    btnWarning = new JButton("JOptionPane Warning");
	    btnWarning.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    JOptionPane.showMessageDialog(null, "Este es un mensaje de Advertencia",
	      "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
	    }
	    });
	    
	    btnWarning.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnWarning.setBounds(50, 125, 200, 25);
	    contentPane.add(btnWarning);

	    btnError = new JButton("JOptionPane Error");
	    btnError.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    JOptionPane.showMessageDialog(null, "Este es un mensaje de Error", 
	    "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
	    }
	    });
	    
	    btnError.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnError.setBounds(50, 175, 200, 25);
	    contentPane.add(btnError);

	    btnTerminar = new JButton("TERMINAR");
	    btnTerminar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    System.exit(0);
	    }
	    });
	    
	    btnTerminar.setForeground(Color.WHITE);
	    btnTerminar.setBackground(Color.RED);
	    btnTerminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnTerminar.setBounds(50, 225, 200, 25);
	    contentPane.add(btnTerminar);
	    }

	    public static void main(String[] args) {
	    Ventana_JOptionPane frame = new Ventana_JOptionPane();
	    frame.setVisible(true);
	    }
	}
