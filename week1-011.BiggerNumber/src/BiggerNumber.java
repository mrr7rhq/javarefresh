
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
           System.out.println("Type a number : ");
           int fst= reader.nextInt();
           System.out.println("Type another number : ");
           int scd = reader.nextInt();
           System.out.println("The bigger number of the two number given was: "+
                   Math.max(scd,fst));
        // Implement your program here. Remember to ask the input from user
    }
}
