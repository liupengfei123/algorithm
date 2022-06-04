package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class UniqueEmailAddressesTest {

    @Test
    public void test1() {
        UniqueEmailAddresses temp = new UniqueEmailAddresses();
        Assert.assertEquals(2, temp.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }

    @Test
    public void test2() {
        UniqueEmailAddresses temp = new UniqueEmailAddresses();
        Assert.assertEquals(3, temp.numUniqueEmails(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
    }

}
