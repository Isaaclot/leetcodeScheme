package dynamic_programming;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * @author alis
 * @date 2019/11/17 11:24 PM
 * @description
 */
public class LC_647_CountSubstringsTest {

    private LC_647_CountSubstrings countSubstringsDomain = new LC_647_CountSubstrings();

    @Test
    public void testCountSubstringsDomain(){
        Assert.assertThat(countSubstringsDomain.countSubstrings("abc"), is(3));
    }
}
