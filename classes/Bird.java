package classes;

import interfaces.Birdable;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bird implements Birdable {
    private int x, y; // Bird position
    private int width, height; // Bird dimensions
    private int velocity; // Bird's vertical velocity
    private static final int GRAVITY = 1; // Gravity force

    public Bird(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocity = 0; // Start with no vertical velocity
    }

    @Override
    public void fly() {
        velocity = -10; // Set velocity to move the bird upwards
    }

    @Override
    public void draw(Graphics g) {
        // Draw the bird
        g.setColor(Color.YELLOW); // Set bird color to yellow (for example)
        g.fillRect(x, y, width, height); // Draw a rectangle as the bird
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public boolean intersects(Rectangle r) {
        return getBounds().intersects(r);
    }

    public void update() {
        // Update the bird's position based on velocity
        y += velocity;
        // Apply gravity
        velocity += GRAVITY;
    }

    // Other bird properties and behaviors
}
