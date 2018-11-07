/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author feihua
 */
public class Employees {
    private List<Person> employees;
    
    public Employees(){
        employees= new ArrayList<Person>();
    }
    
    public void add(Person person){
        employees.add(person);
    }
    
    public void add(List<Person> people){
        employees.addAll(people);
    }
    public void print(){
        Iterator<Person> p= employees.iterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
    
    public void print(Education edu){
       Person temp;
        Iterator<Person> p= employees.iterator();
        while(p.hasNext()){
            temp= p.next();
            if(temp.getEducation()==edu)
                System.out.println(temp);
        }
    }
    
    public void fire(Education education){
        
        Iterator<Person> p= employees.iterator();
        while(p.hasNext()){
            if(p.next().getEducation()==education)
                p.remove();
        }
    }
    
}
