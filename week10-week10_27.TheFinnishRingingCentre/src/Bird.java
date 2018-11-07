
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getRingingYear() {
        return ringingYear;
    }

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    public boolean  equals(Object object){
        if(object== null)
            return false;
        if(this.getClass()!=object.getClass())
            return false;
        
        Bird bird=(Bird)object;
        
        
        if(!this.latinName.equals(bird.latinName))
            return false;
        if(this.ringingYear!=bird.ringingYear)
            return false;
        return true;
    }
    public int hashCode(){
        return this.latinName.hashCode()+this.ringingYear;
    }
    
   
}


