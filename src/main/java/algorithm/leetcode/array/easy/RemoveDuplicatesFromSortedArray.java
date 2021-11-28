package main.java.algorithm.leetcode.array.easy;


/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/11/27
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args){

    }

    public static int sol(int[] nums){
        if(nums.length == 0) return 0;

        int res = 1;
        for(int i = 1; i < nums.length; i ++){
            if(nums[i] != nums[i-1]){
                nums[res] = nums[i];
                res++;
            }
        }

        return res;
    }

}
