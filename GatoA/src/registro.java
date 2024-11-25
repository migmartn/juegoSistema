import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nombres;
	private JTextArea participantes;
	private JButton btnIniciar;
	String[] arreglo = new String[8];
	int contador = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro frame = new registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Juego del gato");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(120, 11, 296, 56);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Registra los participantes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(34, 107, 240, 28);
		contentPane.add(lblNewLabel_1);

		nombres = new JTextField();
		nombres.setBounds(44, 155, 120, 20);
		contentPane.add(nombres);
		nombres.setColumns(10);

		participantes = new JTextArea();
		participantes.setEditable(false);
		participantes.setBounds(305, 111, 170, 218);
		contentPane.add(participantes);

		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contador < arreglo.length) {
					arreglo[contador] = nombres.getText();
					contador++;
					update();
					nombres.setText("");
					if (contador == arreglo.length) {
						btnIniciar.setEnabled(true);
					}
				} else {
					JOptionPane.showMessageDialog(registro.this, "Límite de participantes alcanzado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnAgregar.setBounds(52, 210, 89, 23);
		contentPane.add(btnAgregar);

		btnIniciar = new JButton("INICIAR");
		btnIniciar.setEnabled(false);
		btnIniciar.setBounds(200, 310, 100, 30);
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Escribir participantes en el archivo de texto
				escribirEnArchivo();
				
				// Lógica para abrir una nueva ventana
				// Aquí puedes crear una nueva instancia de tu ventana de juego
				// Ejemplo:
				 Partidas Partidas1 = new Partidas();
				 Partidas1.setVisible(true);

				
				 dispose();
			}
		});
		contentPane.add(btnIniciar);
	}

	protected void update() {
		StringBuilder lista = new StringBuilder();
		for (int i = 0; i < contador; i++) {
			lista.append(arreglo[i]).append("\n");
		}
		participantes.setText(lista.toString());
	}

	// Método para escribir en un archivo de texto
	// Método para escribir en un archivo de texto
	private void escribirEnArchivo() {
	    try {
	        // Usamos "./" para indicar que se escriba en la carpeta actual del proyecto
	        FileWriter escritor = new FileWriter("./participantes.txt");
	        
	        for (int i = 0; i < contador; i++) {
	            escritor.write(arreglo[i] + "\n");
	        }
	        
	        escritor.close();
	        System.out.println("Archivo creado exitosamente: participantes.txt");

	    } catch (IOException e) {
	        System.err.println("Error al escribir en el archivo: " + e.getMessage());
	    }
	}

}

