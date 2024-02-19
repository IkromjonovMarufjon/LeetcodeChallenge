package uz.gita.february;

public class Solution_2108 {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (check(word)) return word;
        }
        return "";
    }

    private boolean check(String st) {
        int border = st.length() / 2;
        for (int i = 0; i < border; i++) {
            if (st.charAt(i) != st.charAt(st.length() - 1 - i)) return false;
        }
        return true;
    }
}
