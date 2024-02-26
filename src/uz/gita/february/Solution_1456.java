package uz.gita.february;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution_1456 {
    public int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int count = 0;
        for (int i = 0; i < k; i++) {
            if (set.contains(s.charAt(i))) count ++;
        }
        int max = count;

        for (int i = k; i < s.length(); i++) {
            if (set.contains(s.charAt(i -k))) count --;
            if (set.contains(s.charAt(i))) {
                count ++;
                if (count > max) max = count;
            }
        }

        return max;
    }
}
