package main.java.algorithm.leetcode.easy;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021-02-23
 */
public class MaximumSubarray {

    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     *
     * Example 1:
     *
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     * Example 2:
     *
     * Input: nums = [1]
     * Output: 1
     * Example 3:
     *
     * Input: nums = [0]
     * Output: 0
     * Example 4:
     *
     * Input: nums = [-1]
     * Output: -1
     * Example 5:
     *
     * Input: nums = [-100000]
     * Output: -100000
     *
     *
     * Constraints:
     *
     * 1 <= nums.length <= 3 * 104
     * -105 <= nums[i] <= 105
     *
     *
     * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
     *
     * */

    public static void main(String[] args) {

        final MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] arr = {4,2,-7,1,8,6,-2};
        System.out.println(maximumSubarray.sol1(arr));

    }

    //greedy Algorithm
    public int sol1(int[] nums){
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for(int i = 1; i < nums.length; ++i){
            maxEndingHere = Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }


}
