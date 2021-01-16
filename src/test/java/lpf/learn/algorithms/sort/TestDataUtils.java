package lpf.learn.algorithms.sort;

import java.util.Random;

/** 测试用例生成器
 * @author liupf
 * @date 2021-01-16 15:31
 */
public class TestDataUtils {

    public static Integer[] createRandomIntArray(int length, int max) {
        Random random = new Random();
        Integer[] result = new Integer[length];

        for (int i = 0; i < length; i++) {
            result[i] = random.nextInt(max);
        }
        return result;
    }

    public static Integer[] createOrderlyIntArray(int length) {
        Integer[] result = new Integer[length];
        for (int i = 0; i < length; i++) {
            result[i] = i;
        }
        return result;
    }
}
