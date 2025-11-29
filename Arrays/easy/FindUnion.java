package Arrays.easy;
import java.util.*;
public class FindUnion {

    public static void unionArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int j=0; j<nums2.length; j++){
            set.add(nums2[j]);
        }

        int[] arr = new int[set.size()];
        int index = 0;
        for (int element : set) {
            arr[index++] = element;
        }

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int nums1[] = {1, 2, 3, 4, 5};
        int nums2[] = {1, 2, 7};

        unionArray(nums1,nums2);

    }
}
