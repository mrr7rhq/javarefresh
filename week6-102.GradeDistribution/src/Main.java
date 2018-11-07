import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Integer> pointsList= new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
         System.out.println("Type exam scores, -1 completes:");
        int temp = scanner.nextInt();
        while(temp!=-1){
            if(temp>=0 && temp<=60){
            pointsList.add(temp);
            }
            temp=scanner.nextInt();
        }
        int[] gradeArray= new int[6];
        for(int points:pointsList){
            gradeArray[grade(points)]++;
            
        }
        System.out.println("Grade distribution:");
        for(int i=5;i>=0;i--){
            System.out.print(i+": ");
            for(int p=0; p<gradeArray[i];p++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Acceptance percentage: ");
        
        System.out.println(100*((pointsList.size()-gradeArray[0])/(double)pointsList.size()));
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
    }
   
    public static int grade(int point){
        int grade=0;
        if(0<=point && point<=29 ){
            grade=0;
            
        }else if(point>=30 && point<=34){
            grade=1;
        }else if(point>=35 && point<=39){
            grade=2;
        }else if(point>=40 && point<=44){
            grade=3;
        }else if(point>=45 && point<=49){
            grade=4;
        }else if(point>=50 && point<=60){
            grade=5;
        }
        return grade;
    }
}
