package Arrays.easy;
import java.util.*;

public class LongestSubArrayWIthSumK {
    public static int longestSubarray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int res = 0;
        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            if (map.containsKey(prefixSum - k)) {
                res = Math.max(res, i - map.get(prefixSum - k));
            }
            if (!map.containsKey(prefixSum - k)) {
                map.put(prefixSum, i);
            }
        }
        return res;
    }
    public static void main(String[] args){
        int nums[] = { 0, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println(longestSubarray(nums,k));
    }
}
