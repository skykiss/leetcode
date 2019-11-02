package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: october
 * @Date: 2019/11/2 22:56
 * @Description:
 */
public class Solution488 {

    /**
     * 骚操作解法  时间复杂度 2n
     * 把值对应的下标加上数组的长度  然后判断最后哪个的值小于数组长度的值 就表示不存在
     */

//    class Solution {
//        public List<Integer> findDisappearedNumbers(int[] nums) {
//            ArrayList<Integer> list = new ArrayList<>();
//            for (int i = 0; i < nums.length; i++) {
//                nums[(nums[i]-1) % nums.length] += nums.length;
//            }
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] <= nums.length){
//                    list.add(i+1);
//                }
//            }
//            return list;
//        }
//    }

    /**
     * 交换位置 直到找到位置
     */
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                while (nums[i] != nums[nums[i]-1]){
                    swap(nums, i, nums[i]-1);
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i+1) list.add(i+1);  // 判断值是否在对应位置
            }
            return list;
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
