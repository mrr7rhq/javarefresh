
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int point = reader.nextInt();
        int grade=0;
        if(0<=point && point<=29 ){
            grade=-1;
            
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
        if(grade==-1){
            System.out.println("Grade: failed");
        }else{
            System.out.println("Grade: "+grade);
        }

    }
}
