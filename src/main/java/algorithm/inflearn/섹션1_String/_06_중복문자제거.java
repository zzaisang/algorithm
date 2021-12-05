package main.java.algorithm.inflearn.섹션1_String;

import java.util.*;
/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/05
 */
public class _06_중복문자제거 {

    public static void main(String[] args) {
        _06_중복문자제거 T = new _06_중복문자제거();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(str.length() > 100){
            System.out.println("문자열의 길이는 100을 넘을 수 없습니다.");
        }else {
            System.out.println(T.solution(str));
        }
    }

    public String solution(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(i == str.indexOf(str.charAt(i))) sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
