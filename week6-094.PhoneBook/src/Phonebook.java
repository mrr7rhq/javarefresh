
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bellia_2
 */
public class Phonebook {

    private ArrayList<Person> personList;

    public Phonebook() {
        personList = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        Person newPerson = new Person(name, number);
        personList.add(newPerson);

    }
    public void printAll(){
        for(Person p: personList){
            System.out.println(p);
        }
    }
    public String searchNumber(String name){
        for(Person p:personList){
            
            if(p.getName().equals(name)){
                return p.getNumber();
            }
        }
        return "number not known";
    }

}
