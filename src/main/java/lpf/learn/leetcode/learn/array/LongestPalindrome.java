package lpf.learn.leetcode.learn.array;

import java.util.Arrays;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 *
 * 示例 2：
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {
        return dynamicProgramming(s);
        // return expandAroundCenter(s);
    }

    /**
     * 使用动态规划
     *
     * 思路如果一个字符串是回文字符串，那么去掉首尾的两个字符之后也是回文字符串。
     * P(i,i)=true
     * P(i,i+1)=(Si ==Si+1)
     * ​
     * @param s
     * @return
     */
    private String dynamicProgramming(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        String result = "";
        int length = s.length();
        //保存验证的记录
        boolean[][] dp = new boolean[length][length];

        //从回文长度从 0 到 字符长度开始遍历
        for (int l = 0; l < length; l++) {
            //回文字符的开始位置
            for (int i = 0; i + l < length; i++) {
                int j = i + l;

                if (l == 0) {
                    dp[i][j] = true;
                } else if (l == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) &&  dp[i + 1][j - 1];
                }
                if (dp[i][j] && l + 1 > result.length()) {
                    result = s.substring(i, j + 1);
                }
            }
        }
        return result;
    }


    /**
     * 中心扩展算法
     * @param s
     * @return
     */
    private String expandAroundCenter(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenterLength(s, i, i);
            int len2 = expandAroundCenterLength(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenterLength(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }


}
