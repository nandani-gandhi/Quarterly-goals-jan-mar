/*Given an integer array nums and an integer val,
 remove all occurrences of val in nums in-place.
The relative order of the elements may be changed.
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]*/


package Leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveElement removeElement =new RemoveElement();
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = 5;
        n = removeElement.removeElement(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
