
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        double temp;
        // Graph is used as follows:
       while(true){
           System.out.print("Please enter a number:");
           temp=Double.parseDouble(reader.nextLine());
           if(temp<-30 || temp>40){
           }else{
           Graph.addNumber(temp);
           }
       }
        // Remove or comment out these lines above before trying to run the tests.
    }
}