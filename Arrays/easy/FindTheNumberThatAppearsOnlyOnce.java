package Arrays.easy;

public class FindTheNumberThatAppearsOnlyOnce {
    public static int singleNumber(int[] nums) {
        int num = 0;
        for(int i=0; i<nums.length; i++){
            num = num ^ nums[i];
        }
        return num;
    }
    public static void main(String[] args){
        int nums[] = {1,2,2,3,3};
        System.out.println(singleNumber(nums));
    }
}
