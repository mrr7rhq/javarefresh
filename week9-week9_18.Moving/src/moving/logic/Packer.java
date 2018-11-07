/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.List;
import java.util.ArrayList;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author feihua
 */
public class Packer {
    private int boxesVolume;
    
    
    public Packer(int boxesVolume){
        this.boxesVolume=boxesVolume;
       
    }
    
    public List<Box> packThings(List<Thing> things){
       List<Box> boxesList= new ArrayList<Box>();
//       List<Thing> temp= new ArrayList<Thing>();
//       int thingAmount=things.size();
//        while(temp.size()!=thingAmount){
//            Box box = new Box(boxesVolume);
//            
//                for(Thing oneThing:things){
//                    if(box.addThing(oneThing))
//                        temp.add(oneThing);
//                    else{
//                        boxesList.add(box);
//                        break;
//                    }
//                }
//                    
//            
//        }
            Box box= new Box(this.boxesVolume);
        for(int i=0;i<things.size();i++){
            if(box.addThing(things.get(i)))
                if(i==things.size()-1)
                    boxesList.add(box);
                else
                    continue;
            else{
                boxesList.add(box);
                box=new Box(this.boxesVolume); 
                box.addThing(things.get(i));
                if(i==things.size()-1)
                    boxesList.add(box);
                
            }
        }
            
        return boxesList;
    }
    
}
