
public class Main {

    public static void main(String[] args) {
        // write test code here
        
        
        String str="3:00:33";
        String str1="aeiouäö";
       
        
        if(allVowels(str1))
            System.out.println("The form is fine.");
        else 
            System.out.println("The form is wrong.");
        
        
    }
    
    public static boolean isAWeekDay(String string){
        if(string.matches("mon|tue|wed|thu|fri|sat|sun"))
            return true;
        else 
            return false;
    }
    
    public static boolean allVowels(String string){
        if(string.matches("(a|e|i|o|u|ä|ö)*"))
            return true;
        else
            return false;
            
    }
     public static boolean clockTime(String string){
         
         String[] str;
         if(string.contains(":")){
             str=string.split(":");
             for(int i=0;i<str.length;i++){
                 
                if(i==0){
                    if(!str[i].matches("0[0-9]|1[0-9]|2[0-3]"))
                        return false;   
                }else {
                    if(!str[i].matches("[0-5][0-9]"))
                        return false;
                }
                    
                
                 
             }
             return true;
         }else 
             return false;
     }
}
