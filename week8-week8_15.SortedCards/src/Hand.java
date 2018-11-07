
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class Hand implements Comparable<Hand>{
    private List<Card> cardList;
    
    public Hand(){
        cardList= new ArrayList<Card>();
    }
    
    public void add(Card card){
        cardList.add(card);
    }
    
    public void print(){
        for(Card card:cardList)
            System.out.println(card);
    }
    
    public void sort(){
       Collections.sort(cardList);
    }
    
    public int getValueSum(){
        int sum=0;
        for(Card card:cardList)
            sum+=card.getValue();
        return sum;
    }
    public int compareTo(Hand hand){
        return this.getValueSum()-hand.getValueSum();
    }
    public void sortAgainstSuit(){
     
       SortAgainstSuitAndValue sasv= new  SortAgainstSuitAndValue();
       Collections.sort(cardList,sasv);
        
    }
}
