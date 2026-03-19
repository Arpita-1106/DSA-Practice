/*
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum
Approach:
-Brute force
-hashmaps
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=1; i<nums.length; i++){
            for(int j =i; j<nums.length; j++){
                if(nums[j] + nums[j-i] == target){
                    return new int[]{j-i,j}; 
                }
            }
        }
        return new int[]{};

    }    
}

//using Hashmap

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>(); 

        for(int i =0; i < nums.length; i++){
        int element = nums[i];
        int more = target - nums[i];

        if(map.containsKey(more)){
            return new int[] {i , map.get(more)};
        }
        map.put(element , i);
        }
        return new int[] {};
    }
}
