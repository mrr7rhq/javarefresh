import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> arrlist= new ArrayList<String>();
        
        while(true){
            System.out.print("Type a word: ");
            String word=reader.nextLine();
            if(word.isEmpty()){
                break;
            }
            arrlist.add(word);
            
        }
        System.out.println("You typed the following words:");
       Collections.reverse(arrlist);
        for(String wd:arrlist)
            System.out.println(wd);
        // create here an ArrayList
    }
}
