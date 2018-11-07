
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class SearchFunctions {
    private Map<String,Person> people;
    
    public SearchFunctions(){
        people= new HashMap<String,Person>();
    }
    
    public void addNumber(String name, String number){
        if(people.containsKey(name))
                people.get(name).addNumber(number);
        else{
            Person person= new Person(name);
            person.addNumber(number);
            people.put(person.getName(), person);
        }
    }
    
    public List<String> searchNumberByName(String name){ 
//searching by name return the number set or return null if this name is not in the people Map 
        
        List<String> temp= new ArrayList<String>();
        if(people.containsKey(name))
             temp=people.get(name).getNumbers();
       
        return temp;      
        
    }
    
    public Person searchPersonBuNumber(String number){
        Person result=null;
        for(Person one:people.values()){
            if(one.getNumbers().contains(number))
                result= one;
        }
        return result;
            
    }
    
    public void addAddress(String name, String street, String city){
        Person person;
        if(people.containsKey(name)){
            person=people.get(name);
            person.setStreetAddress(street);
            person.setCity(city);
        }else{
            person=new Person(name);
            person.setStreetAddress(street);
            person.setCity(city);
            people.put(person.getName(), person);
        }
        
    }
    
    public Person searchPersonInfor(String name){
        return people.get(name);
    }
    
    public void deletePersonInfo(String name){
        people.remove(name);
    }
    
    public List<Person> keywordSearch(String keyword){
        List<Person> result=new ArrayList<Person>();
        if(keyword.isEmpty()){
            result.addAll(people.values());
        }else{
            for(Person one:people.values()){
                if(one.getName().contains(keyword)){
                    result.add(one);
                    continue;
                }
                else if(one.getStreetAddress()!=null && one.getStreetAddress().contains(keyword)){
                    result.add(one);
                    continue;
                
                }else if(one.getCity()!=null && one.getCity().contains(keyword)){
                    result.add(one);
                }
                    
            }
        }
        Collections.sort(result);
        
        return result;
        
    }
    
    
    
    public void testprint(){
        for(Person person:people.values()){
            System.out.println(person.getName());
            System.out.println(person.getStreetAddress());
            System.out.println(person.getCity());
            for(String number:person.getNumbers())
                System.out.println(number);
        }
            
    }
    
    
}
