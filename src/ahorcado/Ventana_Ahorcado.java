package ahorcado;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;

import utilidades.Utilidades;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana_Ahorcado extends JFrame {
	
	private String[] palabrasPrincipiante = {"Tiburon","Emblema","Ahorcado","Vidriera",
            "Elefante","Romboide","Kiwis","Dorado","Tarot","Tiburon","Descenso",
            "Mascara","Caballo","Quijote"};
	private String[] palabrasIntermedio = {"jabalinas","Edificio","Melocoton","Excalibur","Eucalipto",
            "Esdrujula","Murcielago"};
	private String[] palabrasAvanzado ={"absolutistas","damnificador","antimacrismo","antagonistas","absolutamente",
			"antepenúltimo","anafilácticos","meteorológico"};
	
	
	public static final String RUTA = "C:/Users/Sergio/workspace/IFCD_0112/src/fotos/";
	private JPanel panelPrincipal;
	private JMenuBar menuBar;
	private JMenu mnOpciones;
	private JMenu mnNiveles;
	private JMenuItem mntmPrincipiante;
	private JMenuItem mntmIntermedio;
	private JMenuItem mntmAvanzado;
	private JSeparator separator;
	private JMenuItem mntmSalir;
	private Panel_Principiante panelLetrasPrincipiante;
	private Panel_intermedio panelLetrasIntermedio;
	private Panel_Avanzado panelLetrasAvanzado;
	private JLabel lblPalabrasEscondidas;
	private Panel_LetrasProbadas panelLetrasProbadas;
	private JLabel lblPalabrasProbadas;
	//private JButton btnComprobar;
	public  JLabel lblImagen;
	private JLabel lblJuegoDelAhorcado;
	private String palabraElegida;
	
	
	public Ventana_Ahorcado(){
		super();
		configurarVentana();
		inicializarComponentes();	
	}
	
	public void configurarVentana(){
		setTitle("Ahorcado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 405);
		
		
	}
	
	public void inicializarComponentes(){
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		mnNiveles = new JMenu("Niveles");
		mnOpciones.add(mnNiveles);
		
		mntmPrincipiante = new JMenuItem("Principiante");
		mntmPrincipiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            	panelLetrasPrincipiante.limpiarLetras(); 
					palabraElegida = palabrasPrincipiante[Utilidades.generarNumeroAleatorio(0, palabrasPrincipiante.length-1)];
	                System.out.println(palabraElegida);
	                panelLetrasProbadas.setVisible(true);
	                panelLetrasPrincipiante.setVisible(true);
	                panelLetrasIntermedio.setVisible(false);
	                panelLetrasAvanzado.setVisible(false);
	                panelLetrasPrincipiante.ponerPalabra(palabraElegida);
	                vaciarPanel();
	                panelLetrasPrincipiante.resetErrores();
	                cambiarImagen();
			}
		});
		
		mnNiveles.add(mntmPrincipiante);
		
		mntmIntermedio = new JMenuItem("Intermedio");
		mntmIntermedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelLetrasIntermedio.limpiarLetras(); 
				palabraElegida = palabrasIntermedio[Utilidades.generarNumeroAleatorio(0, palabrasIntermedio.length-1)];
                System.out.println(palabraElegida);
                panelLetrasProbadas.setVisible(true);
                panelLetrasIntermedio.setVisible(true);
                panelLetrasPrincipiante.setVisible(false);
                panelLetrasAvanzado.setVisible(false);
                panelLetrasIntermedio.ponerPalabra(palabraElegida);
                vaciarPanel();
                panelLetrasIntermedio.reset();
                cambiarImagen();
			}
		});
		mnNiveles.add(mntmIntermedio);
		
		mntmAvanzado = new JMenuItem("Avanzado");
		mntmAvanzado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelLetrasAvanzado.limpiarLetras(); 
				palabraElegida = palabrasAvanzado[Utilidades.generarNumeroAleatorio(0, palabrasAvanzado.length-1)];
                System.out.println(palabraElegida);
                panelLetrasProbadas.setVisible(true);
                panelLetrasAvanzado.setVisible(true);
                panelLetrasPrincipiante.setVisible(false);
                panelLetrasIntermedio.setVisible(false);
                panelLetrasAvanzado.ponerPalabra(palabraElegida);
                vaciarPanel();
                panelLetrasAvanzado.reset();
                cambiarImagen();
			}
		});
		
		mnNiveles.add(mntmAvanzado);
		
		separator = new JSeparator();
		mnOpciones.add(separator);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		mnOpciones.add(mntmSalir);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.WHITE);
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		panelLetrasPrincipiante = new Panel_Principiante();
		panelLetrasPrincipiante.setBackground(Color.PINK);
		panelLetrasPrincipiante.setBounds(10, 67, 650, 100);
		panelPrincipal.add(panelLetrasPrincipiante);
		panelLetrasPrincipiante.setVisible(false);
		
		panelLetrasIntermedio = new Panel_intermedio();
		panelLetrasIntermedio.setBackground(Color.PINK);
		panelLetrasIntermedio.setBounds(10, 67, 650, 100);
		panelPrincipal.add(panelLetrasIntermedio);
		panelLetrasIntermedio.setVisible(false);
		
		panelLetrasAvanzado = new Panel_Avanzado();
		panelLetrasAvanzado.setBackground(Color.PINK);
		panelLetrasAvanzado.setBounds(10, 67, 650, 100);
		panelPrincipal.add(panelLetrasAvanzado);
		panelLetrasAvanzado.setVisible(false);
		
		lblPalabrasEscondidas = new JLabel("Palabras Escondidas");
		panelLetrasPrincipiante.add(lblPalabrasEscondidas);
		
		panelLetrasProbadas = new Panel_LetrasProbadas();
		panelLetrasProbadas.tf1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) 
                {
                	if (panelLetrasPrincipiante.isVisible()){
                		panelLetrasPrincipiante.comprobarLetras(palabraElegida.length(),panelLetrasProbadas);
                	
                	}else if(panelLetrasIntermedio.isVisible()){
                		panelLetrasIntermedio.comprobarLetras(palabraElegida.length(),panelLetrasProbadas);
                	
                	}else{
                		panelLetrasAvanzado.comprobarLetras(palabraElegida.length(),panelLetrasProbadas);
                	}
                    cambiarImagen();
                }
            }
        });
		panelLetrasProbadas.setBackground(Color.ORANGE);
		panelLetrasProbadas.setBounds(10, 178, 650, 100);
		panelPrincipal.add(panelLetrasProbadas);
		panelLetrasProbadas.setVisible(false);
		
		lblPalabrasProbadas = new JLabel("Palabras Probadas");
		panelLetrasProbadas.add(lblPalabrasProbadas);
		
		/*btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLetras.comprobarLetras(palabraElegida.length(),panelLetrasProbadas);
			}
		});
		btnComprobar.setBounds(360, 311, 107, 23);
		panelPrincipal.add(btnComprobar);*/
		
		lblImagen = new JLabel();
		lblImagen.setBackground(Color.BLACK);
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setBounds(684, 67, 173, 267);
		lblImagen.setVisible(true);
		cambiarImagen();
		panelPrincipal.add(lblImagen);
		
		
		
		
		lblJuegoDelAhorcado = new JLabel("JUEGO DEL AHORCADO");
		lblJuegoDelAhorcado.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblJuegoDelAhorcado.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuegoDelAhorcado.setBounds(10, 11, 847, 31);
		panelPrincipal.add(lblJuegoDelAhorcado);
	}
	public void vaciarPanel(){
		panelLetrasProbadas.tf1.setText("");
		panelLetrasProbadas.tf2.setText("");
		panelLetrasProbadas.tf3.setText("");
		panelLetrasProbadas.tf4.setText("");
		panelLetrasProbadas.tf5.setText("");
		panelLetrasProbadas.tf6.setText("");
		panelLetrasProbadas.tf7.setText("");
		panelLetrasProbadas.tf8.setText("");
	}
	public void cambiarImagen() {
        
		int numErrores = 0;
		
		if(panelLetrasPrincipiante.isVisible()){
			numErrores = panelLetrasPrincipiante.nErrores();
		}else if (panelLetrasIntermedio.isVisible()){
			numErrores = panelLetrasIntermedio.nErrores();
		}else{
			numErrores = panelLetrasAvanzado.nErrores();
		}
			ImageIcon fot = new ImageIcon(RUTA+numErrores+".png");
	        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), lblImagen.CENTER));
	        lblImagen.setIcon(icono);
	        this.repaint();
        
    }
	
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana_Ahorcado frame = new Ventana_Ahorcado();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
