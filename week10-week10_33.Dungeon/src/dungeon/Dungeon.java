/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author feihua
 */
public class Dungeon {
    
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private ArrayList<Charactor> vList;
    private Player player;
    private Scanner reader;
    
    
    
    public Dungeon(int length, int height, int vampires,   
            int moves, boolean vampiresMove){
        //length==x height==y
        this.height=height;
        this.length=length;
        this.moves=moves;
        this.vampires=vampires;
        this.vampiresMove=vampiresMove;
        
        player=new Player();
        
        vList= new ArrayList<Charactor>();
        
        reader= new Scanner(System.in);
        
        

        
    }
    
    public void run(){
        vList=multipleVprCreater(vampires);
        while(vampires!=0 && moves!=0){
            
            
            if(vampiresMove){
            
            printStatus();
            System.out.println("");
            inputProcess(reader);
            if(this.positionTaken(player.getPosition())){
                vampires--;
                moves--;
                
            }else
                moves--;
            
            vList.clear();
            vList=multipleVprCreater(vampires);
            }else {
                
                printStatus();
                System.out.println("");
                inputProcess(reader);
                if(this.positionTaken(player.getPosition())){
                    ArrayList<Charactor> del=new ArrayList<Charactor>();
                    for(Charactor c:vList){
                        if(c.getPosition().equals(player.getPosition()))
                            del.add(c);
                    }
                    vList.removeAll(del);
                    
                    vampires--;
                    moves--;

                }else
                    moves--;
                }
                
           
       }
        if(vampires==0)
            System.out.println("YOU WIN");
        else 
            System.out.println("YOU LOSE");
        
        
    }
    
   public ArrayList<Charactor> multipleVprCreater(int number){
       ArrayList<Charactor> list= new ArrayList<Charactor>();
       for(int i =0; i<number; i++){
           list.add(creatVpr());
        }
       return list;
   }
    
    public void inputProcess(Scanner reader){
        String input= reader.nextLine();
        for(int i=0; i<input.length();i++){
            if(input.charAt(i)=='w'){
                if(player.getPosition().getY()>=1)
                    player.getPosition().moveUp();
            }
            if(input.charAt(i)=='a'){
                if(player.getPosition().getX()>=1)
                    player.getPosition().moveLeft();
            }
            if(input.charAt(i)=='s'){
                if(player.getPosition().getY()<=height-2)
                    player.getPosition().moveDown();
            }
            if(input.charAt(i)=='d'){
                if(player.getPosition().getX()<=this.length-2)
               player.getPosition().moveRight();
            }
            
        }
        
    }
    public boolean positionTaken(Position position){
        
        for(Charactor one:vList){
                if(one.getPosition().equals(position))
                    return true;
                
            }
        return false;
    }
    public Position randomPosition(){
        Random r = new Random();
        int x= r.nextInt(this.length);
        int y= r.nextInt(this.height);
        Position p= new Position(x,y);
        return p;
    }
    
    
    public Vampire creatVpr(){
        
        Vampire v= new Vampire(this.randomPosition());
            if(positionTaken(v.getPosition()))
                creatVpr();
                    
        return v;
            
            
            
        
    }
    
    public void printStatus(){
        System.out.println(this.moves);
        System.out.println("");
        System.out.println(player);
        for(Charactor v:vList)
            System.out.println(v);
        System.out.println("");
        
        for(int h=0;h<height;h++){
            for(int l=0;l<length;l++){
                Position temp= new Position(l,h);
                
                if(player.getPosition().equals(temp))
                    System.out.print("@");
                else if(inTheList(temp))
                    System.out.print("v");
                else 
                    System.out.print(".");
                
                
                    
                
            }
            System.out.println("");
        }
        
    }
    
    public boolean inTheList(Position position){
        for(Charactor c : vList){
            if(c.getPosition().equals(position))
                return true;
        }
        return false;
    }
    
    
    
    
}
