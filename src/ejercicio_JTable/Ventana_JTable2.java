package ejercicio_JTable;

	import java.awt.BorderLayout;
	import java.awt.Dimension;
	import java.awt.event.WindowAdapter;
	import java.awt.event.WindowEvent;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.ResultSetMetaData;
	import java.sql.SQLException;
	import java.sql.Statement;

	import javax.swing.JFrame;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.table.DefaultTableModel;

	public class Ventana_JTable2 extends JFrame {

	public Ventana_JTable2(){

	DefaultTableModel modelo = new DefaultTableModel();
	JTable tabla = new JTable(modelo);

	//Conectamos con la BD
	String url="jdbc:mysql://localhost:3306/pedidos";
	String usuario="root";
	String contrasenia="";
	Connection conexion = null;
	try { 
		 conexion = DriverManager.getConnection (url,usuario,contrasenia);
		 
		//Creamos una sentencia SQL
		Statement sentenciaSelect = conexion.createStatement();

		//Ejecutamos la sentencia
		ResultSet resultado = sentenciaSelect.executeQuery("SELECT * FROM articulo");

		ResultSetMetaData metaDatos = resultado.getMetaData();
		// Se obtiene el número de columnas.
		int numeroColumnas = metaDatos.getColumnCount();

		// Se crea un array de etiquetas para rellenar
		Object[] etiquetas = new Object[numeroColumnas];

		// Se obtiene cada una de las etiquetas para cada columna
		for (int i = 0; i < numeroColumnas; i++)
		{
		   // Nuevamente, para ResultSetMetaData la primera columna es la 1. 
		   etiquetas[i] = metaDatos.getColumnLabel(i + 1); 
		}

		modelo.setColumnIdentifiers(etiquetas);
		// Bucle para cada resultado en la consulta
		while (resultado.next())
		{
		   // Se crea un array que será una de las filas de la tabla. 
		   Object [] fila = new Object[numeroColumnas]; // Hay tres columnas en la tabla

		   // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
		   for (int i=0;i<numeroColumnas;i++)
		      fila[i] = resultado.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.

		   // Se añade al modelo la fila completa.
		   modelo.addRow(fila); 
		}

		tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));

		//Creamos un JscrollPane y le agregamos la JTable
		JScrollPane scrollPane = new JScrollPane(tabla);

		//Agregamos el JScrollPane al contenedor
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		//manejamos la salida
		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
		System.exit(0);
		}
		});
		//Finalmente, se liberan los recursos utilizados.
		resultado.close();
		sentenciaSelect.close();
		conexion.close();

	} catch (SQLException ex) { // Mantener el control sobre el tipo de error 
		System.out.println("SQLException: " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		Ventana_JTable2 frame = new Ventana_JTable2();
		frame.pack();
		frame.setVisible(true);
	}

}
