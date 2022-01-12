package main.java.algorithm.inflearn.섹션5_Stack_Queue;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/01/13
 */
public class _01_올바른_괄호 {

    /**
     * 설명
     *
     * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
     *
     * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
     *
     *
     * 입력
     * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
     *
     *
     * 출력
     * 첫 번째 줄에 YES, NO를 출력한다.
     *
     *
     * 예시 입력 1
     *
     * (()(()))(()
     * 예시 출력 1
     *
     * NO
     *
     * */
    public static void main(String[] args) {
        _01_올바른_괄호 T = new _01_올바른_괄호();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for(Character c : str.toCharArray()){
            if(c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

}