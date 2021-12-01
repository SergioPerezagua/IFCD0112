package Swing_JList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


	public class Ventana_JList extends JFrame {

		private JList lista;		// Estas acciones van juntas
		private DefaultListModel modelo;
		private JScrollPane scroll;
		private JTextField caja;
		private JPanel contentPane;
		private JLabel lbTexto1;

		private JButton btnAgregar;
		private JButton btnEliminar;
		private JButton btnVaciar;

		
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_JList frame = new Ventana_JList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	public Ventana_JList() {
		
		setTitle("Ventana con JList");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbTexto1 = new JLabel("Dato para agregar");
		lbTexto1.setBounds(36, 31, 164, 14);
		contentPane.add(lbTexto1);

		caja = new JTextField();
		caja.setBounds(36, 51, 182, 20);
		contentPane.add(caja);
		caja.setColumns(10);

		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				agregarDato();
				}
			});
		btnAgregar.setBounds(245, 50, 89, 23);
		contentPane.add(btnAgregar);

		lista = new JList();
//Permite seleccionar un unico elemento
		//lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
//Permite seleccionar un rango de elementos
		//lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION );
//Permite seleccionar varios rangos de elementos
		lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );

		modelo = new DefaultListModel();

		scroll = new JScrollPane();
		scroll.setBounds(36, 94, 182, 110);
		scroll.setViewportView(lista);
		contentPane.add(scroll);


		btnEliminar = new JButton("Eliminar");
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarDato(lista.getSelectedIndex());
			}
		});
		
		btnEliminar.setBounds(245, 109, 89, 23);
		contentPane.add(btnEliminar);
		btnVaciar = new JButton("Vaciar lista");
		
		btnVaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarLista();
			}
		});
		btnVaciar.setBounds(245, 165, 89, 23);
		contentPane.add(btnVaciar);
		}

	private void agregarDato() {
		String nombre=caja.getText();
		if(!nombre.equalsIgnoreCase("")){
			modelo.addElement(nombre);
			lista.setModel(modelo);
			caja.setText("");
			JOptionPane.showMessageDialog(null, "Dato añadido correctamente"
					,"", JOptionPane.INFORMATION_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null, "Debe escribir un dato para añadir"
					,"Error", JOptionPane.WARNING_MESSAGE);
		}
	}

	private void eliminarDato(int indice) {
		if (indice>=0) {
			modelo.remove(lista.getSelectedIndex());
		}else{
			JOptionPane.showMessageDialog(null, "Debe seleccionar un dato a eliminar"
					,"Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	private void borrarLista() {
		modelo.clear();
	}

}
