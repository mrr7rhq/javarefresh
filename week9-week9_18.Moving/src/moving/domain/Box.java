/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author feihua
 */
public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> boxContent;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        boxContent = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        int currentVolum=getVolume();
        if (currentVolum + thing.getVolume() <= this.maximumCapacity) {
            boxContent.add(thing);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int getVolume() {
       int currentVolum = 0;
        for (Thing oneThing : boxContent) {
            currentVolum += oneThing.getVolume();
        }
        return currentVolum;
    }
    
    public String toString(){
        return this.getVolume()+" dm^3";
    }

}
