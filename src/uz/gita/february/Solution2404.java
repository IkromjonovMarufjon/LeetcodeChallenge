package uz.gita.february;

import java.util.Arrays;

public class Solution2404 {
    public static void main(String[] args) {

    }

    public static int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int target = 0;
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) continue;
            count = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) count ++;
                else j = nums.length;
            }
            if (count > max) {
                max = count;
                target = nums[i];
            }
        }

        return target;
    }
}




