
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word: "); 
        String word=reader.nextLine();
        
        while(true){
            if(words.contains(word)){
                System.out.println("You gave the word "+word+" twice");
                break;
            }
         words.add(word);    
        System.out.println("Tyoe a word: "); 
        word=reader.nextLine(); 
        }
        
              
        
        // create here the ArrayList 
        
    }
}
