package sword_offer;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2021/3/6
 */
public class O3DuplicateNumberTest {
    @Test
    public void test_given_array_num_then_any_duplicate_number_solution_1() {
        O3DuplicateNumber o3DuplicateNumber = new O3DuplicateNumber();
        int res = o3DuplicateNumber.findRepeatNumber_01(new int[]{2, 3, 1, 0, 2, 5, 3});
        assert Arrays.asList(2, 3).contains(res);

    }

    @Test
    public void test_given_array_num_then_any_duplicate_number_solution_2() {
        O3DuplicateNumber o3DuplicateNumber = new O3DuplicateNumber();
        int res = o3DuplicateNumber.findRepeatNumber_02(new int[]{2, 3, 1, 0, 2, 5, 3});
        assert Arrays.asList(2, 3).contains(res);

    }
}
