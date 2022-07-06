package lpf.learn.leetcode.game.weekly300;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfPeopleAwareOfASecretTest {

    @Test
    public void test1() {
        NumberOfPeopleAwareOfASecret test = new NumberOfPeopleAwareOfASecret();
        Assert.assertEquals(5, test.peopleAwareOfSecret(6, 2, 4));
    }

    @Test
    public void test2() {
        NumberOfPeopleAwareOfASecret test = new NumberOfPeopleAwareOfASecret();
        Assert.assertEquals(6, test.peopleAwareOfSecret(4, 1, 3));
    }

    @Test
    public void test3() {
        NumberOfPeopleAwareOfASecret test = new NumberOfPeopleAwareOfASecret();
        Assert.assertEquals(8, test.peopleAwareOfSecret(4, 1, 4));
    }

    @Test
    public void test4() {
        NumberOfPeopleAwareOfASecret test = new NumberOfPeopleAwareOfASecret();
        Assert.assertEquals(2, test.peopleAwareOfSecret(6, 1, 2));
    }

    @Test
    public void test5() {
        NumberOfPeopleAwareOfASecret test = new NumberOfPeopleAwareOfASecret();
        Assert.assertEquals(841452243, test.peopleAwareOfSecret(904, 63, 102));
    }
}
