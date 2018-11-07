/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class Flight {
    private Airplane airplane;
    private String departure;
    private String destination;
    
    public Flight(Airplane airplane, String departure, String destination){
        this.airplane=airplane;
        this.departure=departure;
        this.destination=destination;
    }
    /**
     * @return the departure
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }
    
    
    public Airplane getAirplane(){
        return airplane;
    }
    
    public String toString(){
        return airplane.toString()+" ("+departure+"-"+destination+")";
    }
}
