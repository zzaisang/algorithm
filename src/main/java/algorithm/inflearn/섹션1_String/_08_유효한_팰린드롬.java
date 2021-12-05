package main.java.algorithm.inflearn.섹션1_String;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/05
 */
public class _08_유효한_팰린드롬 {

    public static void main(String[] args) {
        _08_유효한_팰린드롬 T = new _08_유효한_팰린드롬();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reverseStr) ? "YES" : "NO";
    }

}