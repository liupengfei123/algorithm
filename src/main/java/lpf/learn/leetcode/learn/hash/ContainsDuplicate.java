package lpf.learn.leetcode.learn.hash;

import java.util.HashSet;
import java.util.Set;

/** [217]存在重复元素
 *  给定一个整数数组，判断是否存在重复元素。
 *  如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 *  示例 1:
 *  输入: [1,2,3,1]
 * 输出: true
 *
 *  示例 2:
 *  输入: [1,2,3,4]
 * 输出: false
 *
 *  示例 3:
 *  输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 *
 * @author liupf
 * @date 2020-08-15 15:03
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size() != i + 1) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        int len = nums.length;
        for(int i = 1; i < len; i++){
            for(int j = i-1; j >= 0; j--){
                if(nums[i] > nums[j]){
                    break;
                }else if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
