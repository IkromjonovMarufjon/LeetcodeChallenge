package uz.gita.february;

public class Solution_724 {
    public int pivotIndex(int[] nums) {
        int rightSum = 0, leftSum = 0;
        for (int num : nums) rightSum += num;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0) leftSum += nums[i-1];
            rightSum -= nums[i];
            if (leftSum == rightSum) return i;
        }

        if (leftSum == 0) return nums.length-1;
        return -1;
    }
}
