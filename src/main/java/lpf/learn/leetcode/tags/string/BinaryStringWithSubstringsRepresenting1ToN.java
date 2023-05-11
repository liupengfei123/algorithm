package lpf.learn.leetcode.tags.string;

public class BinaryStringWithSubstringsRepresenting1ToN {
    public boolean queryString(String s, int n) {
        long[] cnt = new long[15625020];
        char[] chars = s.toCharArray();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') continue;

            long value = 0;
            for (int j = i; j < length; j++) {
                value = (value << 1) + chars[j] - '0';

                if (value > 1000_000_010) break;

                cnt[(int) (value / 64)] |= 1L << ((value % 64) - 1);
            }
        }

        for (int i = 1; i <= n; i++) {
            if (i / 64 >= cnt.length) return false;

            if ((cnt[i / 64] & 1L << ((i % 64) - 1)) == 0) return false;
        }
        return true;
    }
}
