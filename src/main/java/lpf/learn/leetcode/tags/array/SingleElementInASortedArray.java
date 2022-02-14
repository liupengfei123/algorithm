package lpf.learn.leetcode.tags.array;

/** [540]有序数组中的单一元素
 * 给你一个仅由整数组成的有序数组，其中每个元素都会出现两次，唯有一个数只会出现一次。
 * 请你找出并返回只出现一次的那个数。
 * 你设计的解决方案必须满足 O(log n) 时间复杂度和 O(1) 空间复杂度。
 *
 * 示例 1:
 * 输入: nums = [1,1,2,3,3,4,4,8,8]
 * 输出: 2
 *
 * 示例 2:
 * 输入: nums =  [3,3,7,7,10,11,11]
 * 输出: 10
 *
 * 提示:
 * 1 <= nums.length <= 10^5
 * 0 <= nums[i] <= 10^5
 */
public class SingleElementInASortedArray {

    /**
     *  由于数组是有序的，因此数组中相同的元素一定相邻。对于下标 x 左边的下标 y，如果 nums[y] == nums[y + 1]，则 y 一定是偶数；
     *  对于下标 x 右边的下标 z，如果 nums[z] == nums[z + 1]，则 z 一定是奇数。由于下标 x 是相同元素的开始下标的奇偶性的分界，
     *  因此可以使用二分查找的方法寻找下标 x。
     */
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] == nums[mid ^ 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }


    public int singleNonDuplicate4(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            mid -= mid & 1;
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }


    public int singleNonDuplicate3(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0, right = nums.length - 1;
        if (nums[right] != nums[right - 1]) {
            return nums[right];
        }
        if (nums[left] != nums[left + 1]) {
            return nums[left];
        }

        while (left < right) {
            int mid = (right - left ) / 2 + left;

            if (nums[mid] == nums[mid + 1]) {
                mid = mid + 1;
            } else if (nums[mid] == nums[mid - 1]) {
            } else {
                return nums[mid];
            }

            if ((right - mid) % 2 == 1) {
                left = mid - 1;
            } else {
                right = mid;
            }
        }
        return 0;
    }





    // O(n)
    public int singleNonDuplicate2(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result = result ^ num;
        }

        return result;
    }
}
