package uz.gita.february;

import java.util.Arrays;

public class Solution_238 {
    public int[] productExceptSelf(int[] nums) {
        int x = 1;

        for (int num : nums) {
            x *= num;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = x / nums[i];
        }
        return nums;
    }
}


