package lpf.learn.leetcode.tags.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** [229]求众数 II
 * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 *
 * 示例 1：
 * 输入：[3,2,3]
 * 输出：[3]
 *
 * 示例 2：
 * 输入：nums = [1]
 * 输出：[1]
 *
 * 示例 3：
 * 输入：[1,1,1,3,3,2,2,2]
 * 输出：[1,2]
 *
 * 提示：
 * 1 <= nums.length <= 5 * 10^4
 * -10^9 <= nums[i] <= 10^9
 */
public class MajorityElementIi {

    /**
     * 摩尔投票法
     */
    public List<Integer> majorityElement(int[] nums) {
        int element1 = 0;
        int element2 = 0;
        int vote1 = 0;
        int vote2 = 0;

        for (int num : nums) {
            if (vote1 > 0 && num == element1) { //如果该元素为第一个元素，则计数加1
                vote1++;
            } else if (vote2 > 0 && num == element2) { //如果该元素为第二个元素，则计数加1
                vote2++;
            } else if (vote1 == 0) { // 选择第一个元素
                element1 = num;
                vote1++;
            } else if (vote2 == 0) { // 选择第二个元素
                element2 = num;
                vote2++;
            } else { //如果三个元素均不相同，则相互抵消1次
                vote1--;
                vote2--;
            }
        }

        int cnt1 = 0;
        int cnt2 = 0;
        for (int num : nums) {
            if (vote1 > 0 && num == element1) {
                cnt1++;
            }
            if (vote2 > 0 && num == element2) {
                cnt2++;
            }
        }
        // 检测元素出现的次数是否满足要求
        List<Integer> ans = new ArrayList<>();
        if (vote1 > 0 && cnt1 > nums.length / 3) {
            ans.add(element1);
        }
        if (vote2 > 0 && cnt2 > nums.length / 3) {
            ans.add(element2);
        }

        return ans;
    }


    public List<Integer> majorityElement2(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;
        List<Integer> list = new ArrayList<>();
        int value = nums[0];
        int count = 0;

        for (int num : nums) {
            if (num == value) {
                count++;
            } else {
                if (count > length / 3) {
                    list.add(value);
                }
                value = num;
                count = 1;
            }
        }
        if (count > length / 3) {
            list.add(value);
        }
        return list;
    }
}
