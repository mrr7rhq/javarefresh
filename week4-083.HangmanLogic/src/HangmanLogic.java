
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
       
         if(!guessedLetters.contains(letter)){
                    
               guessedLetters=guessedLetters+letter;
                if(word.contains(letter)){
                
                
                }else{
               
                    
            
                numberOfFaults=numberOfFaults+1;
            }
                }
           
               
            
        
            
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        String result="";
        for(int i=0; i<word.length();i++){
            if(guessedLetters.contains(""+word.charAt(i)))
                result=result+word.charAt(i);
            else 
                result=result+"_";
            
        }
        
        
        return result;
    }
}
