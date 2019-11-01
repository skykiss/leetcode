/**
 * @Author: october
 * @Date: 2019/11/1 22:14
 * @Description:
 */
public class Solution88 {

    public static void main(String[] args) {
        Solution88 solution88 = new Solution88();
        Solution solution = solution88.new Solution();
        int[] nums1 = new int[] {2, 3, 3, 0, 0, 0};
        int[] nums2 = new int[] {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
    }

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int tail = m + n - 1;
            while (m !=0 && n != 0){
                 if (nums1[m-1] > nums2[n-1]){
                    nums1[tail--] = nums1[m-1];
                    m --;
                 }
                 else {
                     nums1[tail--] = nums2[n-1];
                     n --;
                 }
            }
            while (n != 0){   // m不等于0是不用处理的 因为本身就在nums1中
                nums1[tail--] = nums1[n-1];
                n --;
            }
        }
    }

}
