package array;

/**
 * Created by RoyLeo on 2016/9/10.
 */
public class Solution {

    /* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    * You may assume that each input would have exactly one solution.
    * Given nums = [2, 7, 11, 15], target = 9,
    * Because nums[0] + nums[1] = 2 + 7 = 9,
    * return [0, 1].
    * */

    public static void main(String[] args){
        Solution so = new Solution();
        int[] nums = {0, 8, 1, 0};
        int target = 0;
        int[] num = so.twoSum(nums,target);
        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);
        }
    }

    public int[] twoSum(int[] nums,int target){
        Solution so = new Solution();
        int[] result = new int[2];
        for (int i = 0; i < nums.length ; i++) {
            int temp = so.findNum(nums,target-nums[i],i);
            if (temp != 0){
                result[0] = temp;
                result[1] = i;
            }
        }
        return result;
    }

    public int findNum(int[] nums,int tar,int index){
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != index && tar == nums[i]){
                flag = i;
            }
        }
        return flag;
    }
}
