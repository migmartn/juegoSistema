

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Inicio");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Establecemos un layout BorderLayout para asegurar que el botón ocupe el espacio disponible
        setLayout(new BorderLayout());

        // Crear el botón con color de fondo y texto personalizado
        JButton button = new JButton("Inicio");
        button.setBackground(new Color(00, 000, 000)); // Color azul
        button.setForeground(Color.white);             // Texto en blanco
        button.setFocusPainted(false);                 // Sin borde de enfoque al hacer clic
        button.setFont(new Font("Arial", Font.BOLD, 14)); // Fuente personalizada

        // Acción al hacer clic en el botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fadeOutAndOpenNewWindow(button);
            }
        });

        // Añadir el botón al centro del layout BorderLayout
        add(button, BorderLayout.CENTER);

        // Hacer visible la ventana
        setVisible(true);
    }

    private void fadeOutAndOpenNewWindow(JButton button) {
        Timer timer = new Timer(50, null);
        timer.addActionListener(new ActionListener() {
            float opacity = 1.0f;

            @Override
            public void actionPerformed(ActionEvent e) {
                opacity -= 0.05f;
                button.setOpaque(true); // Aseguramos que el fondo del botón se aplique correctamente
                button.setBackground(new Color(0, 0, 0, (int) (opacity * 255)));
                button.setForeground(new Color(0, 35, 102, (int) (opacity * 255)));

                if (opacity <= 0) {
                    timer.stop();
                    button.setVisible(false); // Ocultamos el botón al terminar el desvanecimiento
                    registro a = new registro();
                    a.setVisible(true);
                    setVisible(false);

                }
            }
        });
        timer.start();
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}


