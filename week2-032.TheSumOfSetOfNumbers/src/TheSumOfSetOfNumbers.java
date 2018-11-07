
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int what= reader.nextInt();
        int sum=0;
        for(int i=1; i<=what;i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
