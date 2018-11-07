/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author feihua
 */
public class Vampire implements Charactor{
    private Position position;
    
    
    public Vampire(int x, int y){
       position= new Position(x,y);
       
    }
    
    public Vampire(Position position){
        this.position=position;
        
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
        return "v "+ position.getX()+" "+this.position.getY();
    }
    
}
