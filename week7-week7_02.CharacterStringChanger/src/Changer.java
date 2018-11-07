
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class Changer {
    ArrayList<Change> changeList ;
    public Changer(){
        changeList = new ArrayList<Change>();
    }
    public void addChange(Change change){
        changeList.add(change);
    }
    public String change(String characterString){
        for(int i =0; i<changeList.size();i++){
            characterString=changeList.get(i).change(characterString);
        }
        return characterString;
        
    }
    
}
