package Tredive;

import java.util.ArrayList;

public class Game {
    private int gameNumber;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Game(int gameNumber) {
        this.players = players;
        this.gameNumber = gameNumber;
    }
    public void addPlayer(Player player) {
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
