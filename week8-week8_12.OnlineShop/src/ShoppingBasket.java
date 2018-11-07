
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class ShoppingBasket {
   private Map<String,Purchase> purchases;
   
   public ShoppingBasket(){
       purchases= new HashMap<String,Purchase>();    
   }
    
   public void add(String product,int price){
       
      
       if(purchases.containsKey(product)){
           purchases.get(product).increaseAmount();
       } else {
            Purchase newPurchase= new Purchase(product,1,price);
            purchases.put(product, newPurchase);
       }
       
       
       
   }
   
   public int price(){
       int cost=0;
       for(Purchase each:purchases.values()){
           cost+=each.price();
       }
       return cost;
   }
   
   public void print(){
       for(Purchase each:purchases.values()){
           System.out.println(each);
       }
   }
}
