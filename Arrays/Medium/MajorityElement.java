package Arrays.Medium;

public class MajorityElement {
    public static int  majorityElement(int[] nums) {
        int freq = 1, ans = nums[0];

        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1] == ans){
                freq++;
            }else{
                freq--;
                if(freq == 0){
                    ans = nums[i+1];
                    freq++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,1,1,1,1,9,9};
        System.out.println(majorityElement(nums));
    }
}
