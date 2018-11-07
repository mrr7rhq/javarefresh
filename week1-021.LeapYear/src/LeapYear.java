
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int i=-1;
        int year=reader.nextInt();
        
            
            if(year%4==0){
                i=1;
                if(year%100==0){
                    if(year%400==0){
                        i=1;
                        
                    }else{
                        i=0;
                    }
                }   
                if(i==1){
                    System.out.println("The year is a leap year.");
                }else if(i==0){
                    System.out.println("The year is not a leap year.");
                }
          
                
            }else{
                System.out.println("The year is not a leap year.");
            }
            
        
        
       
    }           
    
}
