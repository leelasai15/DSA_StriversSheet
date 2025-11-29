package Arrays.easy;

public class RotateArrayLeft {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[(i+(n-1)-(k-1))%n] = nums[i];
        }
        for(int i=0; i<n;i++){
            nums[i] = temp[i];
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        rotate(nums,k);
    }
}
