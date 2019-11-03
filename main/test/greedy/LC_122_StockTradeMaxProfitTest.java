package greedy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/11/3 11:18 AM
 * @description
 */
public class LC_122_StockTradeMaxProfitTest {

    private LC_122_StockTradeMaxProfit stockTradeMaxProfit = new LC_122_StockTradeMaxProfit();

    @Test
    public void maxProfitTest() {
        assertThat(stockTradeMaxProfit.maxProfit(new int[]{7, 1, 5, 3, 6, 4}), is(7));
        assertThat(stockTradeMaxProfit.maxProfit(new int[]{1, 2, 3, 4, 5}), is(4));
        assertThat(stockTradeMaxProfit.maxProfit(new int[]{7, 6, 4, 3, 1}), is(0));
    }
}
