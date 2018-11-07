import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;
    private String password;
    
    // Define the variables

    public PasswordRandomizer(int length) {
        this.length=length;
        random= new Random();
        // Initialize the variable
    }

    public String createPassword() {
        // write code that returns a randomized password
        String letters="abcdefghijklmnopqrstuvwxyz";
        password="";
        for(int i=0; i<length;i++)
        {       
            password=password+letters.charAt(random.nextInt(25));
        }
        return password;
    }
}
