package binarySearch;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/11/3 3:53 PM
 * @description
 */
public class LC_69_MySqrtTest {

    private LC_69_MySqrt mySqrt = new LC_69_MySqrt();

    @Test
    public void mySqrtTest(){
        assertThat(mySqrt.mySqrtBinarySearch(4), is(2));
        assertThat(mySqrt.mySqrtBinarySearch(8), is(2));
        assertThat(mySqrt.mySqrtBinarySearch(2147395599), is(46339));
    }

    @Test
    public void mySqrtNewTonTest(){
        assertThat(mySqrt.mySqrtNewTon(4), is(2));
        assertThat(mySqrt.mySqrtNewTon(8), is(2));
        assertThat(mySqrt.mySqrtNewTon(2147395599), is(46339));
    }
}
