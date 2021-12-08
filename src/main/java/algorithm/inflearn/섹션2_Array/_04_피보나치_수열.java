package main.java.algorithm.inflearn.섹션2_Array;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/08
 */
public class _04_피보나치_수열 {

    public static void main(String[] args) {
        _04_피보나치_수열 T = new _04_피보나치_수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i : T.solution(n)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i = 2; i < n; i++){
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;
    }

}