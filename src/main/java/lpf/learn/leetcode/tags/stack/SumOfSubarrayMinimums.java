package lpf.learn.leetcode.tags.stack;

import java.util.Stack;

/** [907]子数组的最小值之和
 *
 * 给定一个整数数组 A，找到 min(B) 的总和，其中 B 的范围为 A 的每个（连续）子数组。
 * 由于答案可能很大，因此返回答案模 10^9 + 7。
 *
 * 示例：
 * 输入：[3,1,2,4]
 * 输出：17
 * 解释：
 * 子数组为 [3]，[1]，[2]，[4]，[3,1]，[1,2]，[2,4]，[3,1,2]，[1,2,4]，[3,1,2,4]。
 * 最小值为 3，1，2，4，1，1，2，1，1，1，和为 17。
 *
 * 提示：
 * 1 <= A <= 30000
 * 1 <= A[i] <= 30000
 */
public class SumOfSubarrayMinimums {


    /**方法 2：维护最小值栈
     * 想法
     * 对于每个 j，考虑所有子序列 [i, j] 的最小值。想法是每当我们增加 j，这些最小值可能会有关联，事实上，min(A[i:j+1]) = min(A[i:j], A[j+1])。
     * 模拟数组 A = [1,7,5,2,4,3,9]，当 j = 6 事所有子序列 [i, j] 的最小值为 B = [1,2,2,2,3,3,9]，可以发现重要点是 i = 0, i = 3, i = 5, i = 6 ，
     * 分别是从 j 开始向左移动遇到的最小值的位置。
     *
     * 算法
     * 维护关于重要点的编码 B，对于上面提到的 (A, j) 维护 stack = [(val=1, count=1), (val=2, count=3), (val=3, count=2), (val=9, count=1)]，
     * 这表示最小值的编码为 B = [1,2,2,2,3,3,9]。对于每个 j 我们需要计算 sum(B)。
     * 当我们增加 j，我们用最新的元素 (val=x, count=1) 更新栈。弹出所有值 >= x 的元素，因为当前子序列 [i, j] 的最小值将是 A[j] 而不是之前的值。
     */
    public int sumSubarrayMins2(int[] A) {
        Stack<Pair> stack = new Stack<>();
        //tmp 记录从 【0，i - 1】的最小值和
        int res = 0, tmp = 0;
        for (int i = 0; i < A.length; i++) {
            int count = 1;
            while (!stack.empty() && stack.peek().val >= A[i]) {
                Pair pop = stack.pop();
                count += pop.count;
                //减去 【x, i - 1】这个区间内最小值 比 A【i】大的值
                tmp -= pop.val * pop.count;
            }
            stack.push(new Pair(A[i], count));
            tmp += A[i] * count;
            res += tmp;
            res %= 10_0000_0007;
        }
        return res;
    }

    class Pair {
        public int val;
        public int count;

        public Pair(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }


    /** 前驱 / 后继数组
     * 考虑从A中的每个元素A[i]，如果求出包含A[i]并以A[i]为最小元素的所有子数组个数n[i]，则元素A[i]对答案ans的贡献为n[i]*A[i]，
     * 那么我们可以先求包含A[i]并以A[i]为最小元素的最长子数组，
     *
     * 如果A[i]左边第一个小于A[i]的元素为A[left]，A[i]右边第一个小于A[i]的元素为A[right]，则包含A[i]并以A[i]为最小元素的最长子数组为A[left+1:right]，
     *
     * 满足以A[i]为最小元素的所有子数组个数n[i] = (i-left)*(right-i)。
     * 我们用left[i]表示A[i]左边第一个小于A[i]元素的位置，用right[i]表示A[i]右边第一个小于A[i]元素的位置，left数组初始值为-1，right数组初始值为len(A)，
     *
     * 求解left和right可以用单调栈来实现，可以两遍遍历，也可以一遍遍历，更优化的写法还可以一边遍历一边求解ans。
     */
    public int sumSubarrayMins3(int[] A) {
        int MOD = 10_0000_0007;
        int N = A.length;

        Stack<Integer> stack = new Stack();
        int[] prev = new int[N];
        for (int i = 0; i < N; ++i) {
            while (!stack.isEmpty() && A[i] <= A[stack.peek()])
                stack.pop();
            prev[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack = new Stack();
        int[] next = new int[N];
        for (int k = N-1; k >= 0; --k) {
            while (!stack.isEmpty() && A[k] < A[stack.peek()])
                stack.pop();
            next[k] = stack.isEmpty() ? N : stack.peek();
            stack.push(k);
        }

        long ans = 0;
        for (int i = 0; i < N; ++i) {
            ans += (i - prev[i]) * (next[i] - i) % MOD * A[i] % MOD;
            ans %= MOD;
        }
        return (int) ans;

    }


    /**
     * 直接使用 dp 但是内存超出限制
     */
    public int sumSubarrayMins(int[] A) {
        if (A == null) {
            return 0;
        }

        // dp[i][j] 表示在数组 A 中从 i 到 j 的子数组中最小值
        // dp[i][j] = min(dp[i][j - 1], dp[j][j])
        int size = A.length;
        int[][] dp = new int[size][size];

        for (int i = 0; i < size; i++) {
            dp[i][i] = A[i];
        }
        for (int i = 1; i < size; i++) {
            for (int j = 0; i + j < size; j++) {
                dp[j][i + j] = Math.min(dp[j][i + j - 1], dp[i + j][i + j]);
            }
        }

        int result = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = dp[i][j];
                if (value != 0) {
                    result = (result + value) % 10_0000_0007;
                }
            }
        }
        return result;
    }
}
