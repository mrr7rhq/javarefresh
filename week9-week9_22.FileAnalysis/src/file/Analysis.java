/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author feihua
 */
public class Analysis{
    private File file;
    
    public Analysis(File file){
        this.file=file;
        
    }
    
    public int lines(){
        int counter=0;
        try{
        Scanner reader= new Scanner(file);
        while(reader.hasNext()){
            reader.nextLine();
            counter++;
        }
        
        }catch(Exception e){
            e.getMessage();
        }
        return counter;
    }
    
    public int characters(){
        int number=0;
        try{
            number=(int)file.length();
        }catch(Exception e)
        {
            e.getMessage();
        }
       return number;
    }
    
    
}
