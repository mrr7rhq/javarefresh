/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author feihua
 */
public class Group implements Movable{
    private List<Movable> orgList;
    
    public Group(){
        orgList= new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable){
        orgList.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable one:orgList){
            one.move(dx, dy);
        }
    }
    
    public String toString(){
        String result="";
        for(Movable one:orgList){
            result+=one.toString();
            result+="\n";
        }
        
        return result;
        
    }
}
