/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author feihua
 */
public class BulkTank {
    private double capacity;
    private double volume;
    
    public BulkTank(){
        capacity = 2000;
        volume=0;
    }
    
    public BulkTank(double capacity){
        this.capacity=capacity;
    }
    
    public double getCapacity(){
        return capacity;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double howMuchFreeSpace(){
        return capacity - volume;
    }
    
    public void addToTank(double amount){
        if((volume+amount)<=capacity)
            volume+=amount;
        else
            volume=capacity;
    }
    
    public double getFromTank(double amount){
        if(volume>=amount){
            volume-=amount;
            
        }else {
            amount=volume;
            volume=0;
            
        }
        return amount;
    
    }
    
    @Override
    public String toString(){
        return Math.ceil(volume)+"/"+Math.ceil(capacity);
    }
}
