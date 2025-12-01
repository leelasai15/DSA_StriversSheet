package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LeadersInAnArray {
    public List<Integer> leaders(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        int max_from_right = nums[n - 1];
        list.add(max_from_right);

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] >= max_from_right) {
                max_from_right = nums[i];
                list.add(max_from_right);
            }
        }

        Collections.reverse(list);

        return list;
    }
}

class Main {
    public static void main(String[] args) {
        LeadersInAnArray sol = new LeadersInAnArray();
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders1 = sol.leaders(arr1);
        System.out.println("Leaders in {16, 17, 4, 3, 5, 2}: " + leaders1);

        int[] arr2 = {10, 4, 2, 4, 0};
        List<Integer> leaders2 = sol.leaders(arr2);
        System.out.println("Leaders in {10, 4, 2, 4, 0}: " + leaders2);
    }
}