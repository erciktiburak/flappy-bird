package classes;

import interfaces.Scoreable;

public class ScoreManager implements Scoreable {
    private int score;

    @Override
    public void increaseScore() {
        score++;
    }

    @Override
    public int getScore() {
        return score;
    }
}
