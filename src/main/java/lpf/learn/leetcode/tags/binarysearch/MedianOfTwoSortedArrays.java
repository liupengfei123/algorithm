package lpf.learn.leetcode.tags.binarysearch;

/** [4]寻找两个正序数组的中位数
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 * 示例 1：
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 *
 * 示例 2：
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 *
 * 示例 3：
 * 输入：nums1 = [0,0], nums2 = [0,0]
 * 输出：0.00000
 *
 * 示例 4：
 * 输入：nums1 = [], nums2 = [1]
 * 输出：1.00000
 *
 * 示例 5：
 * 输入：nums1 = [2], nums2 = []
 * 输出：2.00000
 *
 * 提示：
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 *
 * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Double value = findResultForOther(nums1, nums2);
        if (value != null) {
            return value;
        }

        int length = nums1.length + nums2.length;

        int index1 = (length - 1) / 2;
        int index2 = length / 2;
        double sum = 0;
        int index = 0, i = 0, j = 0, temp;
        while (index <= index2) {
            if (j >= nums2.length || (i < nums1.length && nums1[i] < nums2[j])) {
                temp = nums1[i++];
            } else {
                temp = nums2[j++];
            }

            if (index == index1 || index == index2) {
                sum += temp;
            }
            index++;
        }
        return index2 == index1 ? sum : sum / 2;
    }

    private Double findResultForOther(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return (double) (nums2[(nums2.length - 1) / 2] + nums2[nums2.length / 2]) / 2;
        }
        if (nums2.length == 0) {
            return (double) (nums1[(nums1.length - 1) / 2] + nums1[nums1.length / 2]) / 2;
        }

        if (nums1[nums1.length - 1] <= nums2[0]) {
            return findResultInSeq(nums1, nums2);
        }

        if (nums1[0] >= nums2[nums2.length - 1]) {
            return findResultInSeq(nums2, nums1);
        }

        return null;
    }

    private double findResultInSeq(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;

        int index1 = (length - 1) / 2;
        int index2 = length / 2;

        double sum = index1 >= nums1.length ? nums2[index1 - nums1.length] : nums1[index1];
        sum += index2 >= nums1.length ? nums2[index2 - nums1.length] : nums1[index2];

        return sum / 2;
    }
}
