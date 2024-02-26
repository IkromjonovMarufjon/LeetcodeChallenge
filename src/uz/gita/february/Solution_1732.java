package uz.gita.february;

public class Solution_1732 {
    public int largestAltitude(int[] gain) {
        int sum = 0, max = 0;

        for (int j : gain) {
            sum += j;
            if (max < sum) max = sum;
        }

        return max;
    }
}
