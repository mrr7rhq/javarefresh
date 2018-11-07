/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author feihua
 */
public class Thermometer implements Sensor{
    
    private boolean status;
    private Random rd;
    
    public  Thermometer(){
        status=false;
    }
    
    public boolean isOn(){
        return status;
    }
    
    public void on(){
        status=true;
    }
    
    public void off(){
        status=false;
    }
    
    public int measure(){
        int data;
        if(status){
            rd= new Random();
            data = rd.nextInt(30-(-30)+1)+(-30);
            return data;
        }else{
            throw new IllegalStateException("The sensor is off.");
        }
    }
    
}
