import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuegoDelGato extends JFrame implements ActionListener {
    private JButton[][] botones = new JButton[3][3];
    private boolean turnoX = true;
    private JLabel etiquetaTurno;
    private int victoriasX = 0; // Contador de victorias de Jugador X
    private int victoriasO = 0; // Contador de victorias de Jugador O
    private int rondas = 0; // Contador de rondas
    public String ganador = ""; // Variable para almacenar el ganador del mejor de 3

    public JuegoDelGato() {
        setTitle("Juego del Gato - Mejor de 3");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para la cuadrícula
        JPanel panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(3, 3));

        // Crear botones para el tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j] = new JButton("");
                botones[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
                botones[i][j].setFocusable(false);
                botones[i][j].setBackground(Color.LIGHT_GRAY);
                botones[i][j].addActionListener(this);
                panelGrid.add(botones[i][j]);
            }
        }

        // Etiqueta para mostrar el turno actual
        etiquetaTurno = new JLabel("Turno de: Jugador X");
        etiquetaTurno.setFont(new Font("Arial", Font.BOLD, 20));
        etiquetaTurno.setHorizontalAlignment(SwingConstants.CENTER);

        // Añadir componentes al marco
        add(etiquetaTurno, BorderLayout.NORTH);
        add(panelGrid, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        if (!boton.getText().equals("")) {
            return;
        }

        // Asignar texto y color al botón según el turno
        if (turnoX) {
            boton.setText("X");
            boton.setBackground(Color.RED);
            etiquetaTurno.setText("Turno de: Jugador O");
        } else {
            boton.setText("O");
            boton.setBackground(Color.BLUE);
            etiquetaTurno.setText("Turno de: Jugador X");
        }

        turnoX = !turnoX;

        // Verificar si hay un ganador o empate
        if (hayGanador()) {
            if (turnoX) {
                victoriasO++;
                JOptionPane.showMessageDialog(this, "¡Felicidades, Jugador O ha ganado esta ronda!");
            } else {
                victoriasX++;
                JOptionPane.showMessageDialog(this, "¡Felicidades, Jugador X ha ganado esta ronda!");
            }
            rondas++;
            verificarMejorDeTres();
        } else if (esEmpate()) {
            JOptionPane.showMessageDialog(this, "¡Es un empate!");
            rondas++;
            verificarMejorDeTres();
        }
    }

    // Método para verificar si hay un ganador de 2 de 3 rondas
    private void verificarMejorDeTres() {
        if (victoriasX == 2) {
            ganador = "Jugador X"; // Asignar ganador
            JOptionPane.showMessageDialog(this, ganador + " gana el mejor de 3. ¡Felicidades!");
            reiniciarTodo();
        } else if (victoriasO == 2) {
            ganador = "Jugador O"; // Asignar ganador
            JOptionPane.showMessageDialog(this, ganador + " gana el mejor de 3. ¡Felicidades!");
            reiniciarTodo();
        } else if (rondas == 3) {
            // Determinar el ganador si se completan 3 rondas
            if (victoriasX > victoriasO) {
                ganador = "Jugador X";
            } else if (victoriasO > victoriasX) {
                ganador = "Jugador O";
            } else {
                ganador = "Empate";
            }
            JOptionPane.showMessageDialog(this, "El mejor de 3 terminó. Ganador: " + ganador);
            reiniciarTodo();
            
        } else {
            reiniciarJuego();
        }
    }

    private void Volver() {
		Partidas p = new Partidas();
		p.setVisible(true);
		setVisible(false);
		
	}

	// Método para verificar si hay un ganador
    private boolean hayGanador() {
        for (int i = 0; i < 3; i++) {
            if (botones[i][0].getText().equals(botones[i][1].getText()) &&
                botones[i][1].getText().equals(botones[i][2].getText()) &&
                !botones[i][0].getText().equals("")) {
                return true;
            }
            if (botones[0][i].getText().equals(botones[1][i].getText()) &&
                botones[1][i].getText().equals(botones[2][i].getText()) &&
                !botones[0][i].getText().equals("")) {
                return true;
            }
        }

        if (botones[0][0].getText().equals(botones[1][1].getText()) &&
            botones[1][1].getText().equals(botones[2][2].getText()) &&
            !botones[0][0].getText().equals("")) {
            return true;
        }

        if (botones[0][2].getText().equals(botones[1][1].getText()) &&
            botones[1][1].getText().equals(botones[2][0].getText()) &&
            !botones[0][2].getText().equals("")) {
            return true;
        }

        return false;
    }

    // Método para verificar si hay empate
    private boolean esEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botones[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    // Método para reiniciar el juego (sólo el tablero)
    private void reiniciarJuego() {
        turnoX = true;
        etiquetaTurno.setText("Turno de: Jugador X");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setText("");
                botones[i][j].setBackground(Color.LIGHT_GRAY);
            }
        }
    }

    // Método para reiniciar todo el juego
    private void reiniciarTodo() {
        victoriasX = 0;
        victoriasO = 0;
        rondas = 0;
        ganador = "";
        reiniciarJuego();
        Volver();
    }

    public static void main(String[] args) {
        new JuegoDelGato();
    }
}
