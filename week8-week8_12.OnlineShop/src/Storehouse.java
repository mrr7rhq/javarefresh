
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class Storehouse {
    private Map<String,Integer> products;
    private Map<String, Integer> stocks; 
    
    public Storehouse(){
        products= new HashMap<String,Integer>();
        stocks= new HashMap<String,Integer>();
    }
    
    public void addProduct(String product, int price,int stock){
        products.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product){
        if(products.containsKey(product))
            return products.get(product);
        else 
            return -99;
    }
    
    public int stock(String product){
        if(stocks.containsKey(product))
            return stocks.get(product);
        else 
            return 0;
    }
    
    public boolean take(String product){
        
        if(stocks.containsKey(product) && (stocks.get(product)>=1)){
                stocks.replace(product,stocks.get(product)-1);
                return true;
        }else 
            return false;
            
    }
    
    public Set<String> products(){
        return products.keySet();
        
    }
    
}
