
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String name;
       String studentNumber;
       Student student;
       String search;
       ArrayList<Student> studentList = new ArrayList<Student>();
       while(true){
           System.out.println("name: ");
           name=input.nextLine();
           if(name.isEmpty())
               break;
           else{
               
               System.out.println("studentnumber: ");
               studentNumber=input.nextLine();
               student=new Student(name,studentNumber);
               studentList.add(student);
           }
           
       }
      for(Student cell:studentList){
          System.out.println(cell.toString());
      }
        System.out.println("");
        System.out.println("");
      
        System.out.println("Give search term: ");
        search = input.nextLine();
       
        System.out.println("Result:");
        for(Student cell: studentList){
            
            if(cell.getName().contains(search)){
                
                System.out.println(cell.toString());
            }
                
        }
        
    }
}