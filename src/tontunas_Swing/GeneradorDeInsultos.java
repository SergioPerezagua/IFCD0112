package tontunas_Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import utilidades.Utilidades;



public class GeneradorDeInsultos extends JFrame {
	
	String[] insultos = new String[]{"Gilipollas","Subnormal","Malparío","Sapo hijueputa","Locaelcoño","Mamayema","Comemierda",
            "Gonorrea","Carapolla","Mierdaseca","Carechimba","Boludo","filho da puta","Sanguijuela","Despojo humano",
            "soplanucas","muerdealmohadas","Mariconson","Bocachancla","tripasdehule","Asaltacunas","tuercebotas","Muerdemuelas",
            "Caramierda","Mameluco","cuerpoejcombro","Pecholata","Peinabombillas","CALVO!!!","Huelebragas","Mascachapas",
            "Mequetrefe","Soplagaitas","pagafantas","Monguer","Escuincle","Culicagao","Tragaaldabas","Zampabollos","Zarrapastroso"};
	
	JTextField txtNumeros;
	
	JComboBox comboBoxNumeros;

	JLabel lblTitulo; 
	
	JButton btnLimpiar;
	JButton btnNewButton;
	

    
	public GeneradorDeInsultos()
	{
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

	 private void configurarVentana() 
	    {
	        this.setTitle("Ventana con JToggleButton");                   // colocamos titulo a la ventana
	        this.setSize(1131, 410);                                 // colocamos tamanio a la ventana (ancho, alto)
	        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
	        getContentPane().setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
	        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
	    }
	    
	    private void inicializarComponentes() 
	    {
	        
	        
	        txtNumeros = new JTextField();
	        txtNumeros.setEditable(false);
	        txtNumeros.setHorizontalAlignment(SwingConstants.CENTER);
	        txtNumeros.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 50));
	        txtNumeros.setBorder(BorderFactory.createLineBorder(Color.gray, 0));
	        txtNumeros.setBounds(23, 80, 908, 105);
	        getContentPane().add(txtNumeros);
	        txtNumeros.setColumns(10);
	        
	        lblTitulo = new JLabel("GENERADOR DE INSULTOS ALEATORIOS");
	        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
	        lblTitulo.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 30));
	        lblTitulo.setBounds(23, 22, 1058, 30);
	        getContentPane().add(lblTitulo);
	        
	        btnLimpiar = new JButton("Limpiar");
	        btnLimpiar.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
	        btnLimpiar.addActionListener(new ActionListener() 
	        {
	        	public void actionPerformed(ActionEvent e) 
	        	{
	        		txtNumeros.setText("");
	        		
	        	}
	        });
	        btnLimpiar.setBounds(23, 302, 1051, 45);
	        getContentPane().add(btnLimpiar);
	        
	        comboBoxNumeros = new JComboBox();
	        comboBoxNumeros.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
	        comboBoxNumeros.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) 
	        	{
	        		rellenarTexbox();
	        	}
	        });
	        comboBoxNumeros.setModel(new DefaultComboBoxModel(new String[] {"Oscar", "Sergio", "Rosse"}));
	        comboBoxNumeros.setBounds(957, 106, 124, 79);
	        getContentPane().add(comboBoxNumeros);
	        
	        btnNewButton = new JButton("Nuevo insulto");
	        btnNewButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
	        btnNewButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) 
	        	{
	        		rellenarTexbox();
	        	}
	        });
	        btnNewButton.setBounds(23, 245, 1051, 45);
	        getContentPane().add(btnNewButton);
	        
	   }

	    public void rellenarTexbox()
	    {
	    	int num=Utilidades.generarNumeroAleatorio(0, insultos.length-1);

    		if (comboBoxNumeros.getSelectedIndex() == 2) 
    		{
    			txtNumeros.setText(comboBoxNumeros.getSelectedItem()+" es una "+insultos[num]);
    		}
    		else 
    		{
    			txtNumeros.setText(comboBoxNumeros.getSelectedItem()+" es un "+insultos[num]);
    		}
	    }
	    public static void main(String[] args) 
	    {
	    	GeneradorDeInsultos V = new GeneradorDeInsultos();      // creamos una ventana
	        V.setVisible(true);             // hacemos visible la ventana creada
	    }

}
