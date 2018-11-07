
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
public class AirPort {
    private HashMap<String,Airplane> planeList;
    private ArrayList<Flight> flights;
    
    public AirPort(){
        planeList= new HashMap<String,Airplane>();
        flights= new ArrayList<Flight>();
    }
    
    public void addPlane(String planeId,int capacity){
        Airplane ap= new Airplane(planeId,capacity);
        planeList.put(planeId, ap);
    }
    
    public void addFlight(Airplane airPlane,String departure,String destination){
        Flight ft = new Flight(airPlane,departure,destination);
        flights.add(ft);
    }
    
    public Airplane searchAirplane(String planeId){
        return planeList.get(planeId);
        
    }
    
    public void printPlanes(){
        for(Map.Entry<String,Airplane> entry:planeList.entrySet())
            System.out.println(entry.getValue().toString());
    }
    
    public void printFlights(){
        for(Flight flt:flights)
            System.out.println(flt.toString());
    }
    
    public void printPlaneInfo(String planeId){
        System.out.println(searchAirplane(planeId).toString());
    }
}
