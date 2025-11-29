package Arrays.easy;

public class MoveZerosToEnd {
    public static  void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int id = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                swap(nums, i, id);
                id++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args){
        int nums[] = {0,1,3,0,4,0,4};
        moveZeroes(nums);
    }
}
