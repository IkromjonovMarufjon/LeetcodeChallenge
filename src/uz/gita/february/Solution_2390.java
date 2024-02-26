package uz.gita.february;

import java.util.Arrays;
import java.util.Stack;

public class Solution_2390 {
    public static void main(String[] args) {
        System.out.println(removeStars("il**autonrd**cl**nh*up*afpizp****d*a****lst"));
    }

    public static String removeStars(String s) {
        int j = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                arr[j++] = s.charAt(i);
            } else j --;
        }

        StringBuilder sb = new StringBuilder(j);
        for (int i = 0; i < j; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}

/*
"il**autonrd**cl**nh*up*afpizp****d*a****lst"
autonnlst"

"utonnulst"
"autonnlst"
*/
