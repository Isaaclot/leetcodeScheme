package dynamic_programming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/11/20 12:23 AM
 * @description
 */
public class LC_120_MinimumTotalTest {

    LC_120_MinimumTotal mt = new LC_120_MinimumTotal();

    @Test
    public void minimumTotal() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Collections.singletonList(2));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(6, 5, 7));
        input.add(Arrays.asList(4, 1, 8, 3));
        assertThat(mt.minimumTotal(input), is(11));
    }

    @Test
    public void minimumTotal2() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Collections.singletonList(2));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(6, 5, 7));
        input.add(Arrays.asList(4, 1, 8, 3));
        assertThat(mt.minimumTotal2(input), is(11));
    }

    @Test
    public void minimumTotal3() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Collections.singletonList(2));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(6, 5, 7));
        input.add(Arrays.asList(4, 1, 8, 3));
        assertThat(mt.minimumTotal3(input), is(11));
    }

    @Test
    public void minimumTotal4() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Collections.singletonList(2));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(6, 5, 7));
        input.add(Arrays.asList(4, 1, 8, 3));
        assertThat(mt.minimumTotal4(input), is(11));
    }

    @Test
    public void minimumTotal4_1D() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Collections.singletonList(2));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(6, 5, 7));
        input.add(Arrays.asList(4, 1, 8, 3));
        assertThat(mt.minimumTotal4_1D(input), is(11));
    }
}
