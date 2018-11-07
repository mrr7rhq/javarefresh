
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            
        // Implement your program here. Remember to ask the input from user.
            System.out.print("Type a number: ");
            int fst= reader.nextInt();
            System.out.print("Type another number: ");
            int scd=reader.nextInt();
            float result=(float)fst/(float)scd;
           System.out.println("Division: "+fst+" / "+scd+" = "+result);
    }
}
