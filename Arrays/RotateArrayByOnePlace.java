public class RotateArrayByOnePlace {
    public static void rotate(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[(i+(n-1))%n] = nums[i];
        }
        for(int i=0; i<n;i++){
            nums[i] = temp[i];
            System.out.print(nums[i] + " ");
        }

//        int n = nums.length;
//        int[] temp = new int[n];
//        for(int i=0; i<n; i++){
//            temp[(i+1))%n] = nums[i];
//        }
//        for(int i=0; i<n;i++){
//            nums[i] = temp[i];
//            System.out.print(nums[i] + " ");
//        }
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7,8,9};
        rotate(nums);
    }
}
