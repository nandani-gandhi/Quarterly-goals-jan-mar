/*
Given a non-empty array of integers nums,
every element appears twice except for one. Find that single one.
Input: nums = [4,1,2,1,2]
Output: 4
*/
import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(!set.add(i))
            {
                set.remove(i);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }

    public static void main(String[] args) {
        int[] numbers  = {4,1,2,1,2};
        System.out.println("Number Which Not comes twice in array is : "+singleNumber(numbers));
    }
}
