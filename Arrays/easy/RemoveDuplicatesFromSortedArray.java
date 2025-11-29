package Arrays.easy;

public class RemoveDuplicatesFromSortedArray {
    static int fun(int arr[]){
        int n = arr.length;

        int i=0,count=0;
        for(int j=1; j<n; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int arr[] = {0,0,1,1,1,2,2,2,3,3,4};
        System.out.println(fun(arr));
    }

}
