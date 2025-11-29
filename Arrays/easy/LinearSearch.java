package Arrays.easy;

public class LinearSearch {
    public static void main(String[] args){
        int nums[] = {3,4,6,1,2,8,9};
        int k = 4;
        linearSearch(nums,k);
    }

    private static void linearSearch(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k){
                System.out.println("index "+ i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
