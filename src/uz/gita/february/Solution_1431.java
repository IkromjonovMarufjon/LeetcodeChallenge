package uz.gita.february;

import java.util.ArrayList;
import java.util.List;

public class Solution_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int candy : candies) {
            if (max > candy) max = candy;
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1) return flowerbed[0] == 0 && n == 1;

        int firstIndex = -1;
        int count = 0;

        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] == 0) count ++;
            else {
                int x = 1;
                if (firstIndex < 0) x = 0;

                n -= (count - x) / 2;
                firstIndex = i;
                count = 0;
            }
        }

        if (count > 0) n -= count / 2;
        return n <= 0;
    }
}


