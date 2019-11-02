package array;

/**
 * @Author: october
 * @Date: 2019/11/3 00:59
 * @Description:
 */
public class Solution41 {

    /**
     * 使用抽屉原理 把 n-x个不同元素放在n个抽屉（相同元素只能放在同一个抽屉）那么必定有空出来的抽屉
     */

    class Solution {
        public int firstMissingPositive(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > nums.length) nums[i] = -1;  // 超过数组长度的为无用值 置为负数
                while(nums[i] > 0  && nums[i] != nums[nums[i]-1]) swap(nums, i, nums[i]-1); // 交换位置
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= 0 || nums[i] != i+1) return i+1;   //  如果有空缺的就返回
            }
            return nums.length + 1;
        }

        void swap(int[] nums, int index1, int index2){
            if (nums[index1] != nums[index2]){
                // 使用异或来达到交换的目的 使用时候注意 千万要使用到相同的值 否则会为0
                nums[index1] = nums[index1] ^ nums[index2];
                nums[index2] = nums[index1] ^ nums[index2];
                nums[index1] = nums[index1] ^ nums[index2];
            }
        }
    }

}
