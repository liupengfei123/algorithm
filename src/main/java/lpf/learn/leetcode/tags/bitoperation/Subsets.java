package lpf.learn.leetcode.tags.bitoperation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** [78]子集
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 *
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 *
 * 示例 2：
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *
 * 提示：
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * nums 中的所有元素 互不相同
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        result.add(new ArrayList<>());
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j + i <= nums.length; j++) {
                help(i, j, new ArrayList<>(), nums, result);
            }
        }
        return result;
    }


    private void help(int count, int start, List<Integer> list, int[] nums, List<List<Integer>> result) {
        list.add(nums[start]);
        if (count-- > 1) {
            for (int i = start + 1; i + count <= nums.length; i++) {
                help(count, i, new ArrayList<>(list), nums, result);
            }
        } else {
            result.add(list);
        }
    }


    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<>());
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
