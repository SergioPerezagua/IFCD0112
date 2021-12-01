package swing_Menu;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Ventana_Menu extends JFrame implements ActionListener {

	public JMenuBar mb;
	public JMenu menu1, menu2, menu3;
	public JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8;
	private JPopupMenu popupMenu;
	private JMenu mnColoresBasicos;
	private JMenuItem mntmBlanco;
	private JMenuItem mntmGris;
	private JMenuItem mntmNegro;
	
	public Ventana_Menu() {
		super();
		configurarVentana();
		inicializarComponentes();
	}
	
	public void configurarVentana() {
	    this.setTitle("Ventana con JMenus");                    // colocamos titulo a la ventana
        this.setSize(300, 230);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        getContentPane().setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
	}
	
	public void inicializarComponentes() {
		
		mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Colores A");
        mb.add(menu1);
        mi1=new JMenuItem("Rojo");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2=new JMenuItem("Verde");
        mi2.addActionListener(this);
        menu1.add(mi2);
        mi3=new JMenuItem("Azul");
        mi3.addActionListener(this);
        menu1.add(mi3);
        
        menu2=new JMenu("Colores B");
        mb.add(menu2);
        mi4=new JMenuItem("Amarillo");
        mi4.addActionListener(this);
        menu2.add(mi4);
        mi5=new JMenuItem("Naranja");
        mi5.addActionListener(this);
        menu2.add(mi5);
        
        menu3=new JMenu("Colores Basicos");
        menu2.add(menu3);
        mi6=new JMenuItem("Blanco");
        mi6.addActionListener(this);
        menu3.add(mi6);               
        mi7=new JMenuItem("Gris");
        mi7.addActionListener(this);
        menu3.add(mi7);
        mi8=new JMenuItem("Negro");
        mi8.addActionListener(this);
        menu3.add(mi8);
        
        popupMenu = new JPopupMenu();
        addPopup(getContentPane(), popupMenu);
        
        mnColoresBasicos = new JMenu("Colores Basicos");
        popupMenu.add(mnColoresBasicos);
        
        mntmBlanco = new JMenuItem("Blanco");
        mnColoresBasicos.add(mntmBlanco);
        mntmBlanco.addActionListener(this);
        
        mntmGris = new JMenuItem("Gris");
        mnColoresBasicos.add(mntmGris);
        mntmGris.addActionListener(this);
        
        mntmNegro = new JMenuItem("Negro");
        mnColoresBasicos.add(mntmNegro);
        mntmNegro.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
	    Container f=this.getContentPane();
	       
	    String elemento = new String();
	    elemento = e.getActionCommand();  // devuelve el texto que tiene el boton
	
        switch (elemento){
        case "Rojo": f.setBackground(Color.red);
        break;
        case "Verde": f.setBackground(Color.green);
        break;
        case "Azul": f.setBackground(Color.blue);
        break;
        case "Amarillo": f.setBackground(Color.yellow);
        break;
        case "Naranja": f.setBackground(Color.orange);
        break;
        case "Blanco": f.setBackground(Color.white);
        break;
        case "Gris": f.setBackground(Color.gray);
        break;
        case "Negro": f.setBackground(Color.black);
        }
    }

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	public static void main (String[] args){
		Ventana_Menu v = new Ventana_Menu();
		v.setVisible(true);
	}
}
