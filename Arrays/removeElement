/*
Problem: remove element
Link: https:https://leetcode.com/problems/remove-element
Approach:
-Two Pointers
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
        
    }
}
