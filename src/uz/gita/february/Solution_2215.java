package uz.gita.february;

import java.util.ArrayList;
import java.util.List;

public class Solution_2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();

        for (int num : nums1) {
            if (!answer1.contains(num) && check(nums2, num))
                answer1.add(num);
        }

        for (int num : nums2) {
            if (!answer2.contains(num) && check(nums1, num))
                answer2.add(num);
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(answer1);
        result.add(answer2);

        return result;
    }

    private boolean check(int[] nums, int amount) {
        for (int num : nums)
            if (num == amount) return true;
        return false;
    }
}


