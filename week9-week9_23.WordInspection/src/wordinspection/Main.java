package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are tin file src/wordList.txt
        WordInspection test = new WordInspection(file);
        System.out.println(test.wordCount());
        System.out.println(test.wordsContainingZ().toString());

    }
}