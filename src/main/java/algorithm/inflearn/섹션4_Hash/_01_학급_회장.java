package main.java.algorithm.inflearn.섹션4_Hash;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/01/05
 */
public class _01_학급_회장 {

    public static void main(String[] args) {
        _01_학급_회장 T = new _01_학급_회장 ();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(T.solution(n,s));
    }

    public char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for(char x : map.keySet()){
            if(map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }

}