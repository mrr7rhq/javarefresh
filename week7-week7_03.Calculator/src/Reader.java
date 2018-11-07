
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
public class Reader {
    private Scanner input;
    public Reader(){
        input= new Scanner(System.in);
    }
    public String readString(){
        
        
        
        return input.nextLine();
    }
    public int readInteger(){
        int inputNumb=0;
        try{
        
        inputNumb=Integer.parseInt(input.nextLine());
       
        }catch(Exception e){
            System.out.println("Wrong inout!");
            
        }
        
                           
         return inputNumb;
    }
    
}
