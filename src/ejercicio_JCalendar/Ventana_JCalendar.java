package ejercicio_JCalendar;


	import java.awt.*;
	import javax.swing.*;
	import com.toedter.calendar.JCalendar;
	import java.awt.event.*;
	import java.beans.PropertyChangeListener;
	import java.beans.PropertyChangeEvent;

	public class Ventana_JCalendar extends JFrame {

		private JPanel contentPane;
		private JTextField tfFecha;
		private JCalendar calendario;
		
		private int dia, mes, anio;

		public Ventana_JCalendar() {
		
			super();
			configurarVentana();
			inicializarComponentes();
			
		}
		
		public void configurarVentana(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			setContentPane(contentPane);
			contentPane.setLayout(null);
		}
		
		public void inicializarComponentes(){
			tfFecha = new JTextField();
			tfFecha.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			tfFecha.setForeground(Color.BLUE);
			tfFecha.setHorizontalAlignment(SwingConstants.CENTER);
			tfFecha.setBounds(94, 214, 275, 37);
			contentPane.add(tfFecha);
			

			calendario = new JCalendar();
			calendario.addPropertyChangeListener(new PropertyChangeListener() {
				public void propertyChange(PropertyChangeEvent arg0) {
					obtenerFecha();

					System.out.println("1.- " + calendario.getDate());
					System.out.println("Dia - " + calendario.getDayChooser().getDay());
					System.out.println("Mes - " + calendario.getMonthChooser().getMonth());
					System.out.println("Año - " + calendario.getYearChooser().getYear());
				}
			});
			calendario.setBounds(23, 23, 401, 180);
			contentPane.add(calendario);
			calendario.setTodayButtonVisible(true);
			calendario.setTodayButtonText("Hoy");
			
			
		}
		
		public void obtenerFecha(){
			String d, m;
			
			dia = calendario.getDayChooser().getDay();
			if (dia < 10){
				d = "0" + String.valueOf(dia);
			}else{
				d = String.valueOf(dia);
			}
			
			mes = calendario.getMonthChooser().getMonth() + 1;
			if (mes < 10){
				m = "0" + String.valueOf(mes);
			}else{
				m = String.valueOf(mes);
			}
			
			anio = calendario.getYearChooser().getYear();

			tfFecha.setText(anio +"-"+ m +"-"+ d);
		
		}
		
		public static void main(String[] args){
			Ventana_JCalendar ventana = new Ventana_JCalendar();
			ventana.setVisible(true);
	}
}


