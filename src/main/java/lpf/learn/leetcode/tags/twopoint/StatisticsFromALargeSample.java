package lpf.learn.leetcode.tags.twopoint;

/** [1093]大样本统计
 * 我们对 0 到 255 之间的整数进行采样，并将结果存储在数组 count 中：count[k] 就是整数 k 的采样个数。
 * 我们以 浮点数 数组的形式，分别返回样本的最小值、最大值、平均值、中位数和众数。其中，众数是保证唯一的。
 * 我们先来回顾一下中位数的知识：
 * 如果样本中的元素有序，并且元素数量为奇数时，中位数为最中间的那个元素；
 * 如果样本中的元素有序，并且元素数量为偶数时，中位数为中间的两个元素的平均值。
 *
 * 示例 1：
 * 输入：count = [0,1,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
 * 输出：[1.00000,3.00000,2.37500,2.50000,3.00000]
 *
 * 示例 2：
 * 输入：count = [0,4,3,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 * ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
 * 输出：[1.00000,4.00000,2.18182,2.00000,1.00000]
 *
 * 提示：
 * count.length == 256
 * 1 <= sum(count) <= 10^9
 * 计数表示的众数是唯一的
 * 答案与真实值误差在 10^-5 以内就会被视为正确答案
 */
public class StatisticsFromALargeSample {
    public double[] sampleStats(int[] count) {
        int minValue = -1;
        int maxValue = 0;

        int manyCount = 0;
        int manyValue = 0;
        long sum = 0;
        int total = 0;

        for (int i = 0; i < 256; i++) {
            if (count[i] == 0) {
                continue;
            }
            if (minValue == -1) {
                minValue = i;
            }
            sum += count[i] * i;
            total += count[i];

            if (manyCount < count[i]) {
                manyValue = i;
                manyCount = count[i];
            }

            maxValue = i;
        }


        double averValue = (sum + 0.0) / total;
        double midValue = findMidValue(count, total);
        return new double[]{minValue, maxValue, averValue, midValue, manyValue};
    }

    private double findMidValue(int[] count, int total) {
        int mid = (total + 1) / 2;
        int sum = 0;
        int index = 0;
        boolean add = false;

        for (int i = 0; i < 256; i++) {
            if (count[i] == 0) {
                continue;
            }
            int temp = index + count[i];
            if (index < mid && mid <= temp) {
                sum += i;
                if (!add && (total % 2 == 1 || mid != temp)) {
                    sum += i;
                } else {
                    mid++;
                }
                add = true;
            }

            if (index > mid) {
                break;
            }
            index = temp;
        }
        return sum / 2.0;
    }
}
