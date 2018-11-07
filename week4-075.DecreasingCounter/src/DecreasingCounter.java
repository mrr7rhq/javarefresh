public class DecreasingCounter {
    private int value; 
    private int ini;// instance variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.ini=valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if(value==0)
            reset();
        else
        value--;
       
        
    }
    public void reset(){
        value=0;
    }
     public void setInitial(){
         value=ini;
     }

    // and here the rest of the methods
}
