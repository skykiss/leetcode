package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: october
 * @Date: 2019/11/2 21:01
 * @Description:
 */
public class Solution219 {

    /**
     * 使用HashSet 内部维护一个在k内置范围的set集合，当set值>k则移除一个元素，保证set中只有最近k个
     */
//    class Solution {
//        public boolean containsNearbyDuplicate(int[] nums, int k) {
//            Set<Integer> set = new HashSet<>();
//            for (int i = 0; i < nums.length; i++) {
//                if (set.contains(nums[i])){
//                    return true;
//                }
//                set.add(nums[i]);
//                if (set.size() > k){
//                    set.remove(nums[i-k]);
//                }
//            }
//            return false;
//        }
//    }

    /**
     * 使用hash记录元素位置
     */
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                Integer position = map.get(nums[i]);
                if (position != null ){
                    if (i - position <= k) return true;
                    else map.put(nums[i], i);
                }
                else map.put(nums[i], i);
            }
            return false;
        }
    }
}
