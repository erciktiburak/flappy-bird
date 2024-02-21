import javax.swing.*;

import classes.ScoreManager;
import interfaces.Scoreable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlappyBirdGame extends JFrame {
    
    private Scoreable scoreManager = new ScoreManager();

    public FlappyBirdGame() {
        setTitle("Flappy Bird");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Set the window to full screen
        setUndecorated(true); // Remove window decorations (title bar, etc.)
        setLocationRelativeTo(null);

        JPanel gamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw the background
                g.setColor(Color.CYAN);
                g.fillRect(0, 0, getWidth(), getHeight());

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
