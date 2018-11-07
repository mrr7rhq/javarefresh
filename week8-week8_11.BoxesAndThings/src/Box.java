
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**b
 *
 * @author feihua
 */
public class Box implements ToBeStored{
    private List<ToBeStored> box;
    private double maxWeight;
    
    public Box(double maxWeight){
        box= new ArrayList<ToBeStored>();
        this.maxWeight=maxWeight;
    }
    
    public void add(ToBeStored item){
        
        if((item.weight()+this.weight())<=maxWeight)
            box.add(item);
    }
    
    public double weight(){
        double weight=0;
        for(ToBeStored temp:box)
            weight+=temp.weight();
        return weight;
    }
    
    @Override
    public String toString(){
        
        return "Box: "+box.size()+" things, total weight "+""+weight()+" kg";
        
    }
    
    
}
