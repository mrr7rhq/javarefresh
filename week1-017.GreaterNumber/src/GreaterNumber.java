import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int fst = reader.nextInt();
        System.out.println("Type the second number: ");
        int scd = reader.nextInt();
        if(fst<scd){
            System.out.println("Greater number: "+scd);
        }else if(fst>scd){
            System.out.println("Greater number: "+fst);
        }else if(fst==scd){
            System.out.println("The numbers are equal!");
        }

    }
}
