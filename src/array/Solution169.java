package array;

import java.util.HashMap;

/**
 * @Author: october
 * @Date: 2019/11/1 23:33
 * @Description:
 */
public class Solution169 {

    /**
     * 使用摩尔投票法，摩尔投票法有人叫做多数投票法。
     * 算法原理： 每次从数组中找出一对不同的元素，将他们从数组中删除，直到遍历完整个数组，由于已经存在一个超过一半的数组，
     * 无论如何抵消总是会剩余至少一个数在数组中
     * 此算法可以推广到 超过1/n则是每次选择n个
     */

    class Solution {
        public int majorityElement(int[] nums) {
            int votes = 1, candidate = nums[0];   // 设置候选人为第一个  票数为1
            for (int i = 1; i < nums.length; i++) {
                if (votes == 0){
                    votes = 1;
                    candidate = nums[i];
                }
                else if(nums[i] == candidate) votes++;
                else votes --;
            }
            return candidate;
        }
    }
}
