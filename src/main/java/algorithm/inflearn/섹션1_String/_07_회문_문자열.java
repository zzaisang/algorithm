package main.java.algorithm.inflearn.섹션1_String;

import java.util.*;
/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/05
 */
public class _07_회문_문자열 {

    public static void main(String[] args) {
        _07_회문_문자열 T = new _07_회문_문자열();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }

    // StringBuilder.reverse()
    public String solution(String str){
        String s = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(s)? "YES" : "NO";
    }
}
