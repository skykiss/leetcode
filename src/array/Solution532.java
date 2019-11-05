package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: october
 * @Date: 2019/11/3 01:53
 * @Description:
 */
public class Solution532 {

    class Solution {
        public int findPairs(int[] nums, int k) {
            Arrays.sort(nums);
            int num = 0;
            for (int i = 0; i < nums.length-1; i++) {
                int j = i + 1;
                while(nums[j] - nums[i] <= k){
                    if (nums[j] - nums[i] == k) num++;
                    j++;
                }
            }
            return num;
        }
    }

}
