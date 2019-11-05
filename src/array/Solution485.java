package array;

/**
 * @Author: october
 * @Date: 2019/11/3 11:34
 * @Description:
 */
public class Solution485 {

    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0, sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1){
                    sum ++;
                }
                else {
                    if (sum > max) max = sum;
                    sum = 0;
                }
            }
            if (sum > max) max = sum;
            return max;
        }
    }

}
