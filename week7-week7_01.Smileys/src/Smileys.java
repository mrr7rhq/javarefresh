
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    private static void printWithSmileys(String characterString){
        int numberOfSmiles=0;
        if(isOdd(characterString.length())){
            numberOfSmiles=(characterString.length()+3)/2+2;
            characterString=" "+characterString+"  ";
        }else {
            numberOfSmiles=(characterString.length()+2)/2+2;
            characterString=" "+characterString+" ";
        }
        facePrint(numberOfSmiles);
        System.out.println("");
        facePrint(1);
        System.out.print(characterString);
        facePrint(1);
        System.out.println("");
        facePrint(numberOfSmiles);
        System.out.println("");
    }
    public static boolean isOdd(int value){
        if(value%2==1)
            return true;
        else
            return false;
    }
    public static void facePrint(int times){
        if(times>0){
            for(int i=0;i<times;i++)
                System.out.print(":)");
            
        }
        
        
    }

}
