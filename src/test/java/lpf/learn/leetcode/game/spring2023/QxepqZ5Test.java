package lpf.learn.leetcode.game.spring2023;

import org.junit.Assert;
import org.junit.Test;

public class QxepqZ5Test {
    @Test
    public void test1(){
        QxepqZ5 test = new QxepqZ5();
        Assert.assertEquals(2, test.fieldOfGreatestBlessing(new int[][]{{0,0,1},{1,0,1}}));
    }

    @Test
    public void test2(){
        QxepqZ5 test = new QxepqZ5();
        Assert.assertEquals(3, test.fieldOfGreatestBlessing(new int[][]{{4,4,6},{7,5,3},{1,6,2},{5,6,3}}));
    }

    @Test
    public void test3(){
        QxepqZ5 test = new QxepqZ5();
        Assert.assertEquals(4, test.fieldOfGreatestBlessing(new int[][]{{7,7,9},{7,5,3},{1,8,5},{5,6,3},{9,10,2},{8,4,10}}));
    }


    @Test
    public void test4(){
        QxepqZ5 test = new QxepqZ5();
        Assert.assertEquals(13, test.fieldOfGreatestBlessing(new int[][]{{932,566,342},{546,489,250},{723,454,748},{830,887,334},{617,534,721},{924,267,892},{151,64,65},{318,825,196},{102,941,940},{748,562,582},{76,938,228},{921,15,245},{871,96,823},{701,737,991},{339,861,146},{484,409,823},{574,728,557},{104,845,459},{363,804,94},{445,685,83},{324,641,328},{626,2,897},{656,627,521},{935,506,956},{210,848,502},{990,889,112}}));
    }

    @Test
    public void test5(){
        QxepqZ5 test = new QxepqZ5();
        Assert.assertEquals(15, test.fieldOfGreatestBlessing(new int[][]{{565,34,242},{299,628,870},{724,673,221},{128,267,917},{561,488,696},{341,71,604},{835,92,846},{945,696,973},{554,776,430},{209,134,594},{987,898,282},{819,154,462},{618,946,505},{561,40,677},{602,863,657},{295,83,718},{456,920,939},{94,717,813},{611,946,366},{818,850,85},{395,554,333},{325,700,628},{590,401,119},{248,858,499},{298,723,602},{189,538,646},{194,283,344},{842,535,866},{192,832,195}}));
    }
}