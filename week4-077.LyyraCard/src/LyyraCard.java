/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bellia_2
 */
public class LyyraCard {
    private double balance;
    public LyyraCard(double balanceAtStart){
        this.balance=balanceAtStart;
    }
    public String toString(){
        String result="The card has "+balance+" euros";
        return result;
    }
    public void payEconomical(){
        if(balance>=2.5)
            balance=balance-2.5;
        
    }
    public void payGourmet() {
        if(balance>=4)
            balance=balance-4;
    // write code here
    }
    public void loadMoney(double amount){
        while(amount>=0){
        balance=balance+amount;
        if(balance>150)
            balance=150;
        break;
        }
    }
    
}
