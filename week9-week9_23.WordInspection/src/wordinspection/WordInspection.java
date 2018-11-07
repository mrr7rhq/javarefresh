/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author feihua
 */
public class WordInspection {

    private File file;
    private List<String> wordList;

    public WordInspection(File file) {
        this.file = file;
        wordList= new ArrayList<String>();
        try {
            Scanner reader = new Scanner(file, "UTF-8");
            while (reader.hasNext()) {
                wordList.add(reader.nextLine());
                
            }
        } catch (Exception e) {
            e.getMessage();
        }
        
        
    }

    public int wordCount() {

        
        return wordList.size();

    }
    public List<String> wordsContainingZ(){
        List<String> zList= new ArrayList<String>();
        for(String word:wordList){
            if(word.contains("z"))
                zList.add(word);
        }
        return zList;
        
    }
    
    public List<String> wordsEndingInL(){
        List<String> iList= new ArrayList<String>();
        for(String word:wordList){
            if(word.endsWith("l"))
                iList.add(word);
        }
        return iList;
        
    }
    
    public List<String> palindromes(){
        List<String> palindromeList= new ArrayList<String>();
        for(String word:wordList){
            if(word.equals(new StringBuffer(word).reverse().toString()))
                palindromeList.add(word);
        }
        return palindromeList;
        
    }
    
    public List<String> wordsWhichContainAllVowels(){
        List<String> allVowelsList= new ArrayList<String>();
        for(String word:wordList){
            if(word.contains("a") && word.contains("e") 
                    && word.contains("i") && word.contains("o") 
                    && word.contains("u") && word.contains("y") 
                    && word.contains("ä") && word.contains("ö"))
                allVowelsList.add(word);
                
        }
        return allVowelsList;
    }
    
    

}
