
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            Scanner scanner = new Scanner(System.in);
            Watcher watcher = new Watcher();
            
            
            while(true){
                String cmd;
                System.out.print("? ");
                cmd=scanner.nextLine();
                if(StringUtils.caseinsensitivEqual("add", cmd)){
                    String name, latinName;
                    System.out.print("Name: ");
                    name=scanner.nextLine();
                    System.out.print("Latin Name: ");
                    latinName=scanner.nextLine();
                    Bird bird= new Bird(name,latinName);
                    watcher.add(bird);
                    
                }
                if(StringUtils.caseinsensitivEqual("observation",cmd )){
                    System.out.print("What was observed:?");
                    String birdName= scanner.nextLine();
                    watcher.observation(birdName);
                
                    
                }
                if(StringUtils.caseinsensitivEqual("Statistics",cmd )){
                    watcher.statics();
                    
                    
                }
                if(StringUtils.caseinsensitivEqual("Show",cmd )){
                    System.out.print("What ? ");
                    String birdName=scanner.nextLine();
                    watcher.show(birdName);
                    
                    
                }if(StringUtils.caseinsensitivEqual("quit",cmd)){
                    break;
                    
                    
                }
                
            }
            
            
    }

}
