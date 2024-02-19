package uz.gita.february;

public class Solution_196 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int count = 0, majorityElement = 0;

        for (int num : nums) {
            if (count == 0) majorityElement = num;

            if (majorityElement == num) count++;
            else count--;
        }

        return majorityElement;
    }
}


