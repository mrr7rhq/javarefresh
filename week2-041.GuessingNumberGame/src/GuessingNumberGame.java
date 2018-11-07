
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        System.out.print("Guess a number: ");
        int guess=reader.nextInt();
        int time=1;
        while(guess!=numberDrawn){
            if(guess<numberDrawn){
                System.out.println("The number is greater, guesses made: "+time);
                time++;
            }else{
                System.out.println("The number is lesser, guesses made: "+time);
                time++;
            }
            System.out.print("Guess a number: ");
            guess=reader.nextInt();
            
        }
        System.out.println("Congratulations, your guess is correct!");
        

        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
