
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bellia_2
 */
public class Team {

    private String name;
    private int maxSize = 16;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Team(String givenName) {
        this.name = givenName;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if(players.size()<maxSize)
            players.add(player);
    }

    public void printPlayers() {
        for (Player eachPlayer : players) {
            System.out.println(eachPlayer);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }

    public int goals() {
        int goals = 0;
        for (Player player : players) {
            goals = goals + player.goals();
        }
        return goals;
    }
}
