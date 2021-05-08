package lpf.learn.leetcode.tags.backtrack;

import java.util.Arrays;
import java.util.stream.IntStream;

/** [1723]完成所有工作的最短时间
 * 给你一个整数数组 jobs ，其中 jobs[i] 是完成第 i 项工作要花费的时间。
 * 请你将这些工作分配给 k 位工人。所有工作都应该分配给工人，且每项工作只能分配给一位工人。工人的 工作时间 是完成分配给他们的所有工作花费时间的总和。请你
 * 设计一套最佳的工作分配方案，使工人的 最大工作时间 得以 最小化 。
 * 返回分配方案中尽可能 最小 的 最大工作时间 。
 *
 * 示例 1：
 * 输入：jobs = [3,2,3], k = 3
 * 输出：3
 * 解释：给每位工人分配一项工作，最大工作时间是 3 。
 *
 * 示例 2：
 * 输入：jobs = [1,2,4,7,8], k = 2
 * 输出：11
 * 解释：按下述方式分配工作：
 * 1 号工人：1、2、8（工作时间 = 1 + 2 + 8 = 11）
 * 2 号工人：4、7（工作时间 = 4 + 7 = 11）
 * 最大工作时间是 11 。
 *
 * 提示：
 * 1 <= k <= jobs.length <= 12
 * 1 <= jobs[i] <= 107
 */
public class FindMinimumTimeToFinishAllJobs {

    public int minimumTimeRequired(int[] jobs, int k) {
        Arrays.sort(jobs);
        // 将结果的二分法， 下限为所有工作中的最大工作量，上限为所有工作的工作量之和
        int l = jobs[jobs.length - 1], r = Arrays.stream(jobs).sum();
        while (l < r) {
            int mid = (l + r) >> 1;
            if (check(jobs, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean check(int[] jobs, int k, int limit) {
        int[] workloads = new int[k];
        return backtrack(jobs, workloads, jobs.length - 1, limit);
    }

    private boolean backtrack(int[] jobs, int[] workloads, int i, int limit) {
        if (i < 0) {
            return true;
        }
        int cur = jobs[i];
        for (int j = 0; j < workloads.length; ++j) {
            if (workloads[j] + cur <= limit) {
                workloads[j] += cur;
                if (backtrack(jobs, workloads, i - 1, limit)) {
                    return true;
                }
                workloads[j] -= cur;
            }
            // 如果当前工人未被分配工作，那么下一个工人也必然未被分配工作
            // 或者当前工作恰能使该工人的工作量达到了上限
            // 这两种情况下我们无需尝试继续分配工作
            if (workloads[j] == 0 || workloads[j] + cur == limit) {
                break;
            }
        }
        return false;
    }










    private int result;
    private int[] jobs;
    private int[] persons;
    private int k;


    public int minimumTimeRequired2(int[] jobs, int k) {
        this.jobs = jobs;
        this.persons = new int[k];
        this.k = k;
        this.result = Integer.MAX_VALUE;

        help(0);
        return result;
    }


    private void help(int i) {
        if (i >= jobs.length) {
            int max = IntStream.of(persons).max().getAsInt();
            result = Math.min(result, max);
            return;
        }
        for (int j = 0; j < k; j++) {
            persons[j] += jobs[i];
            help(i + 1);
            persons[j] -= jobs[i];
        }
    }
}
