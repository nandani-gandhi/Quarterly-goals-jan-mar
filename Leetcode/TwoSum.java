/*Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

package Leetcode;

public class TwoSum {
    public int[] sum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == target- nums[i]) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TwoSum twoSum =new TwoSum();
        int[] input ={20, 30, 40, 89, 45, 76};
        int target = 60;
        int[] arr = twoSum.sum(input,target);
        for(int i =0 ;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
