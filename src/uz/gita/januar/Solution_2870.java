package uz.gita.januar;

import java.util.HashMap;
import java.util.Map;

public class Solution_2870 {
    public static void main(String[] args) {

    }

    public static int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return -1;
            result += entry.getValue() / 3;
            if (entry.getValue() % 3 != 0) result++;
        }

        return result;
    }
}
