package ejercicio_CCAA;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana_CCAA extends JFrame{
	
	public static final String[] CCAA = {"Andalucia", "Aragon", "Asturias", "Islas Baleares", "Islas Canarias", "Cantabria", "C. La Mancha", "Castilla y Leon",
"Cataluna", "Extremadura", "Galicia", "La Rioja", "Madrid", "Navarra", "Pais Vasco", "Murcia", "C. Valenciana","Ceuta","Melilla"}; 
    public static final String[] ANDALUCIA = {"Sevilla", "Huelva", "Cadiz", "Malaga", "Sevilla", "Cordoba", "Granada", "Jaen", "Almeria"};
    public static final String[] ARAGON = {"Zaragoza", "Huesca", "Zaragoza", "Teruel"};
    public static final String[] ASTURIAS = {"Oviedo", "Asturias"};
    public static final String[] BALEARES = {"Palma de Mallorca", "Baleares"};
    public static final String[] CANARIAS = {"Santa Cruz de Tenerife y Las Palmas de Gran Canarias", "Santa Cruz de Tenerife", "Las Palmas"};
    public static final String[] CANTABRIA = {"Santander", "Cantabria"};
    public static final String[] CASTILLALAMANCHA = {"Toledo", "Toledo", "Ciudad Real", "Albacete", "Cuenca", "Guadalajara"};
    public static final String[] CASTILLALEON = {"Valladolid", "Leon", "Zamora", "Salamanca", "Avila", "Valladolid", "Palencia", "Burgos", "Segovia", "Soria"};
    public static final String[] CATALUNIA = {"Barcelona", "Lerida", "Girona", "Barcelona", "Tarragona"};
    public static final String[] EXTREMADURA = {"Merida", "Caceres", "Badajoz"};
    public static final String[] GALICIA = {"Santiago de Compostela", "A Coruña", "Lugo", "Orense", "Pontevedra"};
    public static final String[] RIOJA = {"Logroño", "Rioja"};
    public static final String[] MADRID = {"Madrid", "Madrid"};
    public static final String[] NAVARRA = {"Pamplona", "Navarra"};
    public static final String[] PAISVASCO = {"Vitoria", "Guipuzcua", "Alava", "Vizcaya"};
    public static final String[] MURCIA = {"Murcia", "Murcia"};
    public static final String[] COMUNIDADVALENCIANA = {"Valencia", "Castellon", "Valencia", "Alicante"};
    public static final String[] CEUTA = {"Ceuta", "Ceuta"};
    public static final String[] MELILLA = {"Melilla", "Melilla"};
	
	private JList JLCCAA;
	private DefaultListModel modeloCCAA;
	private JList JLProv;
	private DefaultListModel modeloProv;
	private JPanel contentPane;
	private JTextField caja;

	public Ventana_CCAA() {
		
		setTitle("Ver Provincias");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 277);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLCCAA = new JList();
		
		JLCCAA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Provincia();
			}
		});
		
		JLCCAA.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "C.Autonomas", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		JLCCAA.setBounds(21, 34, 125, 190);
		
		modeloCCAA = new DefaultListModel();
		for (int i = 0;i<CCAA.length;i++){
			modeloCCAA.addElement(CCAA[i]);
		}
		JLCCAA.setModel(modeloCCAA);
		//contentPane.add(JLCCAA);
		
		JLProv = new JList();
		JLProv.setBorder(new TitledBorder(null, "Provincias", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		JLProv.setBounds(156, 34, 125, 190);
		modeloProv = new DefaultListModel();
		//contentPane.add(JLProv);
		
		caja = new JTextField();
		caja.setEditable(false);
		caja.setBounds(314, 190, 361, 34);
		getContentPane().add(caja);
		
		JLabel lblSeleccioneUnaCautonoma = new JLabel("seleccione una c.autonoma y una provincia para ver su capital");
		lblSeleccioneUnaCautonoma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccioneUnaCautonoma.setBounds(21, 0, 654, 34);
		contentPane.add(lblSeleccioneUnaCautonoma);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 34, 125, 190);
		scrollPane.setViewportView(JLCCAA);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(156, 34, 148, 190);
		scrollPane2.setViewportView(JLProv);
		contentPane.add(scrollPane2);
		
	}
	
	public void Provincia(){
		modeloProv.clear();
		caja.setText("");
        switch (JLCCAA.getSelectedIndex()) 
        {
            case 0: RellenarProvincias(ANDALUCIA);
            break;
            case 1: RellenarProvincias(ARAGON);
            break;
            case 2: RellenarProvincias(ASTURIAS);
            break;
            case 3: RellenarProvincias(BALEARES);
            break;
            case 4: RellenarProvincias(CANARIAS);
            break;
            case 5: RellenarProvincias(CANTABRIA);
            break;
            case 6: RellenarProvincias(CASTILLALAMANCHA);
            break;
            case 7: RellenarProvincias(CASTILLALEON);
            break;
            case 8: RellenarProvincias(CATALUNIA);
            break;
            case 9: RellenarProvincias(EXTREMADURA);
            break;
            case 10: RellenarProvincias(GALICIA);
            break;
            case 11: RellenarProvincias(RIOJA);
            break;
            case 12: RellenarProvincias(MADRID);
            break;
            case 13: RellenarProvincias(NAVARRA);
            break;
            case 14: RellenarProvincias(PAISVASCO);
            break;
            case 15: RellenarProvincias(MURCIA);
            break;
            case 16: RellenarProvincias(COMUNIDADVALENCIANA);
            break;
            case 17: RellenarProvincias(CEUTA);
            break;
            case 18: RellenarProvincias(MELILLA);
        }
	}
	
	public void RellenarProvincias(String[] p){
		
		for (int i = 1;i<p.length;i++){
			modeloProv.addElement(p[i].toString());
		}
		caja.setText(p[0].toString());
			JLProv.setModel(modeloProv);
	}
	
	public static void main(String[] args) {
		Ventana_CCAA v = new Ventana_CCAA();
		v.setVisible(true);
	}
}
