public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
       hours=new BoundedCounter(23);
       hours.setValue(hoursAtBeginning);
       minutes= new BoundedCounter(59);
       minutes.setValue(minutesAtBeginning);
       seconds= new BoundedCounter(59);
       seconds.setValue(secondsAtBeginning);
// the counters that represent hours, minutes and seconds are created and set to have the correct initial values
    }
    
    public void tick() {
        
        /*Elegent solution!
        
        seconds.next();
        if(seconds.getValue()==0){
            minutes.next();
            if(minutes.getValue()==0){
                hours.next();
            }    
        }*/
        // Clock advances by one second
        //mysolution
        if(seconds.getValue()==59){
            seconds.next();
            if(minutes.getValue()==59){
                minutes.next();
                hours.next();
            }else
                minutes.next();
            
        }else 
            seconds.next();
    }
    
    public String toString() {
        // returns the string representation
        String result;
        result=hours.toString()+":"+minutes.toString()+":"+seconds.toString();
        return result;
    }
}
