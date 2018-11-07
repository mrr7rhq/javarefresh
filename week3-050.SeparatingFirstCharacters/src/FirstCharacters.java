import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name =reader.nextLine();
        if(name.length()>2){
            for(int i=1; i<=3; i++){
                System.out.println(i+". character: "+name.charAt(i-1));
            }
        
        }
        
    }
}
