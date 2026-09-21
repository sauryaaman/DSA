package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestfrequency {

    static int mostFreqEle(int[] arr) {
        int n = arr.length;

        // Insert all elements in hash map.
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++)
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

        // find the max frequency
        int maxCnt = 0, res = -1;
        for (var entry : freq.entrySet()) {
            int val = entry.getKey(), cnt = entry.getValue();

            // Update if frequency is higher or same but value is larger
            if (maxCnt < cnt || (cnt == maxCnt && val > res)) {
                res = val;
                maxCnt = cnt;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
        System.out.println(mostFreqEle(arr));
    }
}