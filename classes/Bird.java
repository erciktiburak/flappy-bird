package classes;

import interfaces.Birdable;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Bird implements Birdable {
    private int x, y; // Bird position
    private int width, height; // Bird dimensions

    public Bird(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void fly() {
        // Bird flying operation
    }

    @Override
    public void draw(Graphics g) {
        // Draw the bird
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public boolean intersects(Rectangle r) {
        return getBounds().intersects(r);
    }

    // Other bird properties and behaviors
}
