package uz.gita.february;

public class Solution2341 {

    public int[] numberOfPairs(int[] nums) {
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num]++;
        }

        int[] result = {0, 0};
        for (int value : arr) {
            result[0] += value / 2;
            result[1] += value % 2;
        }
        return result;
    }
}

/*
1 <= nums.length <= 100
0 <= nums[i] <= 100
* */
