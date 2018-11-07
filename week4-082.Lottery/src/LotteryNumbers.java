import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        
        
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        Random rd= new Random();
        int numb,counter=0;
        while(counter<7){
            numb=rd.nextInt(39)+1;
            if(!containsNumber(numb)){
                numbers.add(numb);
                counter++;
            }
            
        }
        
           
            
        
        
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        if(numbers.contains(number))
            return true;
        else
            return false;
    }
}
