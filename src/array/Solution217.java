package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: october
 * @Date: 2019/11/2 11:45
 * @Description:
 * title: 217. 存在重复元素
 */
public class Solution217 {


    /**
     * 使用HashMap判断是否有重复值
     * 14 ms
     */
//    class Solution {
//        public boolean containsDuplicate(int[] nums) {
//            HashMap<Integer, Object> map = new HashMap<>();
//            for (int i = 0; i < nums.length; i++) {
//                if (map.get(nums[i]) == null) map.put(nums[i], 0);
//                else return true;
//            }
//            return false;
//        }
//    }

    /**
     * 使用set
     * 9ms
     * set比hash少进行一次操作
     */
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (!set.add(nums[i])) return true;
            }
            return false;
        }
    }

}
