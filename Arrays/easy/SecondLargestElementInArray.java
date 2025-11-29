package Arrays.easy;

public class SecondLargestElementInArray {
    static int secLargest(int arr[]){
        int large = arr[0],secLarge = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > large && arr[i] > secLarge){
                secLarge = large;
                large = arr[i];
            }else if(arr[i] > secLarge){
                secLarge = arr[i];
            }
        }
        return secLarge;
    }
    public static void main(String[] args){
        int arr[] = {1, 6, 3, 9, 92, 58, 2, 683};
        System.out.println(secLargest(arr));
    }
}
