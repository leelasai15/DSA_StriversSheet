package Arrays.Medium;

public class RearrageElementsBySign {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int neg = 1;

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                arr[neg] = nums[i];
                neg += 2;
            } else {
                arr[pos] = nums[i];
                pos += 2;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int nums[] = {3,1,-2,-5,2,-4};
        System.out.println(rearrangeArray(nums));
    }
}
