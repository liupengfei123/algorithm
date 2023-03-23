package lpf.learn.leetcode.tags.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class ArithmeticSubarraysTest {

    @Test
    public void test1(){
        ArithmeticSubarrays test = new ArithmeticSubarrays();

        MatcherAssert.assertThat(test.checkArithmeticSubarrays(new int[]{4,6,5,9,3,7}, new int[]{0,0,2}, new int[]{2,3,5})
                , Matchers.contains(true, false, true));

    }

    @Test
    public void test2(){
        ArithmeticSubarrays test = new ArithmeticSubarrays();

        MatcherAssert.assertThat(test.checkArithmeticSubarrays(new int[]{-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10},
                        new int[]{0,1,6,4,8,7}, new int[]{4,4,9,7,9,10})
                , Matchers.contains(false,true,false,false,true,true));
    }
}
