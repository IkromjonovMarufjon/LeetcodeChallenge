package uz.gita.february;

public class Solution_345 {

    public static void main(String[] args) {
        System.out.println(reverseVowels("Hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("ld"));
        System.out.println(reverseVowels("aeiou"));
    }

    public static String reverseVowels(String s) {
        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        String vowelST = "aAeEiIoOuU";
        StringBuilder sb = new StringBuilder(s);

        while (leftIndex < rightIndex) {
            if (vowelST.indexOf(s.charAt(leftIndex)) == -1) {
                leftIndex ++;
                continue;
            }
            if (vowelST.indexOf(s.charAt(rightIndex)) == -1) {
                rightIndex --;
                continue;
            }

//            System.out.println(leftIndex + " -> " + s.charAt(leftIndex));
//            System.out.println(rightIndex + " -> " + s.charAt(rightIndex));

            sb.setCharAt(leftIndex, s.charAt(rightIndex));
            sb.setCharAt(rightIndex, s.charAt(leftIndex));
            leftIndex ++;
            rightIndex --;
        }
        return sb.toString();
    }
}


