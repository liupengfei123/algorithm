package lpf.learn.acwing.exercise;

import java.util.*;

/** 835. Trie字符串统计
 维护一个字符串集合，支持两种操作：
 I x 向集合中插入一个字符串 x；
 Q x 询问一个字符串在集合中出现了多少次。
 共有 N 个操作，所有输入的字符串总长度不超过 105，字符串仅包含小写英文字母。
 输入格式
 第一行包含整数 N，表示操作数。
 接下来 N 行，每行包含一个操作指令，指令为 I x 或 Q x 中的一种。
 输出格式
 对于每个询问指令 Q x，都要输出一个整数作为结果，表示 x 在集合中出现的次数。
 每个结果占一行。

 数据范围
 1≤N≤2∗104
 输入样例：
 5
 I abc
 Q abc
 Q ab
 I ab
 Q ab
 输出样例：
 1
 0
 1
 */
public class Q837 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt();
        Trie root = new Trie();

        while (m-- > 0) {
            char opt = sc.next().charAt(0);
            String line = sc.next();

            if (opt == 'I') {
                getTrie(root, line, false).count++;
            } else {
                Trie trie = getTrie(root, line, true);
                System.out.println(trie == null ? 0 : trie.count);

            }
        }
    }

    private static Trie getTrie(Trie node, String line, boolean isSearch) {
        for (char c : line.toCharArray()) {
            Trie trie = node.child[c - 'a'];
            if (trie == null) {
                if (isSearch) return null;

                trie = new Trie();
                node.child[c - 'a'] = trie;
            }
            node = trie;
        }
        return node;
    }

    static class Trie {
        int count;
        Trie[] child = new Trie[26];
    }
}
