package lpf.learn.leetcode.game.weekly297;

import java.util.Arrays;

/** 5289. 公平分发饼干
 * 给你一个整数数组 cookies ，其中 cookies[i] 表示在第 i 个零食包中的饼干数量。另给你一个整数 k 表示等待分发零食包的孩子数量，所有 零食包都需要分发。在同一个零食包中的所有饼干都必须分发给同一个孩子，不能分开。
 * 分发的 不公平程度 定义为单个孩子在分发过程中能够获得饼干的最大总数。
 * 返回所有分发的最小不公平程度。
 *
 * 示例 1：
 * 输入：cookies = [8,15,10,20,8], k = 2
 * 输出：31
 * 解释：一种最优方案是 [8,15,8] 和 [10,20] 。
 * - 第 1 个孩子分到 [8,15,8] ，总计 8 + 15 + 8 = 31 块饼干。
 * - 第 2 个孩子分到 [10,20] ，总计 10 + 20 = 30 块饼干。
 * 分发的不公平程度为 max(31,30) = 31 。
 * 可以证明不存在不公平程度小于 31 的分发方案。
 *
 * 示例 2：
 * 输入：cookies = [6,1,3,2,2,4,1,2], k = 3
 * 输出：7
 * 解释：一种最优方案是 [6,1]、[3,2,2] 和 [4,1,2] 。
 * - 第 1 个孩子分到 [6,1] ，总计 6 + 1 = 7 块饼干。
 * - 第 2 个孩子分到 [3,2,2] ，总计 3 + 2 + 2 = 7 块饼干。
 * - 第 3 个孩子分到 [4,1,2] ，总计 4 + 1 + 2 = 7 块饼干。
 * 分发的不公平程度为 max(7,7,7) = 7 。
 * 可以证明不存在不公平程度小于 7 的分发方案。
 *
 * 提示：
 * 2 <= cookies.length <= 8
 * 1 <= cookies[i] <= 10^5
 * 2 <= k <= cookies.length
 */
public class FairDistributionOfCookies {
    int ans = Integer.MAX_VALUE;
    int[] cookies;
    int n;
    int k;

    public int distributeCookies(int[] cookies, int k) {

        //技巧：先发饼干较多的包，这样让回溯过程更快。下面的回溯代码是从最后一个饼干包开始发所以这里是从小到大排序
        Arrays.sort(cookies);

        this.cookies = cookies;
        n = cookies.length;
        this.k = k;

        //启动回溯
        backtrack(new int[k], n-1);

        return ans;
    }

    //bucket数组存放k个小朋友每个人当前的饼干数量，start为下一个要分发的饼干包下标
    public void backtrack(int[] bucket, int start){

        //饼干发完了，统计哪个小朋友获得的饼干最多，更新答案。
        if (start < 0){
            int curAns = Integer.MIN_VALUE;
            for (int count : bucket){
                curAns = Math.max(curAns, count);
            }
            ans = Math.min(ans, curAns);
            return;
        }

        //剪枝1：如果剩余的饼干包不够空手的小朋友分了，直接返回。
        int zeroCount = 0;
        for (int count : bucket){
            if (count == 0) zeroCount++;
        }
        if (zeroCount > start + 1) return;

        //剪枝2：如果某位小朋友的饼干数量比当前的答案还多，显然继续回溯下去也无法成为最优答案，直接返回。
        for (int i = 0; i < k; i++){
            if (bucket[i] > ans) return;
        }

        for (int i = 0; i < k; i++){
            //剪枝3：第一个零食包不管给哪个小朋友，所开启的回溯树都一样，只要给一个小朋友就行了，这样的回溯树一下子就少了很多。
            if (start == n - 1 && i > 0) return;

            //标准回溯代码
            bucket[i] += cookies[start];
            backtrack(bucket, start - 1);
            bucket[i] -= cookies[start];
        }
    }
}
