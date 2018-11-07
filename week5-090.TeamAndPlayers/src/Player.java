/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bellia_2
 */
public class Player {
    private String name;
    private int goals;
    public Player(String name){
        this.name = name;
        this.goals=0;
    }
    public Player(String name, int goals){
        this.name=name;
        this.goals=goals;
    }
    public String getName(){
        return name;
    }
    public int goals(){
        return goals;
    }
    public String toString(){
        return name+", goals "+goals;
    }
    
}
