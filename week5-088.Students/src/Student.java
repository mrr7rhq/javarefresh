/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bellia_2
 */
public class Student {
    private String studentNumber;
    private String name;
    public Student(String name,String number){
        this.studentNumber=number;
        this.name=name;
    }
    public String getStudentNumber(){
        return studentNumber;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        String result=this.name+" ("+this.studentNumber+")";
        return result;
    }
}
