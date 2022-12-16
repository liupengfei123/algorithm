package lpf.learn.leetcode.game.autumn2022;

public class Q6CE719 {

    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int n = temperatureA.length;
        int result = 0;

        int count = 0;
        for (int i = 1; i < n; i++) {
            int compareA = Integer.compare(temperatureA[i], temperatureA[i - 1]);
            int compareB = Integer.compare(temperatureB[i], temperatureB[i - 1]);

            if (compareA == compareB) {
                count++;
            } else {
                count = 0;
            }
            result = Math.max(result, count);
        }
        return result;
    }

}
