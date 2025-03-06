package main.java.vector;

import java.util.Vector;

public class GameServer {
    private static Vector<String> players = new Vector<>();

    public static void addPlayer(String player) {
        players.add(player);
    }

    public static void removePlayer(String player) {
        players.remove(player);
    }

    public static void showPlayers() {
        System.out.println("Online Players: " + players);
    }

    public static void main(String[] args) {
        addPlayer("Player1");
        addPlayer("Player2");
        showPlayers();
    }
}
