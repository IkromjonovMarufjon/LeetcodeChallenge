package uz.gita.february;

import java.util.Arrays;
import java.util.Stack;

public class Solution_735 {
    public static void main(String[] args) {
        int[] mass = {-1, 2, 2, -1, -2};
        int[] result = asteroidCollision2(mass);
        System.out.println(Arrays.toString(result));
    }

    public static int[] asteroidCollision2(int[] asteroids) {
        int index = -1;
        for (int i = 0; i < asteroids.length; i++) {
            boolean bool = true;
            while (bool) {
                if (index == -1) {
                    asteroids[++ index] = asteroids[i];
                    bool = false;
                    continue;
                }
                if (asteroids[index] * asteroids[i] > 0) {
                    asteroids[++index] = asteroids[i];
                    bool = false;
                    continue;
                }
                if (asteroids[index] < 0 && asteroids[i] > 0) {
                    asteroids[++index] = asteroids[i];
                    bool = false;
                    continue;
                }
                if (asteroids[index] == -1 * asteroids[i]) {
                    index --;
                    bool = false;
                    continue;
                }
                if (asteroids[index] > -1 * asteroids[i]) {
                    bool = false;
                    continue;
                }
                index --;
            }
        }

        return Arrays.copyOf(asteroids, index);
    }
}