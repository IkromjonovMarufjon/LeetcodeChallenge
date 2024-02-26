package uz.gita.february;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution_1207 {
    public static void main(String[] args) {

    }
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        Collection<Integer> collection = map.values();
        Set<Integer> set = new HashSet<>(collection);
        return collection.size() == set.size();
    }
}


