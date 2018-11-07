import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a,sum=1;
        a=reader.nextInt();
        for(int i =1;i<=a;i++){
            sum=sum*i;
        }
        System.out.println("Factorial is "+sum);

    }
}
