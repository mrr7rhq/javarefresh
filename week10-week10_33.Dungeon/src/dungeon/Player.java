/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.List;

/**
 *
 * @author feihua
 */
public class Player implements Charactor{
    private Position position;
    
    public Player(){
        
        position=new Position(0,0);
        
    }
    
    

    @Override
    public Position getPosition() {
        return position;
    
    }
   
    public void setPosition(int x, int y){
        
        position.setX(x);
        position.setY(y);
    }
    
    public String toString(){
        return "@ "+ position.getX()+" "+this.position.getY();
    }
}
