package main.java.algorithm.inflearn.섹션1_String;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/05
 */
public class _09_숫자만_추출 {

    public static void main(String[] args) {
        _09_숫자만_추출 T = new _09_숫자만_추출();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    public int solution(String str) {
        String answer = "";
        char[] charArray = str.toCharArray();
        for(char n : charArray){
            if(n >= 48 && n <= 57){
                answer += n;
            }
        }
        return Integer.parseInt(answer);
    }

}