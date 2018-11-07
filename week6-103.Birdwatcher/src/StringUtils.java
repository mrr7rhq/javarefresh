/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bellia_2
 */
public class StringUtils {
    public static boolean included(String word,String searched){
        if(word.isEmpty() || searched.isEmpty()){
            return false;
        }else{
            if(word.toUpperCase().contains(searched.trim().toUpperCase())){
                return true;
            }else
                return false;
        }
        
    }
    
    public static boolean caseinsensitivEqual(String word,String searched){
        if(word.isEmpty() || searched.isEmpty()){
            return false;
        }else{
            if(word.toUpperCase().equals(searched.trim().toUpperCase())){
                return true;
            }else
                return false;
        }
        
    }
    
    
}
