package Arrays.easy;

public class LargestElementInArray {

    static int largest(int arr[]){
        int res = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > res){
                res = arr[i];
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = {1, 6, 3, 9, 92, 58, 2, 683};
        System.out.println(largest(arr));
    }
}
