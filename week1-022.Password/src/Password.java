
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        System.out.println("Type the password: ");
         String psd=reader.nextLine();
        while(!psd.equals(password)){
            
      
            System.out.println("Wrong!");
            System.out.println("Type the password: ");
            psd = reader.nextLine();
        } 
        System.out.println("Right!");
        System.out.println("The secret is: sneakbar!");
        // Write your code here
    }
}
