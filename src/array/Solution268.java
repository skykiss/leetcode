package array;

/**
 * @Author: october
 * @Date: 2019/11/3 01:38
 * @Description:
 */
public class Solution268 {

    /**
     * 根据异或的结合律和异或相同的数为0
     * 先把所有的异或一遍 然后和下标异或一遍 最后的值结果
     */
//    class Solution {
//        public int missingNumber(int[] nums) {
//            int value = nums[0];
//            for (int i = 1; i < nums.length; i++) {
//                value ^= nums[i];
//            }
//            for (int i = 0; i <= nums.length ; i++) {
//                value ^= i;
//            }
//            return value;
//        }
//    }

    /**
     * 求和法  因为是连续的  计算出数组的总值  然后算出应当总值  做差
     */
    class Solution {
        public int missingNumber(int[] nums) {
            int value = 0;
            for (int i = 0; i < nums.length; i++) {
                value += nums[i];
                value -= i;
            }
            return nums.length - value;
        }
    }
}
