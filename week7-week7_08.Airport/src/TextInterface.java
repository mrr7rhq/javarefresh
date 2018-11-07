
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class TextInterface {
    private Scanner reader ;
    private String ops=null;
    private AirPort airport;
    
    public TextInterface(){
        reader = new Scanner(System.in);
        airport= new AirPort();
    }
    
    public void start(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        addOpsMainIndex();
        ops=reader.nextLine();
        while(!ops.equals("x")){
            
            if(ops.equals("1")){
                //add airplane operation
                addAirPlane();
                
            }else if(ops.equals("2")){
                //add flight 
                addFlight();
                
            }
                addOpsMainIndex();
                ops=reader.nextLine();
   
        }// end of the add operations
        
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        printMainIndex();
        ops=reader.nextLine();
        while(!ops.equals("x")){
            if(ops.equals("1")){
                airport.printPlanes();
                
            }else if(ops.equals("2")){
                airport.printFlights();
            }else if(ops.equals("3")){
                printPlaneInfo();
            }
            
            printMainIndex();
            ops=reader.nextLine();
           
        }
        
        
        
        
        
        
    }
    public void printMainIndex(){
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
        
    }
    
    public void addOpsMainIndex(){
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
        
    }
    
    public void addAirPlane(){
        String id;
        int capacity;
        System.out.print("Give plane ID: ");
        id=reader.nextLine();
        System.out.print("Give plane capacity: ");
        capacity=Integer.parseInt(reader.nextLine());
        airport.addPlane(id, capacity);
        
    }
    
    public void addFlight(){
        Airplane ap;
        String departure;
        String destination;
        String planeId;
        System.out.print("Give plane ID: ");
        planeId=reader.nextLine();
        ap=airport.searchAirplane(planeId);
        
        System.out.print("Give departure airport code: ");
        departure=reader.nextLine();
       
        System.out.print("Give destination airport code: ");
        destination=reader.nextLine();
        airport.addFlight(ap, departure, destination);
        
        
    }
    public void printPlaneInfo(){
        String planeId;
        System.out.print("Give plane ID:");
        planeId=reader.nextLine();
        airport.printPlaneInfo(planeId);
        
    }
    
    
}
