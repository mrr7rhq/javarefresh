/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author feihua
 */
public class OneThingBox extends Box{
    
   
    private Thing content;
    
    

    @Override
    public void add(Thing thing) {
        if(content==null)
            content=thing;
        
            
 
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(content!=null){
            if(content.equals(thing))
                return true;
            else
            return false;
        }else 
            return false;
  
    }
    
}
