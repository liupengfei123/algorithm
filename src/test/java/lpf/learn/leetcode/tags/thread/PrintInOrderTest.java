package lpf.learn.leetcode.tags.thread;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class PrintInOrderTest {

    @Test
    public void test1() {
        PrintInOrder temp = new PrintInOrder();

        Runnable first = () -> {
            try {
                temp.first(() -> System.out.println("1111111"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable second = () -> {
            try {
                temp.second(() -> System.out.println("222222"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable third = () -> {
            try {
                temp.third(() -> System.out.println("33333"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(third);
        executorService.submit(second);
        executorService.submit(first);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
