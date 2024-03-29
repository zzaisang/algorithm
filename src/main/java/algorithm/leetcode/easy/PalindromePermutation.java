package main.java.algorithm.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/08/28
 */
public class PalindromePermutation {

    /**
     * Given a string s, return true if a permutation of the string could form a palindrome.
     *
     *
     * Input: s = "code"
     * Output: false
     *
     * Input: s = "aab"
     * Output: true
     *
     * Input: s = "carerac"
     * Output: true
     *
     * 1 <= s.length <= 5000
     * s consists of only lowercase English letters.
     * */

    public static void main(String[] args) {
        String s = "code";
        System.out.println(canPermutePalindromeUsingSet(s));
        System.out.println(canPermutePalindromeUsingArray(s));
    }

    public static boolean canPermutePalindromeUsingSet(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i ++){
            if(!set.add(s.charAt(i)))
                set.remove(s.charAt(i));
        }
        return set.size() <= 1;
    }

    public static boolean canPermutePalindromeUsingArray(String s) {
        int[] map = new int[128];
        for (int i = 0; i < s.length(); i ++){
            map[s.charAt(i)]++;
        }
        int count = 0;
        for ( int key = 0; key < map.length && count <= 1; key++){
            count += map[key] % 2;
        }
        return count <= 1;
    }
}
