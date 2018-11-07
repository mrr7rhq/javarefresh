/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author feihua
 */
public class CompoundFigure extends Figure {
    private List<Figure>  shaps;
    
    public CompoundFigure(){
        shaps= new ArrayList<Figure>();
    }

    
    
    public void add(Figure figure){
        shaps.add(figure);
    }
    
    public void move(int x, int y){
        for(Figure figure:shaps){
            figure.move(x, y);
        } 
    }

    @Override
    public void draw(Graphics graphic) {
        
        for(Figure figure:shaps){
            figure.draw(graphic);
        }

    }
    
}
