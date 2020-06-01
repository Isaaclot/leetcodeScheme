package recursion;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/6/2
 */
public class LCI_64_AddSumLCOF {
    public int sumNums(int n) {
        Boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
