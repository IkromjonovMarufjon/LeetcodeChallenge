package uz.gita.february;

public class Solution_392 {
    public boolean isSubsequence(String s, String t) {
        int x = 0, y = 0;
        while (x < s.length() && y < t.length()) {
            if (s.charAt(x) == t.charAt(y)) x ++;
            y ++;
        }

        return x == s.length();
    }
}
