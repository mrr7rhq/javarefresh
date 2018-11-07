
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        cashInRegister=1000;
        economicalSold=0;
        gourmetSold=0;
        // at start the register has 1000 euros 
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens 
        double lunch=2.5;
        if(cashGiven>=lunch){
            cashInRegister+=lunch;
            economicalSold++;
            return cashGiven-lunch;
        }else
            return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double lunch=4;
        if(cashGiven>=lunch){
            cashInRegister+=lunch;
           gourmetSold++;
            return cashGiven-lunch;
        }else
            return cashGiven;
    }
    public boolean payEconomical(LyyraCard card){
        double lunch=2.5;
        if(card.balance()>=lunch){
            
            card.pay(lunch);
            economicalSold++;
            return true;
        }else
            
        return false;
        
    }
    public boolean payGourmet(LyyraCard card){
        double lunch=4;
        if(card.balance()>=lunch){
           
            card.pay(lunch);
            gourmetSold++;
            return true;
        }else
        return false;
    }
    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum>=0){
        card.loadMoney(sum);
         cashInRegister+=sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}