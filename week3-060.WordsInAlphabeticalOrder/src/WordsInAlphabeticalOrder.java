
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> al= new ArrayList<String>();
        while(true){
            System.out.print("Type a word: ");
            String word=reader.nextLine();
            if(word.isEmpty()){
                break;
            }
            al.add(word);
            
        }
        System.out.println("You typed the following words:");
        Collections.sort(al);
        for(String wd:al)
            System.out.println(wd);
        // create here an ArrayList
        
    }
}
