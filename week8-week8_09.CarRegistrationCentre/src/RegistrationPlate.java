
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj==null)
            return false;
        if(this.getClass()!=obj.getClass())
            return false;
        RegistrationPlate compare=(RegistrationPlate)obj;
        if(this.country!=compare.country)
            return false;
        if(this.regCode!=compare.regCode)
            return false;
        return true;
    }
    
    
    @Override
    public int hashCode(){
        if(this.regCode==null)
            return 7;
        if(this.country==null)
            return 8;
        
       
        return this.country.hashCode()+this.regCode.hashCode();
    }

}
