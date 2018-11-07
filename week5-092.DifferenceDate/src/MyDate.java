public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance() {
        if (day == 30) {
            day = 1;
            if (month == 12) {
                month = 1;
                year += 1;
            } else {
                month += 1;
            }

        } else {
            day += 1;
        }

    }
    
    public void advance(int numberOfDays){
        for(int i=0;i<numberOfDays;i++)
            advance();
        
    }
    public MyDate afterNumberOfDays(int days){
        MyDate newMyDate = new MyDate(day,month,year);
        newMyDate.advance(days);
        return newMyDate;
    }
    public int differenceInYears(MyDate comparedDate){
        
        
        if(this.earlier(comparedDate)){
            if(this.month>comparedDate.month || (this.month==comparedDate.month && this.day>comparedDate.day)){
                return comparedDate.year-this.year-1;
            }else
                return comparedDate.year-this.year;
            
        }else
        {
           if(this.month<comparedDate.month || (this.month==comparedDate.month && this.day<comparedDate.day)){
                return this.year-comparedDate.year-1;
            }else
                return this.year-comparedDate.year;
        }
       /* if (Math.abs(comparedDate.year - this.year) == 1) {
            if (this.earlier(comparedDate)) {
                comparedDate.advance(365);
                if (this.earlier(comparedDate)) {
                    return 1;
                } else {
                    return 0;
                }

            }else{
                this.advance(365);
                if (comparedDate.earlier(this)) {
                    return 1;
                } else {
                    return 0;
                }
            }

        } else 
           
        return Math.abs(comparedDate.year - this.year);*/
        
        

        
    }

}
