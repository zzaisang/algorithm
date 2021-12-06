package main.java.algorithm.inflearn.섹션1_String;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/07
 */
public class _12_암호 {

    public static void main(String[] args) {
        _12_암호 T = new _12_암호();
        Scanner sc = new Scanner(System.in);
        Integer len = Integer.parseInt(sc.next());
        String str = sc.next();
        System.out.println(T.solution(len,str));
    }

    public String solution(Integer len, String str) {
        StringBuilder sb = new StringBuilder();
        int x = 0;
        for(int i = 0; i < len; i++){
            int answerChar = Integer.parseInt(str.substring(x, x + 7).replace("#", "1").replace("*", "0"), 2);
            sb.append((char) answerChar);
            x += 7;
        }
        return sb.toString();
    }

}