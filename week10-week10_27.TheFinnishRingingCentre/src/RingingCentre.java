
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class RingingCentre {
    
    private Map<Bird,List<String>> record;
    
    public RingingCentre(){
        record= new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
        List<String> temp;
        if(record.containsKey(bird)){
            record.get(bird).add(place);
        }else{
            temp= new ArrayList<String>();
            temp.add(place);
            record.put(bird, temp);
        }
    }
    
    public void observations(Bird bird){
          List<String> temp= new ArrayList<String>();
          temp=record.get(bird);
          if(temp==null){
              System.out.println(bird.getLatinName()+" ("+bird.getRingingYear()
              +") observations: 0");
          }else{
              System.out.println(bird.getLatinName()+" ("+bird.getRingingYear()
              +") observations: "+temp.size());
              for(String name:temp)
                  System.out.println(name);
              
          }
    }
}
