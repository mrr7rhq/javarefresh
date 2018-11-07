
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
   
    public NumberStatistics(){
        
    }
    public void addNumber(int number) {
        // code here
        amountOfNumbers =amountOfNumbers+1;
       sum=sum+number;

    }

    public int amountOfNumbers() {
        // code here
        
        return amountOfNumbers;
    }
    public int sum(){
        
        return sum;
    }
    public double average(){
        if(amountOfNumbers==0)
            return 0;
        else
        return (double)sum/amountOfNumbers;
    }
}
