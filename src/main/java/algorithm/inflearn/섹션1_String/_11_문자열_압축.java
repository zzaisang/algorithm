package main.java.algorithm.inflearn.섹션1_String;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/07
 */
public class _11_문자열_압축 {

    public static void main(String[] args) {
        _11_문자열_압축 T = new _11_문자열_압축();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        str += " ";
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int len = 1;

        for(int i = 0; i < charArray.length - 1; i++){
            if(charArray[i] == charArray[i + 1]){
                len++;
            }else {
                sb.append(charArray[i]);
                if(len > 1) sb.append(len);
                len = 1;
            }
        }
        return sb.toString();
    }

}