/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;

/**
 *
 * @author feihua
 */
public class MaxWeightBox extends Box {
    
    private int maxWeight;
    private ArrayList<Thing> thingList;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight=maxWeight;
        thingList = new ArrayList<Thing>();
        
    }

    @Override
    public void add(Thing thing) {
        int actualWeight=0;
        for(Thing oneThing:thingList)
            actualWeight+=oneThing.getWeight();
        if(actualWeight+thing.getWeight()<=maxWeight)
            thingList.add(thing);
        
            
        
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(thingList.contains(thing))
            return true;
        else 
            return false;

    }
    
}
