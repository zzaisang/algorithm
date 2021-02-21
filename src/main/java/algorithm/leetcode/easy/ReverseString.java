package main.java.algorithm.leetcode.easy;


/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021-02-21
 */
public class ReverseString {

    /**
     * Write a function that reverses a string. The input string is given as an array of characters char[].
     *
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     *
     * You may assume all the characters consist of printable ascii characters.
     * */
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        //sol1
        /*
        final char[] chars = sol1(s);
        System.arraycopy(chars,0,s,0,chars.length);
        */

        //sol2
        /*
        sol2(s);
        * */

        //sol3

        sol3(s,0,s.length-1);


        System.out.println(s);

    }

    //이건 새로운 배열 after 배열 교체
    public static char[] sol1(char[] s){

        final int length = s.length - 1;
        char[] hi = new char[s.length];
        for (int i = 0; i <= length; i ++){
            hi[i] = s[length - i];
        }
        return hi;
    }

    //기존 배열을 reverse while문 활용
    public static void sol2(char[] s){
        int left = 0, right = s.length - 1;
        while (left < right){
            char temp = s[left];
            s[left++] = s[right];
            s[right] = temp;
        }
    }

    //재귀 호출을 통한 swap
    public static void sol3(char[]s , int left, int right){
        if (left >= right) return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;
        sol3(s,left,right);
    }


}
