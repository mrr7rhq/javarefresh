/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
/**
 *
 * @author feihua
 */
public class MindfulDictionary {
    private Map<String, String> dic;
    private File dicFile;
    private Scanner reader; 
    private FileWriter writer; 
    
    public MindfulDictionary(){
        dic = new HashMap<String, String>();   
    }
    
    public MindfulDictionary(String file){
        dic = new HashMap<String, String>();
         dicFile= new File(file);
           
       
        
       
        
    }
    
    public boolean load() {
        try{
           reader= new Scanner(dicFile);
            while(reader.hasNextLine()){
                String oneLine=reader.nextLine();
               
                String[] parts= oneLine.split(":");
                dic.put(parts[0], parts[1]);
            }
            return true;
        
        }catch(Exception e){
            
            e.printStackTrace();
            return false;
        }
        
        
    }
    
    public boolean save(){
        try{
         writer= new FileWriter(dicFile);
         
         for(Entry<String,String> oneEntry:dic.entrySet()){
             String oneLine=oneEntry.getKey()+":"+oneEntry.getValue();
             writer.write(oneLine);
             writer.write("\n");
             
         }
         writer.close();
         return true;
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
        
    }
    
    public void add(String word, String translation){
        if(!dic.containsKey(word) && !dic.values().contains(word))
            dic.put(word, translation);
    }
    
    public String translate(String word){
        String result=null;
        if(dic.containsKey(word))
            return dic.get(word);
        else if(dic.containsValue(word)){
            for(Entry<String,String> entry:dic.entrySet()){
                if(entry.getValue().equals(word))
                    result=entry.getKey();
                    
            }
        }
        return result;
            
    }
    
    public void remove(String word){
        String key=null;
       if(dic.containsKey(word))
            dic.remove(word);
        else if(dic.containsValue(word)){
            
            for(Entry<String,String> entry:dic.entrySet()){
                if(entry.getValue().equals(word))
                    key=entry.getKey();
                    
            }
            dic.remove(key);
        }
    }
}
