package Arrays.easy;

public class MaximumConsecutiveOnes {
    public static int fun(int nums[]){
        int n = nums.length;
        int maxCount = 0;
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
// Update maxCount before resetting count
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        // Final check for the last sequence
        return Math.max(maxCount, count);
    }
    public static void main(String[] args){
        int nums[] = {1,0,1,1,1,0,0,1,1};
        System.out.println(fun(nums));
    }
}
