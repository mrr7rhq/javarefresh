package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        try{
        if(name.isEmpty() || name.length()>40)
            throw new IllegalArgumentException("The the format of the name is"
                    + "not right!");
        else if(age>120 || age <0)
            throw new IllegalArgumentException("The age has to be in range of 0-120");
        this.name = name;
        this.age = age;
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
            throw new IllegalArgumentException("The the format of the name is"
                    + "not right!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
