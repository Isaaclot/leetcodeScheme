package array;

/**
 * 思路
 * 1. ~~从前往后遍历数组，如果元素为0，~~~~则交换位置~~~~，将0位与最后一个非0位交换位置，直到将数据遍历到0的下标为止~~
 * 2. 遍历数组，0位提出来，后续元素向前移动位置，移动完了，把0元素位放在最后一位(14ms)
 * 3. 用一个常量保存其实位置的0元素下标，遍历数组的时候，将非0元素与这个0下标的元素交换位置(1ms)
 *
 * @date 2019/10/16 12:21 AM
 */
public class MoveZeroes {

    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{0, 0, 1});
        new MoveZeroes().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZeroes(int[] nums) {
        int j = nums.length;
        for (int i = 0; i < j; ) {
            if (nums[i] == 0) {
                int temp = nums[i];
                for (int i1 = i; i1 < j - 1; i1++) {
                    nums[i1] = nums[i1 + 1];
                }
                nums[j - 1] = temp;
                j--;
            } else {
                i++;
            }

        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public void moveZeroes1(int[] nums) {
        int j = 0;//保存0元素下标
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }

    public void moveZeroes3(int[] nums) {
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[zeroIndex++] = nums[i]; // 利用javap运算，减少代码量
                nums[i] = 0;
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
