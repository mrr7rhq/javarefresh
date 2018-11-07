package dictionary;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test your dictionary here
            MindfulDictionary dict = new MindfulDictionary("src/words.txt");
            dict.load();
            dict.add("apina", "monkey");
            dict.add("banaani", "banana");
            dict.add("ohjelmointi", "programming");
            System.out.println( dict.translate("apina") );
            System.out.println( dict.translate("ohjelmointi") );
            System.out.println( dict.translate("alla oleva") );
            dict.add("aa", "bb");
            dict.add("bb", "aa");
            dict.add("cc", "dd");
            dict.add("ee", "ff");
            dict.add("gg", "hh");
            System.out.println( dict.translate("aa") );
            dict.save();
       




                
    }
}
