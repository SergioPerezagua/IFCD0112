package ejercicio_Eventos;

	import java.awt.EventQueue;
	import javax.swing.*;
	import java.awt.event.*;
	import java.awt.Font;
	 
	public class Ventana_Eventos extends JFrame {
	 
	    private JPanel contentPane;
	    private JTextField textField;
	    private JTextField textField_1;
	    private JTextField textField_2;
	    private JComboBox comboBox;
	    private JRadioButton rdbtnOpcion;
	    private JRadioButton rdbtnOpcion_1;
	    private JRadioButton rdbtnOpcion_2;
	    private JLabel lblEstasSobreLa;
	    private JButton btnTerminar;
	    
	    public Ventana_Eventos() {
	    	 
	        //A�ade un titulo, no es estrictamente necesario
	        setTitle("Titulo de la ventana");
	 
	        /*
	         * Coordenadas x y de la aplicacion y su altura y longitud,
	         * si no lo indicamos aparecera una ventana muy peque�a
	         */
	        setBounds(400, 200, 655, 520);
	 
	        /*
	         * Indica que cuando se cierre la ventana se acaba la aplicacion,
	         * si no lo indicamos cuando cerremos la ventana la aplicacion seguira funcionando
	         */
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	 
	        //Hace visible la ventana, si no lo hacemos no veremos la aplicacion
	        setVisible(true);
	 
	        //Creamos el panel
	        contentPane =new JPanel();
	 
	        //Indicamos su dise�o
	        contentPane.setLayout(null);
	 
	        //asigno el pannel a la ventana
	        setContentPane(contentPane);

	    //Componentes
	    
        //Etiquetas
 
        JLabel lblEscribeElNombre = new JLabel("Escribe el nombre el nombre de una persona sin digitos");
        lblEscribeElNombre.setBounds(344, 27, 273, 25);
        contentPane.add(lblEscribeElNombre);
 
        JLabel lblEligeUnaOpcin = new JLabel("Elige una opcion:");
        lblEligeUnaOpcin.setBounds(176, 32, 109, 14);
        contentPane.add(lblEligeUnaOpcin);
 
        JLabel lblPulsaElBoton = new JLabel("Pulsa el boton");
        lblPulsaElBoton.setBounds(47, 32, 85, 14);
        contentPane.add(lblPulsaElBoton);
 
        lblEstasSobreLa = new JLabel("Estas sobre la ");
        lblEstasSobreLa.setBounds(158, 224, 192, 14);
        contentPane.add(lblEstasSobreLa);
 
        JLabel lblSoloSePuede = new JLabel("Solo se puede escribir digitos");
        lblSoloSePuede.setBounds(371, 208, 193, 14);
        contentPane.add(lblSoloSePuede);
 
        JLabel lblNombreElegido = new JLabel("Nombre Elegido");
        lblNombreElegido.setBounds(175, 124, 110, 14);
        contentPane.add(lblNombreElegido);
        //Campo de texto
        
        textField = new JTextField();
        textField.setBounds(371, 68, 193, 26);
        contentPane.add(textField);
 
        textField_1 = new JTextField();
        textField_1.setEditable(false);
        textField_1.setBounds(175, 150, 141, 20);
        contentPane.add(textField_1);
 
        textField_2 = new JTextField();
        textField_2.setBounds(371, 247, 126, 20);
        contentPane.add(textField_2);
 
        //Botones
 
        JButton btnPulsame = new JButton("Pulsame");
        btnPulsame.setBounds(43, 70, 89, 23);
        contentPane.add(btnPulsame);
 
        JButton btnAnadir= new JButton("Anadir");
        btnAnadir.setBounds(371, 124, 89, 23);
        contentPane.add(btnAnadir);
        //Botones de radio
        
        rdbtnOpcion= new JRadioButton("Opcion 1");
        rdbtnOpcion.setBounds(43, 194, 109, 23);
        contentPane.add(rdbtnOpcion);
 
        rdbtnOpcion_1 = new JRadioButton("Opcion 2");
        rdbtnOpcion_1.setBounds(43, 220, 109, 23);
        contentPane.add(rdbtnOpcion_1);
 
        rdbtnOpcion_2 = new JRadioButton("Opcion 3");
        rdbtnOpcion_2.setBounds(43, 246, 109, 23);
        contentPane.add(rdbtnOpcion_2);
 
        //Agrupamos los botnones de radio
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(rdbtnOpcion);
        bgroup.add(rdbtnOpcion_1);
        bgroup.add(rdbtnOpcion_2);
 
        //Menu de opciones
        comboBox = new JComboBox();
        comboBox.setBounds(175, 70, 141, 22);
        contentPane.add(comboBox);
        //A�adimos opciones
        comboBox.addItem("Fernando");
        comboBox.addItem("Alberto");
        comboBox.addItem("Arturo");
        
        btnTerminar = new JButton("TERMINAR");
        btnTerminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnTerminar.setIcon(new ImageIcon("C:\\Users\\prueba\\Downloads\\terminar(25x25).jpg"));
        btnTerminar.setBounds(10, 328, 619, 33);
        contentPane.add(btnTerminar);
 
        //Eventos

        btnTerminar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        System.exit(0);
        }
        });

        btnPulsame.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                JOptionPane.showMessageDialog(contentPane, "�Me has pulsado!");
            }
        });

        //En este caso hemos debido de converir el componente en un atributo
        comboBox.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                textField_1.setText((String)comboBox.getItemAt(comboBox.getSelectedIndex()));
            }
        });
 
        textField.addKeyListener(new KeyListener(){
            public void keyTyped (KeyEvent e){
                //Si el caracter introducido es un digito...
                if (Character.isDigit(e.getKeyChar())){
                    //... no lo escribe
                    e.consume();
                }
            }

@Override
public void keyPressed(KeyEvent e) {

}

@Override
public void keyReleased(KeyEvent e) {

}
});
        btnAnadir.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                comboBox.addItem(textField.getText());
                
                JOptionPane.showMessageDialog(contentPane, textField.getText() + " se a�adido al combobox.");
                textField.setText("");
            }
        });
 
        rdbtnOpcion.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
 
            }
            public void mouseEntered(MouseEvent e){
                lblEstasSobreLa.setText(lblEstasSobreLa.getText()+rdbtnOpcion.getText());
            }
            public void mouseExited(MouseEvent e){
                lblEstasSobreLa.setText("Estas sobre la ");
            }
            public void mousePressed(MouseEvent e){
 
            }
            public void mouseReleased(MouseEvent e){
 
            }
        });
        rdbtnOpcion_1.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
             }
            public void mouseEntered(MouseEvent e){
                lblEstasSobreLa.setText(lblEstasSobreLa.getText()+rdbtnOpcion_1.getText());
            }
            public void mouseExited(MouseEvent e){
                lblEstasSobreLa.setText("Estas sobre la ");
            }
            public void mousePressed(MouseEvent e){
             }
            public void mouseReleased(MouseEvent e){
             }
        });
 
        rdbtnOpcion_2.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
            }
            public void mouseEntered(MouseEvent e){
                lblEstasSobreLa.setText(lblEstasSobreLa.getText()+rdbtnOpcion_2.getText());
            }
            public void mouseExited(MouseEvent e){
                lblEstasSobreLa.setText("Estas sobre la ");
            }
            public void mousePressed(MouseEvent e){
            }
            public void mouseReleased(MouseEvent e){
            }
        });
        textField_2.addKeyListener(new KeyListener(){
            public void keyTyped (KeyEvent e){
                //Si el caracter introducido no es un digito...
                if (!Character.isDigit(e.getKeyChar())){
                    //... no lo escribe
                    e.consume();
                }
            }
            public void keyReleased(KeyEvent e){
            }
            public void keyPressed(KeyEvent e){
            }
        });
     }
    
public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana_Eventos frame = new Ventana_Eventos();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
