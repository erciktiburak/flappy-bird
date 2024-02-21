package interfaces;

import java.awt.Graphics;
import java.awt.Rectangle;

public interface Birdable {
    void fly();
    void draw(Graphics g);
    Rectangle getBounds();
    boolean intersects(Rectangle r);
    // Other bird properties and behaviors
}
