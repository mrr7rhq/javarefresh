
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader= reader;
        this.dictionary=dictionary;
        
    }
    
    public void start(){
        System.out.println("Statement: ");
        System.out.println("    quit - quit the text user interface");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quits the text user interface\n");
        
        String command="";
        while(true){
            System.out.print("Statement: ");
            command=reader.nextLine();
            if(command.equals("quit")){
                System.out.println("Cheers!\n");
                break;
            }else if(command.equals("add"))
                    add();
            else if(command.equals("translate"))
                translate();
            
            
            
        }
    }
    
    public void translate(){
        String word="";
        System.out.print("Give a word: ");
        word=reader.nextLine();
        System.out.println("Translation: "+dictionary.translate(word));
        System.out.println("");
    }
    
    public void add(){
        String fin="";
        String en="";
        System.out.print("In Finnish: ");
        fin=reader.nextLine();
        System.out.print("Translation: ");
        en=reader.nextLine();
        dictionary.add(fin, en);
        System.out.println("");
    }
}
