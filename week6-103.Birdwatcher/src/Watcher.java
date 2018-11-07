
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bellia_2
 */
public class Watcher {
    private ArrayList<Bird> birdList;
    public Watcher(){
        birdList= new ArrayList<Bird>();
    }
    
    
    public void add(Bird bird){
        
        birdList.add(bird);
    }
    public void observation(String birdName){
        
        
        for(Bird bird:birdList){
            if(StringUtils.included(bird.birdName(), birdName)){
                bird.observed();
            }else{
                System.out.println("Is not a bird!");
            }
        }
        
    }
    
    public void statics(){
        for(Bird bird:birdList)
            System.out.println(bird);
    }
    public void show(String birdName){
        
        for(Bird bird:birdList){
            if(StringUtils.included(bird.birdName(), birdName)){
                System.out.println(bird);
            }
        }
        
        
    }
}
