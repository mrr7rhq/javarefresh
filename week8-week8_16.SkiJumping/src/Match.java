
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author feihua
 */
public class Match {

    private int round = 0;
    private List<Jumper> jumperList;
    private List<Integer> voteList;
    private int length = 0;

    public Match() {
        jumperList = new ArrayList<Jumper>();
        voteList = new ArrayList<Integer>();
    }

    public int getRound() {
        return round + 1;
    }

    public void increaseRound() {
        round++;
    }

    public List<Jumper> getJumperList() {

        return jumperList;
    }

    public void addJumper(String name) {
        Jumper newJumper = new Jumper(name);
        jumperList.add(newJumper);
    }

    public void orderTheJumperByPoints() {
        Collections.sort(jumperList);
    }

    public int caculatePoints(int length, List<Integer> vote) {

        int points = 0;
        for (int i : vote) {
            points += i;
        }
        return points - Collections.max(vote)
                - Collections.min(vote) + length;

    }

    public int getLength() {

        Random rd = new Random();

        return rd.nextInt(61) + 60;
    }

    public List<Integer> getVote() {
        List<Integer> vote = new ArrayList<Integer>();
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            vote.add(rd.nextInt(11) + 10);
        }
        return vote;
    }

    public void printJumpingOrder() {
        for (int i = 0; i < jumperList.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + jumperList.get(i));
        }
        System.out.println("");
    }
}
