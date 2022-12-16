package lpf.learn.leetcode.game.autumn2022;

public class TOne {


    public int minNumBooths(String[] demand) {
        int[] max = new int[26];
        for (String s : demand) {
            int[] temp = getCounts(s);
            for (int i = 0; i < 26; i++) {
                max[i] = Math.max(max[i], temp[i]);
            }
        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum += max[i];
        }
        return sum;
    }

    private int[] getCounts(String value) {
        int[] array = new int[26];
        for (int i = 0; i < value.length(); i++) {
            array[value.charAt(i) - 'a']++;
        }
        return array;
    }


}
