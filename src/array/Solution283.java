package array;

/**
 * @Author: october
 * @Date: 2019/11/2 22:30
 * @Description:
 * title: 283. 移动零
 */
public class Solution283 {

    /**
     * 执行用时 :0 ms, 在所有 java 提交中击败了 100.00% 的用户
     * 内存消耗 :37.9 MB, 在所有 java 提交中击败了 95.11% 的用户
     *  先找到第一个0 因为在此以后的都要移动，再次之前的不用动。
     *  使用两个标记，一个慢标记指向实际数组要填充的位置， 另外一个快标记寻找下一个要移动的位置，把快标记的值移动到漫标记，慢标记
     *  向后移动一个，快标记的置为0，然后继续寻找下一个需要移动的
     */
    class Solution {
        public void moveZeroes(int[] nums) {
            int a = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0){
                    a = i;
                    break;
                }
            }
            if (a == -1) return;
            for (int i = a+1; i < nums.length; i++) {
                if (nums[i] != 0){
                    nums[a++] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }

}
