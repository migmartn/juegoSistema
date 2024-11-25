import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Partidas extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField s4;
    private JTextField s3;
    private JTextField s2;
    private JTextField s1;
    private JTextField f1;
    private JTextField f2;
    private JTextField ganador;
    private JTextField pt1;
    private JTextField pt2;
    private JTextField t1;
    private JTextField pt3;
    private JTextField pt4;
    private JTextField t2;
    private JButton btnNewButton_1;

    /**
     * Create the frame.
     */
    public Partidas() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 667, 571);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 255, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(56, 41, 86, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setEditable(false);
        textField_1.setBounds(56, 72, 86, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setEditable(false);
        textField_2.setBounds(56, 113, 86, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setEditable(false);
        textField_3.setBounds(56, 144, 86, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setEditable(false);
        textField_4.setBounds(56, 198, 86, 20);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        textField_5 = new JTextField();
        textField_5.setEditable(false);
        textField_5.setBounds(56, 229, 86, 20);
        contentPane.add(textField_5);
        textField_5.setColumns(10);

        textField_6 = new JTextField();
        textField_6.setEditable(false);
        textField_6.setBounds(56, 270, 86, 20);
        contentPane.add(textField_6);
        textField_6.setColumns(10);

        textField_7 = new JTextField();
        textField_7.setEditable(false);
        textField_7.setBounds(56, 301, 86, 20);
        contentPane.add(textField_7);
        textField_7.setColumns(10);

        s4 = new JTextField();
        s4.setBounds(166, 285, 86, 20);
        contentPane.add(s4);
        s4.setColumns(10);

        s3 = new JTextField();
        s3.setBounds(166, 212, 86, 20);
        contentPane.add(s3);
        s3.setColumns(10);

        s2 = new JTextField();
        s2.setBounds(166, 127, 86, 20);
        contentPane.add(s2);
        s2.setColumns(10);

        s1 = new JTextField();
        s1.setBounds(166, 57, 86, 20);
        contentPane.add(s1);
        s1.setColumns(10);

        f1 = new JTextField();
        f1.setBounds(264, 89, 86, 20);
        contentPane.add(f1);
        f1.setColumns(10);

        f2 = new JTextField();
        f2.setBounds(264, 249, 86, 20);
        contentPane.add(f2);
        f2.setColumns(10);

        ganador = new JTextField();
        ganador.setBounds(376, 167, 86, 20);
        contentPane.add(ganador);
        ganador.setColumns(10);

        pt1 = new JTextField();
        pt1.setBounds(264, 372, 86, 20);
        contentPane.add(pt1);
        pt1.setColumns(10);

        pt2 = new JTextField();
        pt2.setBounds(264, 403, 86, 20);
        contentPane.add(pt2);
        pt2.setColumns(10);

        t1 = new JTextField();
        t1.setBounds(362, 385, 86, 20);
        contentPane.add(t1);
        t1.setColumns(10);

        pt3 = new JTextField();
        pt3.setBounds(264, 456, 86, 20);
        contentPane.add(pt3);
        pt3.setColumns(10);

        pt4 = new JTextField();
        pt4.setBounds(264, 487, 86, 20);
        contentPane.add(pt4);
        pt4.setColumns(10);

        t2 = new JTextField();
        t2.setBounds(362, 466, 86, 20);
        contentPane.add(t2);
        t2.setColumns(10);

        JLabel lblNewLabel = new JLabel("TERCER LUGAR 1");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        lblNewLabel.setBounds(264, 347, 126, 14);
        contentPane.add(lblNewLabel);

        JLabel lblTercerLugar = new JLabel("TERCER LUGAR 2");
        lblTercerLugar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        lblTercerLugar.setBounds(264, 434, 126, 14);
        contentPane.add(lblTercerLugar);

        JLabel lblNewLabel_1 = new JLabel("ELIMINATORIAS");
        lblNewLabel_1.setBounds(56, 11, 99, 14);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("SEMIFINAL");
        lblNewLabel_2.setBounds(166, 26, 126, 14);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("FINAL");
        lblNewLabel_3.setBounds(281, 60, 46, 14);
        contentPane.add(lblNewLabel_3);
        
        lecturapersitente();

        JButton btnNewButton = new JButton("JUGAR");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jugar();
            }

            private void jugar() {
                JuegoDelGato j = new JuegoDelGato();
                j.setVisible(true);
                setVisible(false);
            }
        });
        btnNewButton.setBounds(53, 371, 89, 23);
        contentPane.add(btnNewButton);

        JButton btnGuardar = new JButton("Guardar y Bloquear");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarYBloquearCampos();
            }
        });
        btnGuardar.setBounds(53, 430, 150, 23);
        contentPane.add(btnGuardar);
        
        btnNewButton_1 = new JButton("MOSTRAR GANADORES");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		compararYDeterminar();
        		
                Ganadores g = new Ganadores();
                g.setVisible(true);
                setVisible(false);
        	}
        });
        btnNewButton_1.setBounds(56, 486, 147, 35);
        contentPane.add(btnNewButton_1);

        cargarNombres();
        
        lecturapersitente();
    }

    private void guardarYBloquearCampos() {
        // Aquí puedes agregar cualquier lógica para guardar los valores, por ejemplo, en un archivo o base de datos
        System.out.println("Valores guardados:");
        System.out.println("S1: " + s1.getText());
        System.out.println("S2: " + s2.getText());
        System.out.println("S3: " + s3.getText());
        System.out.println("S4: " + s4.getText());
        System.out.println("F1: " + f1.getText());
        System.out.println("F2: " + f2.getText());
        System.out.println("PT1: " + pt1.getText());
        System.out.println("PT2: " + pt2.getText());
        System.out.println("PT3: " + pt3.getText());
        System.out.println("PT4: " + pt4.getText());

        // Bloquear solo los campos que no están vacíos
        if (!s1.getText().isEmpty()) s1.setEditable(false);
        if (!s2.getText().isEmpty()) s2.setEditable(false);
        if (!s3.getText().isEmpty()) s3.setEditable(false);
        if (!s4.getText().isEmpty()) s4.setEditable(false);
        if (!f1.getText().isEmpty()) f1.setEditable(false);
        if (!f2.getText().isEmpty()) f2.setEditable(false);
        if (!pt1.getText().isEmpty()) pt1.setEditable(false);
        if (!pt2.getText().isEmpty()) pt2.setEditable(false);
        if (!pt3.getText().isEmpty()) pt3.setEditable(false);
        if (!pt4.getText().isEmpty()) pt4.setEditable(false);
        if (!t1.getText().isEmpty()) t1.setEditable(false);
        if (!t2.getText().isEmpty()) t2.setEditable(false);
        if (!ganador.getText().isEmpty()) ganador.setEditable(false);
        
        persistencia();
        
    }
    


    private void persistencia() {
    	String archivo = "per.txt";  // Archivo donde se escribirá
    	String frase = s1.getText()+"\n"+s2.getText()+"\n"+s3.getText()+"\n"+s4.getText()+"\n"+f1.getText()+"\n"+f2.getText()+
    	        "\n"+pt1.getText()+"\n"+pt2.getText()+"\n"+pt3.getText()+"\n"+pt4.getText()+"\n"+t1.getText()+"\n"+t2.getText()+
    	        "\n"+ganador.getText();  // Frase a escribir

    	// Cambiar `true` a `false` o eliminarlo para sobrescribir el archivo
    	try (FileWriter writer = new FileWriter(archivo)) {
    	    writer.write(frase + "\n");  // Escribir la frase seguida de un salto de línea
    	} catch (IOException e) {
    	    System.err.println("Error al escribir en el archivo: " + e.getMessage());
    	}

	}
    private void lecturapersitente(){
    	try {
            // Abre el archivo para lectura
            BufferedReader lector = new BufferedReader(new FileReader("per.txt"));
            String linea;
            int i = 0;

            // Array de JTextField para asignar automáticamente
            JTextField[] campos = { 
                s1, s2,s3, s4, 
                f1, f2, pt1, pt2,
                pt3,pt4,t1,t2,ganador
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

	private void cargarNombres() {
        try {
            // Abre el archivo para lectura
            BufferedReader lector = new BufferedReader(new FileReader("participantes.txt"));
            String linea;
            int i = 0;

            // Array de JTextField para asignar automáticamente
            JTextField[] campos = { 
                textField, textField_1, textField_2, textField_3, 
                textField_4, textField_5, textField_6, textField_7 
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
    
    
    private void compararYDeterminar() {
     // Obtener los valores de los campos de texto
        String ganadorValor = ganador.getText();  // Obtiene el valor del campo "ganador"
        String f1Valor = f1.getText();            // Obtiene el valor del campo "f1"
        String f2Valor = f2.getText();            // Obtiene el valor del campo "f2"
        String t1Valor = t1.getText();            // Obtiene el valor del campo "t1"
        String t2Valor = t2.getText();            // Obtiene el valor del campo "t2"


        // Determinar quién es el primer lugar y quién es el segundo
        String primerLugar = "";
        String segundoLugar = "";

        if (ganadorValor.equals(f1Valor)) {
            primerLugar = f1Valor;
            segundoLugar = f2Valor;
        } else if (ganadorValor.equals(f2Valor)) {
            primerLugar = f2Valor;
            segundoLugar = f1Valor;
        } else {
            // Si el valor de "ganador" no coincide con f1 ni f2
            primerLugar = "No válido";
            segundoLugar = "No válido";
        }

        
        
        String archivo = "resultados.txt";  // Archivo donde se escribirá
        String frase = ganadorValor+"\n"+segundoLugar+"\n"+t1Valor+"\n"+t2Valor;  // Frase a escribir

        try (FileWriter writer = new FileWriter(archivo, true)) {
            writer.write(frase + "\n");  // Escribir la frase seguida de un salto de línea
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
        
    
    
 }



   


    

    // Método principal (main)
    public static void main(String[] args) {
        // Ejecutar la interfaz gráfica en el hilo de eventos
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Crear y mostrar la ventana de Partidas
                    Partidas frame = new Partidas();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
