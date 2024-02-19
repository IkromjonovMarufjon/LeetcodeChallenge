package uz.gita.february;

public class Solution_1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int size = Math.min(word1.length(), word2.length());
        for (int i = 0; i < size; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (size < word1.length()) sb.append(word1.substring(size));
        if (size < word2.length()) sb.append(word2.substring(size));
        return sb.toString();
    }
}
