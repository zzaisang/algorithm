package main.java.algorithm.inflearn.섹션4_Hash;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/01/05
 */
public class _02_아나그램 {

    public static void main(String[] args) {
        _02_아나그램 T = new _02_아나그램();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(T.solution(a,b));
    }

    public String solution(String a, String b) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char x : b.toCharArray()){
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x,map.get(x) - 1);
        }
        return answer;
    }

}