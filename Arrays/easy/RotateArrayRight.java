package Arrays.easy;

public class RotateArrayRight {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[(i+k)%n] = nums[i];
        }
        for(int i=0; i<n;i++){
            nums[i] = temp[i];
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6};
        int k = 3;
        rotate(nums,k);
    }
}
