/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author feihua
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    
    private int counter=0;
    private Set<String> wordList;
    
    public PersonalDuplicateRemover(){
        wordList= new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if(!wordList.add(characterString))
            counter++;
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return counter;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return wordList;
    }

    @Override
    public void empty() {
        wordList.clear();
        counter=0;
    }
    
}
