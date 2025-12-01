package Arrays.Medium;
import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0)
            return 0;

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int curLen = 1;
                int ele = num;
                while(set.contains(ele+1)){
                    curLen++;
                    ele += 1;
                }
                longest = Math.max(curLen, longest);
            }
        }
        return longest;
    }
    public static void main(String[] args){
        int nums[] = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
