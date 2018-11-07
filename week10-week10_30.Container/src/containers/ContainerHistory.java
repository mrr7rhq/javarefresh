/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author feihua
 */
public class ContainerHistory{
    private List<Double> history;
    
    public ContainerHistory(){
        history=new ArrayList<Double>();
    }
    
    public ContainerHistory(List<Double> history){
        this.history=new ArrayList<Double>();
        this.history=history;
    }
    
    public void add(double situation){
        history.add(situation);
    }
    
    public void reset(){
        history.clear();
    }
    
    public String toString(){
        
        return history.toString();
    }
    
    public double maxValue(){
        double max=0;
        if(history.isEmpty())
            return 0;
        else {
            for(double each:history){
                if(each>max)
                    max=each;
            }
        }
        
        return max;
            
    }
    
    
    public double minValue(){
        double min=0;
        if(history.isEmpty())
            return 0;
        else {
            min=history.get(0);
            for(double each:history){
                if(each<min)
                    min=each;
            }
        }
        
        return min;
    }
    
    public double average(){
        
         double sum=0, i=0;
        if(history.isEmpty())
            return 0;
        else {
            for(double each:history){
                sum+=each;
                i++;
            }
        }
        
        return sum/i;        
    }
    
    public double greatestFluctuation(){
        double flu=0 ,step=history.get(0);
        if(history.isEmpty())
            return flu;
        else {
            for(double each:history){
                if(Math.abs(each-step)>flu){
                    flu=Math.abs(each-step);
                }
                step=each;
            }
        }
        
        return flu;
    }
    
    
    public double variance(){
        
        double sum=0;
        double avg=this.average();
        if(history.isEmpty() || history.size()==1)
            return 0;
        else{
            for(double d:history){
                
                sum=sum+Math.pow(d-avg, 2);
            }
             return sum/(history.size()-1);
        }
    }
}
