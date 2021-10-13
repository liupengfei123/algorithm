package lpf.learn.leetcode.tags.number;

import java.util.ArrayList;
import java.util.List;

/** [412]Fizz Buzz
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 *
 * 示例：
 * n = 15,
 * 返回:
 * [
 *    "1",
 *    "2",
 *    "Fizz",
 *    "4",
 *    "Buzz",
 *    "Fizz",
 *    "7",
 *    "8",
 *    "Fizz",
 *    "Buzz",
 *    "11",
 *    "Fizz",
 *    "13",
 *    "14",
 *    "FizzBuzz"
 * ]
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            int temp1 = i % 3;
            int temp2 = i % 5;
            if (temp1 == 0 && temp2 == 0) {
                result.add("FizzBuzz");
            } else if (temp1 == 0){
                result.add("Fizz");
            } else if (temp2 == 0){
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
