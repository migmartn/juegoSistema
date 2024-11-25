import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ganadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel a;
	private JTextField g1;
	private JTextField g2;
	private JTextField g3;
	private JTextField g4;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ganadores frame = new Ganadores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ganadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 377);
		a = new JPanel();
		a.setBackground(new Color(255, 0, 0));
		a.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(a);
		a.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GANADORES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(179, 5, 249, 56);
		a.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\migue\\OneDrive\\Escritorio\\PLATA_1.png"));
		lblNewLabel_2.setBounds(30, 123, 141, 106);
		a.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\migue\\OneDrive\\Escritorio\\BRONCE.png"));
		lblNewLabel_3.setBounds(346, 140, 100, 100);
		a.add(lblNewLabel_3);
		
		g1 = new JTextField();
		g1.setEditable(false);
		g1.setBounds(215, 184, 86, 20);
		a.add(g1);
		g1.setColumns(10);
		
		g2 = new JTextField();
		g2.setEditable(false);
		g2.setBounds(36, 252, 86, 20);
		a.add(g2);
		g2.setColumns(10);
		
		g3 = new JTextField();
		g3.setEditable(false);
		g3.setBounds(356, 252, 86, 20);
		a.add(g3);
		g3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\migue\\OneDrive\\Escritorio\\BRONCE.png"));
		lblNewLabel_4.setBounds(493, 140, 100, 100);
		a.add(lblNewLabel_4);
		
		g4 = new JTextField();
		g4.setEditable(false);
		g4.setBounds(503, 252, 86, 20);
		a.add(g4);
		g4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\migue\\OneDrive\\Escritorio\\ORO_1.png"));
		lblNewLabel_1.setBounds(205, 72, 100, 100);
		a.add(lblNewLabel_1);
		
		btnNewButton = new JButton("REGRESAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro r = new registro();
				r.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(215, 304, 89, 23);
		a.add(btnNewButton);
		
		obtener();
	}

	private void obtener() {
	       try {
	            // Abre el archivo para lectura
	            BufferedReader lector = new BufferedReader(new FileReader("resultados.txt"));
	            String linea;
	            int i = 0;

	            // Array de JTextField para asignar automáticamente
	            JTextField[] campos = { 
	                g1,g2,g3,g4
	            };

	            // Leer línea por línea y asignar a los JTextField
	            while ((linea = lector.readLine()) != null && i < campos.length) {
	                campos[i].setText(linea);
	                i++;
	            }

	            lector.close();
	        } catch (IOException e) {
	            System.err.println("Error al leer el archivo: " + e.getMessage());
	        }
		
	}
	
	

}
