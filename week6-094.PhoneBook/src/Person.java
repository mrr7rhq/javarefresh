/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bellia_2
 */
public class Person {

    private String name;
    private String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String toString() {

        return name + " number: " + number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }
}
