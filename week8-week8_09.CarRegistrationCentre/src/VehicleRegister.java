
import java.util.ArrayList;
import java.util.HashMap;
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
public class VehicleRegister {
    
    private Map<RegistrationPlate, String >  plateList;
    
    public VehicleRegister(){
        plateList = new HashMap<RegistrationPlate, String >();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(plateList.get(plate) == null){
            plateList.put(plate, owner);
            return true;
        }else
            return false;
        
    }
    
    public String get(RegistrationPlate plate){
        
       if(plateList.containsKey(plate))
           return plateList.get(plate);
       else 
           return null;
    }
    
    public boolean delete(RegistrationPlate plate){
        if(plateList.containsKey(plate)){
            plateList.remove(plate);
            return true;
        }else
            return false;
      
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate:plateList.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        
        ArrayList<String> temp= new ArrayList<String>();
        for(String name: plateList.values()){
            if(!temp.contains(name))
                temp.add(name);
        }
        for(String name:temp)
            System.out.println(name);
        
        
        //or you can think from the end. make a list which contains alread printed name 
        //test the list first if the new name is in the list then test next. if the name is not 
        //in the list then print it and add to the list.
    }
 }
