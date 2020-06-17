package lpf.learn.leetcode.learn.array;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String first = strs[0];
        String result = "";

        out:
        for (int i = 0; i <= first.length(); i++) {
            String temp = first.substring(0, i);
            for (String str : strs) {
                if (!str.startsWith(temp)) {
                    break out;
                }
            }
            result = temp;
        }
        return result;
    }
}
