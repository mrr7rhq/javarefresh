
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money result = new Money(this.euros + added.euros, this.cents + added.cents);
        return result;

    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }
    public Money minus(Money decremented){
        Money result;
        if(this.less(decremented)){
            result= new Money(0,0);
            return result;
        }else if(decremented.cents>this.cents){
             return result=new Money(this.euros-decremented.euros-1,this.cents+100-decremented.cents);
        }else
            return result = new Money(this.euros-decremented.euros,this.cents-decremented.cents);
        
        
    }

}
