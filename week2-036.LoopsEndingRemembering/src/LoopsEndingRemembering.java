import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int a=reader.nextInt();
        double sum=0,count=0,average;
        int even=0,odd=0;
        while(a!=-1){
            sum=sum+a;
            count++;
            if(a%2==0){
                even++;
            }else{
                odd++;
            }
            a=reader.nextInt();
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+(int)sum);
        System.out.println("How many numbers: "+(int)count);
        average=sum/count;
        System.out.println("Average: "+ average);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
        
    }
}
