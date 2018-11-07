
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first=reader.nextInt();
        System.out.println("Last: ");
        int second=reader.nextInt();
        if(second>=first){
            for(int i=first;i<=second;i++)
                System.out.println(i);
        }
        // write your code here

    }
}
