
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author feihua
 */
public class TextInterface {

    Match match;
    Jumper jumper;

    public TextInterface() {
        match = new Match();
    }

    public void start(Scanner scanner) {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            match.addJumper(name);
        }

        System.out.println("");

        matchBegins(scanner);
    }

    public void matchBegins(Scanner scanner) {
        System.out.println("The tournament begins!");
        System.out.println("");

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit:");
            String action = scanner.nextLine();
            System.out.println("");
            if (action.equals("jump")) {
                System.out.println("Round " + match.getRound());
                System.out.println("");
                System.out.println("Jumping order:");
                match.orderTheJumperByPoints();
                match.printJumpingOrder();
                System.out.println("");

                result();
                match.increaseRound();
                System.out.println("");

            } else {
                break;
            }

        }

        ending();

    }

    public void result() {
        System.out.println("Results of round " + match.getRound());
        for (Jumper jumper : match.getJumperList()) {
            System.out.println("  " + jumper.getName());
            int length = match.getLength();
            List<Integer> vote = match.getVote();
            int points = match.caculatePoints(length, vote);
            jumper.addNewJump(points, length);
            System.out.println("    length: " + length);
            System.out.println("    judge votes: " + vote);

        }

    }

    public void ending() {
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        match.orderTheJumperByPoints();
        int i = 1;
        Collections.reverse(match.getJumperList());
        for (Jumper jp : match.getJumperList()) {
            System.out.println(i + "           " + jp);
            jp.printEachJumpDistance();
            i++;
        }
    }

}
