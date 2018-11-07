/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author feihua
 */
public class ProductContainerRecorder extends ProductContainer {
    
    private List<Double> history;
   
    
    public ProductContainerRecorder(String productName, 
            double capacity,
            double initialVolume){
        super(productName,capacity);
        super.addToTheContainer(initialVolume);
        
        history=new ArrayList<Double>();
        history.add(initialVolume);
    }
    
    public void addToTheContainer(double amount){
       super.addToTheContainer(amount);
      
       history.add(this.getVolume());
       
    }
    
    public double takeFromTheContainer(double amount){
       double result= super.takeFromTheContainer(amount);
        
        history.add(this.getVolume());
        return result;
        
    }
    
    public String history(){
        return history.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+this.history());
        ContainerHistory ht= new ContainerHistory(history);
        System.out.println("Greatest product amount: "+ht.maxValue());
        System.out.println("Smallest product amount: "+ht.minValue());
        System.out.println("Average: "+ht.average());
        System.out.println("Greatest change: "+ht.greatestFluctuation());
        System.out.println("Variance: "+ht.variance());
    }
}
