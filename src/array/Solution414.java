package array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: october
 * @Date: 2019/11/2 21:26
 * @Description:
 */
public class Solution414 {

    public static void main(String[] args) {
        System.out.println(3^0);
    }

    /**
     * 速度很慢
     */
//    class Solution {
//        public int thirdMax(int[] nums) {
//            TreeSet<Integer> set = new TreeSet<>();
//            for (int num : nums) {
//                set.add(num);
//                if (set.size() > 3) {
//                    set.pollFirst();
//                }
//            }
//            if (set.size() < 3) return set.last();
//            else return set.first();
//        }
//    }

    /**
     * 维护最小值的三个数
     */
    class Solution {
        public int thirdMax(int[] nums) {
            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, value;
            boolean flag = false; // 因为包含int的最小值，所以用个flag来维护
            for (int i = 0; i < nums.length; i++) {
                value = nums[i];
                if (value == Integer.MIN_VALUE) flag = true;
                if (max1 < value) {
                    max3 = max2;
                    max2 = max1;
                    max1 = value;
                }
                else if(value > max2 && max1 != value){
                    max3 = max2;
                    max2 = value;
                }
                else if(value > max3 && value != max2 && value!= max1){
                    max3 = value;
                }
            }
            return max3 == Integer.MIN_VALUE ? (max2 > Integer.MIN_VALUE && flag ? max3 : max1) :max3;
        }
    }

}
