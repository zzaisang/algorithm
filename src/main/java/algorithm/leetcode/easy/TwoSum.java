package main.java.algorithm.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021-02-16
 */
public class TwoSum {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     * */

    public static void main(String[] args) {

        final int[] nums = {1, 1};
        int target = 2;
        sol3(nums,target);



    }

    //무차별 대입 2중 for문
    public static int[] sol1(int[] nums, int target){
        final int length = nums.length;
        for(int i = 0; i < length; i ++){
            for(int j = 0; j < length; j ++){
                if(nums[j] == target - nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //key,value 쌍으로 맵에 다 넣고 for문으로 Key값 존재 유무 확인
    public static int[] sol2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //key,value 쌍으로 맵에 넣으면서 key값이 존재하는지 확인
    public static int[] sol3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
