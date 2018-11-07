
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author feihua
 */
public class Jumper implements Comparable<Jumper> {

    private String name;
    private int points = 0;
    private List<Integer> distanceList;

    public Jumper(String name) {
        this.name = name;
        distanceList = new ArrayList<Integer>();
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

    public void addNewJump(int newPoints, int distance) {
        this.points += newPoints;
        distanceList.add(distance);
    }

    public String toString() {
        return this.name + " (" + this.points + " points)";
    }

    public void printEachJumpDistance() {
        System.out.print("            jump lengths: ");
        int i=0;
        for (int length : distanceList) {
            if(i==distanceList.size()-1){
                System.out.print(length + " m");
                
            }else
                System.out.print(length + " m, ");
                i++;
        }
        System.out.println("");

    }

    @Override
    public int compareTo(Jumper jp1) {
        return this.getPoints()-jp1.getPoints();

    }

}
