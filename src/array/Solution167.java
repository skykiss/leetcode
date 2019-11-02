package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: october
 * @Date: 2019/11/1 23:02
 * @Description:
 */
public class Solution167 {

    class Solution {
        /***
         * 从头和尾进行寻找，头尾相加大于目标值则尾向前移动 ， 头尾相加小于目标值头则向后移动 直到找到目标
         * 头向后移动，是因为和小了，则尾巴向前移动则绝对不会与头移动之前的值相加等于目标值
         */
        public int[] twoSum(int[] numbers, int target) {
            int head = 0, tail = numbers.length - 1;
            while (head != tail){
                int sum = numbers[head] + numbers[tail];
                if (sum > target) tail --;
                else if(sum < target) head ++;
                else return new int[] {head+1, tail+1};
            }
            return new int[]{0};
        }
    }

}
