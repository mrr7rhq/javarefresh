
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int fst=reader.nextInt();
        System.out.println("Last: ");
        int last=reader.nextInt();
        int sum=0;
     
        for(int i=fst;i<=last;i++){
            sum=sum+i;
        }
        System.out.println("The sum is "+sum);
    }
}
