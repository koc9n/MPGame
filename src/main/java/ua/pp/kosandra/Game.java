package ua.pp.kosandra;

/**
 * Created with IntelliJ IDEA.
 * User: kos
 * Date: 24.11.12
 * Time: 15:46
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    public boolean isFriendlyFire() {
        return friendlyFire;
    }

    public void setFriendlyFire(boolean friendlyFire) {
        this.friendlyFire = friendlyFire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    private String name;

    private Player playerOne;

    private Player playerTwo;

    private boolean friendlyFire;
}
