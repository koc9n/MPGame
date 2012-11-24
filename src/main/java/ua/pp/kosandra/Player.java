package ua.pp.kosandra;

/**
 * Created with IntelliJ IDEA.
 * User: kos
 * Date: 24.11.12
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 */
public class Player {

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private String nick;

    private int health;

    private int score;
}
