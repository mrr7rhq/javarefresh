/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class Airplane {
    private String planeId;
    private int capacity;
    
    public Airplane(String planeId,int capacity){
        this.planeId=planeId;
        this.capacity=capacity;
    }
    
    public String getPlaneId(){
        return planeId;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public String toString(){
        return planeId+" ("+capacity+" ppl)";
    }
    
}
