
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class Person implements Comparable<Person>{
    private String name;

    
    private String streetAddress;
    private String city;
    private List<String> numberSet;

    
    
    public Person(String name){
        this.name= name;
        numberSet=new ArrayList<String>();
    }
    
    public String getName() {
        return name;
    }
    
     public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public List<String> getNumbers() {
        return numberSet;
    }
    
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public void addNumber(String number){
        numberSet.add(number);
        
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

    
    
}
