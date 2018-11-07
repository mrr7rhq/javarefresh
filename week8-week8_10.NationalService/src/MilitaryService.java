/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class MilitaryService implements NationalService{
    private int days;
    
    public MilitaryService(int daysLeft){
        days=daysLeft;
        
    }
    
    public int getDaysLeft(){
        return days;
    }
    
    public void work(){
        if(days>=1)
            days=days-1;
    }
}
