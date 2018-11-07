package dictionary;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Test your dictionary here
        Set<String> test= new HashSet<String>();
        test.add("aaa");
        test.add("bbb");
        test.add("aaa");
        System.out.println(test);
    }
}
