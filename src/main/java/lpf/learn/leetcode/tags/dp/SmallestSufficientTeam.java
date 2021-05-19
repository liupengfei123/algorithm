package lpf.learn.leetcode.tags.dp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * [1125]最小的必要团队
 * 作为项目经理，你规划了一份需求的技能清单 req_skills，并打算从备选人员名单 people 中选出些人组成一个「必要团队」（ 编号为 i 的备选人员people[i] 含有一份该备选人员掌握的技能列表）。
 * 所谓「必要团队」，就是在这个团队中，对于所需求的技能列表 req_skills 中列出的每项技能，团队中至少有一名成员已经掌握。可以用每个人的编号来表示团
 * 队中的成员：
 * 例如，团队 team = [0, 1, 3] 表示掌握技能分别为 people[0]，people[1]，和 people[3] 的备选人员。
 * <p>
 * 请你返回 任一 规模最小的必要团队，团队成员用人员编号表示。你可以按 任意顺序 返回答案，题目数据保证答案存在。
 * <p>
 * 示例 1：
 * 输入：req_skills = ["java","nodejs","reactjs"], people = [["java"],["nodejs"],["nodejs","reactjs"]]
 * 输出：[0,2]
 * <p>
 * 示例 2：
 * <p>
 * 输入：req_skills = ["algorithms","math","java","reactjs","csharp","aws"],
 * people = [["algorithms","math","java"],["algorithms","math","reactjs"],["java","csharp","aws"],["reactjs","csharp"],["csharp","math"],["aws","java"]]
 * 输出：[1,2]
 * <p>
 * 提示：
 * 1 <= req_skills.length <= 16
 * 1 <= req_skills[i].length <= 16
 * req_skills[i] 由小写英文字母组成
 * req_skills 中的所有字符串 互不相同
 * 1 <= people.length <= 60
 * 0 <= people[i].length <= 16
 * 1 <= people[i][j].length <= 16
 * people[i][j] 由小写英文字母组成
 * people[i] 中的所有字符串 互不相同
 * people[i] 中的每个技能是 req_skills 中的技能
 * 题目数据保证「必要团队」一定存在
 */
public class SmallestSufficientTeam {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        int length = req_skills.length;
        Map<String, Integer> map = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            map.put(req_skills[i], i);
        }

        int[] people_mask = new int[people.size()];
        for (int i = 0; i < people.size(); i++) {
            int mask = 0;
            for (String s : people.get(i)) {
                mask |= 1 << map.get(s);
            }
            people_mask[i] = mask;
        }

        int num = 1 << length;
        Set<Integer>[] dp = new HashSet[num];
        dp[0] = new HashSet<>();
        for (int i = 0; i < num; i++) {
            if (dp[i] == null) {
                continue;
            }

            for (int j = 0; j < people_mask.length; j++) {
                //这个人没有存在价值
                if (people_mask[j] == 0) {
                    continue;
                }
                //下一状态
                int next = people_mask[j] | i;
                //下一状态还未满足，或者需要的人数超过当前组合
                if (dp[next] == null || dp[next].size() > dp[i].size() + 1) {
                    dp[next] = new HashSet<>(dp[i]);
                    dp[next].add(j);
                }
            }
        }
        return dp[num - 1].stream().sorted().mapToInt(Integer::valueOf).toArray();
    }
}
