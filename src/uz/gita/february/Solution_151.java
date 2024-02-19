package uz.gita.february;

import java.util.ArrayList;
import java.util.List;

public class Solution_151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("hello  world! a"));
        System.out.println(reverseWords(" hello  world! a"));
        System.out.println(reverseWords(" hello  world!   a       "));
        System.out.println(reverseWords(" hello  world!   a a      "));
        System.out.println(reverseWords(" hello  world!   a   a      "));
        System.out.println(reverseWords("   d   hello  world!   a   a      "));
    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
//        List<String> ls = new ArrayList<>();

        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (index >= 0 && index < i) {
                    result.insert (0, " " + s.substring(index,i));
                }
                index = -1;
                continue;
            }
            if (index == -1) index = i;
        }

        if (index >= 0) result.insert(0, s.substring(index));
        if (result.charAt(0) == ' ') result.deleteCharAt(0);
//        for (int i = ls.size() - 1; i >= 0; i--) {
//            result.append(ls.get(i));
//            if (i != 0) result.append(" ");
//        }
        return result.toString();
    }
}


