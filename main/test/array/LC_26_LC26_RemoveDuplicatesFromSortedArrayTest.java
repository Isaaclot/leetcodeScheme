package array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/10/20 3:00 PM
 * @description
 */
public class LC_26_LC26_RemoveDuplicatesFromSortedArrayTest {

    private LC_26_RemoveDuplicatesFromSortedArray duplicatesFromSortedArray = new LC_26_RemoveDuplicatesFromSortedArray();

    private int[] sortNums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    @Test
    public void removeDuplicatesTest() {
         assertThat(duplicatesFromSortedArray.removeDuplicates(sortNums), is(5));
         assertThat(duplicatesFromSortedArray.removeDuplicates(new int[]{1,1,2}), is(2));
         assertThat(duplicatesFromSortedArray.removeDuplicates(new int[]{1,2}), is(2));
         assertThat(duplicatesFromSortedArray.removeDuplicates(new int[]{1,1}), is(1));
    }
}
