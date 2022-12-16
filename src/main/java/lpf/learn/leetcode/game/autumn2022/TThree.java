package lpf.learn.leetcode.game.autumn2022;

import java.util.HashMap;
import java.util.Map;

public class TThree {
    public int beautifulBouquet(int[] flowers, int cnt) {
        Map<Integer, Integer> countMap = new HashMap<>();

        int length = flowers.length;
        int left = 0, right = 0;

        long result = 0;

        while (right < length) {
            int flower = flowers[right];

            Integer count = countMap.merge(flower, 1, Integer::sum);
            if (count > cnt) {
                int temp = -1;
                while ((temp = flowers[left++]) != flower) {
                    countMap.merge(temp, -1, Integer::sum);
                }
                countMap.merge(flower, -1, Integer::sum);
            }
            result = (result + right - left + 1) % 1000000007;

            right++;
        }
        return (int) (result % 1000000007);
    }
}
