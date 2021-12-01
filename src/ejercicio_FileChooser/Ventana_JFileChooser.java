package ejercicio_FileChooser;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.filechooser.*;

	public class Ventana_JFileChooser extends JFrame {
	 
	    private JPanel contentPane;
	    private JTextField textField;
	    private JTextArea textArea;
	    
	    public Ventana_JFileChooser() {
	    	 
	        //Parametros asociados a la ventana
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 450, 300);
	        contentPane = new JPanel();
	        contentPane.setLayout(null);
	        setContentPane(contentPane);
	 
	        textField = new JTextField();
	        textField.setToolTipText("Inserta la ruta del fichero de audio");
	        textField.setBounds(52, 26, 209, 20);
	        contentPane.add(textField);
	        textField.setColumns(10);
	 
	        JButton btnSeleccionar = new JButton("Seleccionar...");
	        btnSeleccionar.setBounds(288, 25, 109, 23);
	        contentPane.add(btnSeleccionar);
	 
	        textArea = new JTextArea();
	        textArea.setLineWrap(true);
	        textArea.setWrapStyleWord(true);
	        textArea.setBounds(52, 76, 360, 156);
	 
	        JScrollPane scroll=new JScrollPane(textArea);
	        scroll.setBounds(52, 76, 360, 156);
	        contentPane.add(scroll);

	        btnSeleccionar.addActionListener(new ActionListener(){
	            public void actionPerformed (ActionEvent e){
	 
	            //Creamos el objeto JFileChooser
	            JFileChooser fc=new JFileChooser();
	             
	            //Indicamos lo que podemos seleccionar
	            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	             
	            //Creamos el filtro
	            FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
	             
	            //Le indicamos el filtro
	            fc.setFileFilter(filtro);
	             
	            //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
	            int seleccion=fc.showOpenDialog(contentPane);
	          //Si el usuario, pincha en aceptar
	            if(seleccion==JFileChooser.APPROVE_OPTION){
	             
	                //Seleccionamos el fichero
	                File fichero=fc.getSelectedFile();
	             
	                //Ecribe la ruta del fichero seleccionado en el campo de texto
	                textField.setText(fichero.getAbsolutePath());
	             
	                try(FileReader fr=new FileReader(fichero)){
	                    String cadena="";
	                    int valor=fr.read();
	                    while(valor!=-1){
	                        cadena=cadena+(char)valor;
	                        valor=fr.read();
	                    }
	                    textArea.setText(cadena);
	                } catch (IOException e1) {
	                    e1.printStackTrace();
	                }
	            }            
	             }
	        });
	    }

	    /**
	     * Launch the application.
	     */
	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                Ventana_JFileChooser frame = new Ventana_JFileChooser();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }


}
