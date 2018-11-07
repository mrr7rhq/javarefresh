/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bellia_2
 */
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int startingValue, boolean check){
        value=startingValue;
        this.check= check;
       
        
    }
    public Counter(int startingValue){
        value=startingValue;
        check=false;
    }
    public Counter(boolean check){
        this.check = check;
        value=0;
       
    }
    public Counter(){
        value=0;
        check=false;
    }
    
    
    public int value(){
        
        return value;
    }
    public void increase(){
        value=value+1;
    }
    public void decrease(){
        if(check){
            if(value>=1)
                value=value-1;
        }else
            value-=1;
       
    }
    public void increase(int increaseAmount){
        if(increaseAmount>=0)
            value=value+increaseAmount;
    }
    public void decrease(int decreaseAmount){
       if(check){
            if(decreaseAmount>=0){
                if(value>=decreaseAmount)
                    value=value-decreaseAmount;
                else
                    value=0;
            }
                
        }else{
           if(decreaseAmount>=0){
                
                    value=value-decreaseAmount;
            }
       
       }
           
            
    }
    
}
