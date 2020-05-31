package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/6/1
 */
public class LC_1431_KidsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            res.add(isMostCandies(i, candies, candies[i] + extraCandies));
        }
        return res;
    }

    private Boolean isMostCandies(int i, int[] candies, int newCur) {
        for (int j = 0; j < candies.length; j++) {
            if (i != j && candies[j] > newCur) {
                return false;
            }
        }
        return true;
    }
}
