package array;

/**
 * @Author: october
 * @Date: 2019/11/2 19:18
 * @Description:
 */
public class Solution189 {



    /**
     * 把数组当作一个循环，使用取余,  使用count技术，当次数为数组长度的时候说明全部替换完，
     */
    class Solution {
        public void rotate(int[] nums, int k) {
            int divisor = nums.length;
            k = k % divisor;
            int count = 0;
            // 共需要执行三个轮回，即可把所有的数轮回
            for (int i = 0; count < nums.length; i++) {
                int current = i, temp, prev = nums[i];
                do {
                    int next = (current + k) % divisor;   // 计算出下一个位置
                    temp = nums[next]; // 把下一个值存起来
                    nums[next] = prev;   // 把当前值放入下一个位置
                    prev = temp;  // 更新当前值为下一个值
                    current = next;  // 更新下一个位置
                    count ++;  // 记录已经更新的值
                }while (current != i);
            }
        }
    }

}
