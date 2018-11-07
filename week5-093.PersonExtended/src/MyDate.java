
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate comparedDate) {
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
    }

  
}