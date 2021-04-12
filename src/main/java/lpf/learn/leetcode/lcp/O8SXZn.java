package lpf.learn.leetcode.lcp;

import java.util.stream.IntStream;

/**
 * [LCP 33]蓄水
 * 给定 N 个无限容量且初始均空的水缸，每个水缸配有一个水桶用来打水，第 `i` 个水缸配备的水桶容量记作 `bucket[i]`。小扣有以下两种操作：
 * - 升级水桶：选择任意一个水桶，使其容量增加为 `bucket[i]+1`
 * - 蓄水：将全部水桶接满水，倒入各自对应的水缸
 * <p>
 * 每个水缸对应最低蓄水量记作 `vat[i]`，返回小扣至少需要多少次操作可以完成所有水缸蓄水要求。
 * 注意：实际蓄水量 **达到或超过** 最低蓄水量，即完成蓄水要求。
 * <p>
 * **示例 1：**
 * >输入：`bucket = [1,3], vat = [6,8]`
 * >输出：`4`
 * >解释：
 * >第 1 次操作升级 bucket[0]；
 * >第 2 ~ 4 次操作均选择蓄水，即可完成蓄水要求。
 * ![vat1.gif](https://pic.leetcode-cn.com/1616122992-RkDxoL-vat1.gif)
 * <p>
 * **示例 2：**
 * >输入：`bucket = [9,0,1], vat = [0,2,2]`
 * >输出：`3`
 * >解释：
 * >第 1 次操作均选择升级 bucket[1]
 * >第 2~3 次操作选择蓄水，即可完成蓄水要求。
 * <p>
 * **提示：**
 * - `1 <= bucket.length == vat.length <= 100`
 * - `0 <= bucket[i], vat[i] <= 10^4`
 */
public class O8SXZn {
    /**
     * 因为添加的水超过 vat[i] 即可不需要刚好等于，于是获取最小次数，一定是先升级桶，再进行蓄水，
     * 对于假定知道了 蓄水次数的，求升级次数， 该水桶要升级的次数 = 水缸容量/蓄水次数 - 水桶容量
     * 又因为 vat[i] <= 10^4 所以 蓄水次数最多 10000 次。
     */
    public int storeWater(int[] bucket, int[] vat) {
        int max = IntStream.of(vat).max().getAsInt();
        if (max == 0) {
            return 0;
        }
        int n = bucket.length;
        int ans = Integer.MAX_VALUE;

        //遍历倒水次数
        for (int i = 1; i <= 10000; i++) {
            int per;

            //倒水i次，所以操作次数 i
            int cur = i;
            //遍历每个水缸
            for (int j = 0; j < n; j++) {
                // 水槽容量/倒水次数=每次倒水量
                // +（i - 1）目的是为了向上取整(除完后如果有余数，加上i-1之后就一定会多商1，从而达到向上取整的功能)
                per = (vat[j] + i - 1) / i;
                //使用vat[j]%i==0 ? vat[j]/i : vat[j]/i+1 代替也行，但是更慢
                // 每次倒水量-初始水量=需要升级次数
                cur += Math.max(0, per - bucket[j]);
            }
            ans = Math.min(ans, cur);//所有倒水次数中，取最小的操作次数
        }
        return ans;
    }
}
