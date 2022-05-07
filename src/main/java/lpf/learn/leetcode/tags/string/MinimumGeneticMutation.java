package lpf.learn.leetcode.tags.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/** [433]最小基因变化
 * 基因序列可以表示为一条由 8 个字符组成的字符串，其中每个字符都是 'A'、'C'、'G' 和 'T' 之一。
 * 假设我们需要调查从基因序列 start 变为 end 所发生的基因变化。一次基因变化就意味着这个基因序列中的一个字符发生了变化。
 *
 * 例如，"AACCGGTT" --> "AACCGGTA" 就是一次基因变化。
 * 另有一个基因库 bank 记录了所有有效的基因变化，只有基因库中的基因才是有效的基因序列。
 *
 * 给你两个基因序列 start 和 end ，以及一个基因库 bank ，请你找出并返回能够使 start 变化为 end 所需的最少变化次数。
 * 如果无法完成此基因变化，返回 -1 。
 *
 * 注意：起始基因序列 start 默认是有效的，但是它并不一定会出现在基因库中。
 *
 * 示例 1：
 * 输入：start = "AACCGGTT", end = "AACCGGTA", bank = ["AACCGGTA"]
 * 输出：1
 *
 * 示例 2：
 * 输入：start = "AACCGGTT", end = "AAACGGTA", bank = ["AACCGGTA","AACCGCTA","AAACGGTA"]
 * 输出：2
 *
 * 示例 3：
 * 输入：start = "AAAAACCC", end = "AACCCCCC", bank = ["AAAACCCC","AAACCCCC","AACCCCCC"]
 * 输出：3
 *
 * 提示：
 * start.length == 8
 * end.length == 8
 * 0 <= bank.length <= 10
 * bank[i].length == 8
 * start、end 和 bank[i] 仅由字符 ['A', 'C', 'G', 'T'] 组成
 */
public class MinimumGeneticMutation {
    public int minMutation(String start, String end, String[] bank) {
        Map<String, List<String>> linkMap = new HashMap<>();
        Map<String, Integer> minStep = new HashMap<>();

        for (int i = 0; i < bank.length; i++) {
            minStep.put(bank[i], Integer.MAX_VALUE);

            for (int j = i + 1; j < bank.length; j++) {
                if (canConvert(bank[i], bank[j])) {
                    List<String> temp = linkMap.getOrDefault(bank[i], new ArrayList<>());
                    temp.add(bank[j]);
                    linkMap.putIfAbsent(bank[i], temp);

                    temp = linkMap.getOrDefault(bank[j], new ArrayList<>());
                    temp.add(bank[i]);
                    linkMap.putIfAbsent(bank[j], temp);
                }
            }
        }
        List<String> list = linkMap.get(start);
        if (list == null) {
            list = new ArrayList<>();
            linkMap.put(start, list);

            for (String s : bank) {
                if (canConvert(s, start)) {
                    List<String> temp = linkMap.getOrDefault(s, new ArrayList<>());
                    temp.add(start);
                    linkMap.putIfAbsent(s, temp);

                    list.add(s);
                }
            }
        }

        minStep.put(start, 0);

        Set<String> used = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);

        int step = -1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            step++;
            for (int i = 0; i < size; i++) {
                String value = queue.poll();

                minStep.merge(value, step, Integer::min);

                List<String> nexts = linkMap.get(value);
                for (String next : nexts) {
                    if (used.contains(next)) {
                        continue;
                    }
                    queue.offer(next);
                    used.add(next);
                }
            }
        }
        Integer integer = minStep.get(end);
        if (integer == null) {
            return -1;
        }
        return integer == Integer.MAX_VALUE ? -1 : integer;
    }



    private boolean canConvert(String s1, String s2) {
        int diffCount = 0;
        for (int i = 0; i < 8; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount == 1;
    }
}
