package uz.gita.february;

import java.util.HashSet;
import java.util.Set;

public class Solution2506 {
    public static void main(String[] args) {

    }

    public static int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (checkSimilar(words[i], words[j]))
                    count ++;
            }
        }

        return count;
    }

    private static boolean checkSimilar(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
        }

        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            set2.add(s2.charAt(i));
        }

        return set1.equals(set2);
    }
}
