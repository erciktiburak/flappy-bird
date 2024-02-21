import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlappyBirdGame extends JFrame {

    public FlappyBirdGame() {
        setTitle("Flappy Bird");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600); // Set the size of the game screen to 800x600 for example
        setLocationRelativeTo(null);

        // Create a JPanel for the game screen
        JPanel gamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw the background
                g.setColor(Color.CYAN);
                g.fillRect(0, 0, getWidth(), getHeight());

                // Draw the bird
                g.setColor(Color.YELLOW);
                g.fillRect(100, 300, 30, 30); // Example position and size for the bird
            }
        };

        add(gamePanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlappyBirdGame();
    }
}
