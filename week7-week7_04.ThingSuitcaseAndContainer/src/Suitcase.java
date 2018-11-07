
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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;
    
    public Suitcase(int maxWeight){
        this.maxWeight=maxWeight;
        things = new ArrayList<Thing>();
    }
    public void addThing(Thing thing){
        if((thing.getWeight()+totalWeight())<=maxWeight)
            things.add(thing);
        
    }
    public String toString(){
        String result;
        
        if(things.size()==0)
            result="empty ("+""+totalWeight()+" kg)";
        else if(things.size()==1)
            result= ""+things.size()+" thing ("+""+totalWeight()+" kg)";
        else
            result= ""+things.size()+" things ("+""+totalWeight()+" kg)";
        return result;
    }
    
    public int totalWeight(){
        int weight=0;
        for(Thing items:things){
            weight+=items.getWeight();
        }
        return weight;
    }
    public void printThings(){
        String printble;
        
        for(Thing items:things){
            printble=items.getName()+" ("+""+items.getWeight()+" kg)";
            System.out.println(printble);
        }
        
    }
    public Thing heaviestThing(){
        Thing HeaviestItem=null;
        if(things.isEmpty())
            return HeaviestItem;
        else
            HeaviestItem= things.get(0);
            for(Thing items:things){
                if(items.getWeight()>=HeaviestItem.getWeight())
                    HeaviestItem=items;
            }
            return HeaviestItem;
    }
    
}
