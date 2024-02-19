package uz.gita.february;

import java.util.ArrayList;
import java.util.List;

public class Solution_1071 {
    public static void main(String[] args) {
//        List<Integer> ls = targetArr(864, 1620);
//        System.out.println(ls.toString());
        System.out.println(gcdOfStrings("ABCABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        List<Integer> ls = targetArr(str1.length(), str2.length());
        String result = "";

        for (int i = ls.size() - 1; i >= 0; i--) {
            System.out.println("1");
            boolean bool = true;
            if (ls.get(i) == str1.length() && ls.get(i) == str2.length())
                bool = str1.equals(str2);

            for (int j = 0; j < str1.length()-ls.get(i); j++) {
                if (str1.charAt(j) != str1.charAt(j + ls.get(i))) {
                    j = str1.length();
                    bool = false;
                }
            }
            
            System.out.println("2");
            if (bool) {
                for (int j = 0; j < str2.length() - ls.get(i); j++) {
                    if (str2.charAt(j) != str2.charAt(j + ls.get(i))) {
                        j = str2.length();
                        bool = false;
                    }
                }
            }
            System.out.println("3");
            if (bool) {
                result = str1.substring(0, ls.get(i));
                i = -1;
            }
            System.out.println("4");
        }
        return result;
    }

    private static List<Integer> targetArr(int x, int y) {
        int target = 0;
        while (x != y && x > 0 && y > 0) {
            if (x > y) x = x % y;
            else y = y % x;
        }
        target = Math.max(x, y);

        List<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= target; i++) {
            if (x % i == 0 && y % i == 0) ls.add(i);
        }
        return ls;
    }
}


