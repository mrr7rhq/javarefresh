
import java.io.File;
import java.io.FileNotFoundException;
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
public class Printer {
    private File file;
    private Scanner reader;
    
    public Printer(String filename)throws Exception{
        file= new File(filename);
        
    }
    
    public void printLinesWhichContain(String word) throws Exception{
        reader= new Scanner(file);
        String temp="";
        if(word.isEmpty()){
            while(reader.hasNext()){
                System.out.println(reader.nextLine());
            }
            
        }else{
            
            while(reader.hasNext()){
                temp=reader.nextLine();
                if(temp.contains(word)){

                    System.out.println(temp);
                }
                temp="";
                
            
        }}
        
        
    }
}
