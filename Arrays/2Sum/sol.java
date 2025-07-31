import java.util.*;
public class sol {
    public static int[] twoSum(int[] nums, int target) {
        //using a hashmap
        //O(n)
        //calculating the complement for each index
        //putting comlplement and index in hashmap
        //if a complement is already present in the map, return the index
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

    public static void main(String args[]){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}
