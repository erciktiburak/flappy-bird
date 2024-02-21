import javax.swing.*;
import java.awt.*;
import classes.ScoreManager;
import interfaces.Scoreable;
import classes.Bird; // Import the Bird class

public class FlappyBirdGame extends JFrame {

    private Scoreable scoreManager = new ScoreManager();
    private Bird bird; // Declare a Bird object

    public FlappyBirdGame() {
        setTitle("Flappy Bird");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Set the window to full screen
        setUndecorated(true); // Remove window decorations (title bar, etc.)
        setLocationRelativeTo(null);

        // Create a new Bird object
        bird = new Bird(100, 300, 20, 20); // Example position and size

        JPanel gamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw the background
                g.setColor(Color.CYAN);
                g.fillRect(0, 0, getWidth(), getHeight());

                // Draw the bird
                bird.draw(g);

                // Draw the score at the top center of the screen
                g.setColor(Color.BLACK);
                g.setFont(new Font("Arial", Font.BOLD, 24));
                String scoreText = "Score: " + scoreManager.getScore();
                FontMetrics metrics = g.getFontMetrics();
                int x = (getWidth() - metrics.stringWidth(scoreText)) / 2;
                int y = metrics.getHeight();
                g.drawString(scoreText, x, y);
            }
        };

        add(gamePanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlappyBirdGame();
    }
}
