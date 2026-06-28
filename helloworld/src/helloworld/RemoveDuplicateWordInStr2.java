package helloworld;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateWordInStr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        removeDuplicates(str);
    }

    private static void removeDuplicates(String str) {
        Set<String> set = new LinkedHashSet<>();

        String t = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                t = t + str.charAt(i);   // using String
            } else {
                if (t.length() > 0) {
                    set.add(t);         // duplicates auto removed
                }
                t = "";
            }
        }

        // last word
        if (t.length() > 0) {
            set.add(t);
        }

        // print result
        for (String word : set) {
            System.out.println(word);
        }
    }
}