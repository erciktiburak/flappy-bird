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
                // You can draw the game graphics (e.g., background, bird, pipes, etc.) inside this method
            }
        };

        add(gamePanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlappyBirdGame();
    }
}