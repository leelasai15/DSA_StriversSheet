package Arrays.easy;

public class CheckIfArrayIsSorted {

    static void sorted(int arr[]){
        int i=0;
        while(i<arr.length-1){
            if(arr[i] < arr[i+1]){
                i++;
            }else{
                System.out.println("Not Sorted");
                return;
            }
        }
        System.out.println("Sorted");
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        sorted(arr);
    }
}
