package lpf.learn.leetcode.tags.backtrack;

import java.util.ArrayList;
import java.util.List;

/** [212]单词搜索 II
 *  给定一个 m x n 二维字符网格 board 和一个单词（字符串）列表 words，找出所有同时在二维网格和字典中出现的单词。
 * 单词必须按照字母顺序，通过 相邻的单元格 内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母在一个单词中不允许被重复使用。
 *
 * 示例 1：
 * 输入：board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]],
 *      words = ["oath","pea","eat","rain"]
 * 输出：["eat","oath"]
 *
 * 示例 2：
 * 输入：board = [["a","b"],["c","d"]], words = ["abcb"]
 * 输出：[]
 *
 * 提示：
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 12
 * board[i][j] 是一个小写英文字母
 * 1 <= words.length <= 3 * 104
 * 1 <= words[i].length <= 10
 * words[i] 由小写英文字母组成
 * words 中的所有字符串互不相同
 */
public class WordSearchIi {

    private int m;
    private int n;
    private char[][] board;
    private boolean[][] used;

    public List<String> findWords(char[][] board, String[] words) {
        this.m = board.length;
        this.n = board[0].length;
        this.board = board;
        this.used = new boolean[m][n];

        List<int[]>[] charPoint = new ArrayList[26];
        for (int i = 0; i < charPoint.length; i++) {
            charPoint[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                charPoint[board[i][j] - 'a'].add(new int[]{i, j});
            }
        }

        List<String> result = new ArrayList<>();
        for (String word : words) {
            for (int[] ints : charPoint[word.charAt(0) - 'a']) {
                if (help(word, ints[0], ints[1], 0)) {
                    result.add(word);
                    break;
                }
            }
        }

        return result;
    }

    private boolean help(String word, int i, int j, int w) {
        if (w >= word.length()) {
            return true;
        }
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return false;
        }
        if (used[i][j] || word.charAt(w) != board[i][j]) {
            return false;
        }
        used[i][j] = true;

        boolean value = help(word, i + 1, j, w + 1);
        value = value || help(word, i - 1, j, w + 1);
        value = value || help(word, i, j + 1, w + 1);
        value = value || help(word, i, j - 1, w + 1);

        used[i][j] = false;
        return value;
    }
}
