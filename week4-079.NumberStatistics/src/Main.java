import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner reader= new Scanner(System.in);
       NumberStatistics stats = new NumberStatistics();
       NumberStatistics even= new NumberStatistics();
       NumberStatistics odd = new NumberStatistics();
       System.out.println("Type numbers:");
       int number=0;
       while((number = reader.nextInt())!=-1){
           if(number%2==0){
               stats.addNumber(number);
               even.addNumber(number);
           }else{
               stats.addNumber(number);
               odd.addNumber(number);
           }
              
       }
        System.out.println("sum: "+stats.sum());
        System.out.println("sum of even: "+even.sum());
        System.out.println("sumof odd: "+odd.sum());
    }
}
