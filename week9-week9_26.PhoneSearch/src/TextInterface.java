
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class TextInterface {
    private Scanner scan;
    private SearchFunctions sf;
    
    public TextInterface(){
        scan= new Scanner(System.in);
        sf= new SearchFunctions();
        
    }
    
    public void start(){
        this.menu();
        System.out.println("");
        System.out.print("command: ");
        String command=scan.nextLine();
        while(!command.equals("x")){
            if(command.equals("1"))
                this.cmdOne();
            else if(command.equals("2"))
                this.cmdtwo();
            else if(command.equals("3"))
                this.cmdThere();
            else if(command.equals("4"))
                this.cmdFour();
            else if(command.equals("5"))
                this.searchForpersoalInfo();
            else if(command.equals("6"))
                this.deletePersonInfo();
            else if(command.equals("7"))
                this.keyWordSearch();
            
//            switch(command){
//                case "1":
//                    this.cmdOne();
//                  
//                    break;
//                case "2":
//                    this.cmdtwo();
//                    break;
//                case "3":
//                    this.cmdThere();
//                    break;
//                case "4":
//                    this.cmdFour();
//                    break;
//                case "5":
//                    this.searchForpersoalInfo();
//                    break;
//                case "6":
//                    this.deletePersonInfo();
//                    break;
//                case "7":
//                    this.keyWordSearch();
//                    break;
//               
//            }
            System.out.println("");
            System.out.print("command: ");
            command=scan.nextLine();
            
            
        }
    }
    void keyWordSearch(){
        String keyWord;
        System.out.print("keyword (if empty, all listed): ");
        keyWord=scan.nextLine();
        List<Person> result=sf.keywordSearch(keyWord);
        if(result.isEmpty())
            System.out.println(" keyword not found");
        else{
            for(Person person:result){
                System.out.println("");
                System.out.println(" "+person.getName());
                //check if there is address if yes print it
                if(person.getStreetAddress()==null || person.getStreetAddress().isEmpty() )
                    System.out.println("  address unknown");
                else
                    System.out.println("  address: "+person.getStreetAddress()+
                        " "+person.getCity());
                
                if(person.getNumbers().isEmpty() || person.getNumbers()==null)
                    System.out.println("  phone number not found");
                else{
                    System.out.println("  phone numbers:");
                    for(String number:person.getNumbers()){
                        System.out.println("   "+number);
                    }
            }
                
            }
        }
    }
    
     void menu(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }
    
    void cmdOne(){
        
        String name;
        String number;
        System.out.print("whose number: ");
        name=scan.nextLine();
        System.out.print("number: ");
        number=scan.nextLine();
        sf.addNumber(name, number);
        
    }
    
    void cmdtwo(){
       
        String name;
        List<String> numberSet=new ArrayList<String>();
        System.out.print("whose number: ");
        name=scan.nextLine();
        numberSet=sf.searchNumberByName(name);
        if(numberSet.isEmpty()){
            System.out.println("  not found");
        }else{
            for(String number:numberSet)
                System.out.println(" "+number);
        }
    }
    void cmdThere(){
        
        String number;
        Person person=null;
        System.out.print("number: ");
        number=scan.nextLine();
        person=sf.searchPersonBuNumber(number);
        if(person==null)
            System.out.println(" not found");
        else 
            System.out.println(" "+person.getName());
    }
    void cmdFour(){
        String name;
        String street;
        String city;
        System.out.print("whose address: ");
        name=scan.nextLine();
        System.out.print("street: ");
        street=scan.nextLine();
        System.out.print("city: ");
        city=scan.nextLine();
        sf.addAddress(name, street, city);
    }
    void searchForpersoalInfo(){
        String name;
        System.out.print("whose information: ");
        name=scan.nextLine();
        Person one= sf.searchPersonInfor(name);
        if(one!=null){
            if(one.getStreetAddress()==null || one.getStreetAddress().isEmpty() )
                    System.out.println("  address unknown");
                else
                    System.out.println("  address: "+one.getStreetAddress()+
                        " "+one.getCity());
            
            if(one.getNumbers().isEmpty())
                System.out.println("  phone number not found");
            else{
                System.out.println("  phone numbers:");
                for(String number:one.getNumbers()){
                    System.out.println("   "+number);
                }
            }
                
        }else
            System.out.println("  not found");
    }
    void deletePersonInfo(){
        String name;
        System.out.print("whose information: ");
        name=scan.nextLine();
        sf.deletePersonInfo(name);
    }
    
    
}
