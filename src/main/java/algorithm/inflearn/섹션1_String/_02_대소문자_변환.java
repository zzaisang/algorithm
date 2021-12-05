package main.java.algorithm.inflearn.섹션1_String;

import java.util.Scanner;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/05
 */
public class _02_대소문자_변환 {

    public static void main(String[] args) {
        _02_대소문자_변환 T = new _02_대소문자_변환();
        final Scanner kb = new Scanner(System.in);
        final String str = kb.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str){
        String answer = "";
        for(char n : str.toCharArray()){
            if(Character.isLowerCase(n)){
                answer += Character.toUpperCase(n);
            }else {
                answer += Character.toLowerCase(n);
            }
        }

        //ASCII NUMBER 방법
//        for(char n : str.toCharArray()){
//            if(n >= 97 && n <= 122){
//                answer += (char) (n - 32);
//            }else {
//                answer += (char) (n + 32);
//            }
//        }
        return answer;
    }
}
